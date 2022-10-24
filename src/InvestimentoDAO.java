import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class InvestimentoDAO {
    private Connection conexao;

    public void insert(Investimento investimento, int id_usuario){
        PreparedStatement stmt = null;

        try{
            conexao = Connector.conectar();
            String sql = "INSERT INTO T_INVESTIMENTO (DS_INVESTIMENTO, VLR_INVESTIMENTO, DT_INVESTIMENTO, ID_USUARIO,\n" +
                    "DT_VENCIMENTO, DT_RESGATE, ) VALUES(?,?,?,?,?,?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, investimento.getDsInvestimento());
            stmt.setDouble(2, investimento.getVlrInvestimento());
            Date dataInvestimento = Date.valueOf(investimento.getDtInvestimento());
            stmt.setDate(3, dataInvestimento);
            stmt.setInt(4, id_usuario);
            Date dataVencimento = Date.valueOf(investimento.getDtVencimento());
            stmt.setDate(5, dataVencimento);
            Date dataResgate = Calendar.valueOf(investimento.getDtResgate());
            stmt.setDate(6, dataResgate);

            stmt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conexao.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public List<Investimento> getAll(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Investimento> lista = new ArrayList<Investimento>();

        try{
            conexao = Connector.conectar();

            String sql = "SELECT * FROM T_INVESTIMENTO";
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();


            while (rs.next()){
            int codigo = rs.getInt("id_Investimento");
            String dsinvestimento = rs.getString("DS_INVESTIMENTO");
            double vlrInvestimento = rs.getDouble("vlrInvestimento");

            java.sql.Date dt_Investimento = rs.getDate("dtInvestimento");
            Calendar dtInvestimento = Calendar.getInstance();
            dtInvestimento.setTimeInMillis(dt_Investimento.getTime());

            java.sql.Date dt_Vencimento = rs.getDate("dtVencimento");
            Calendar dtVencimento = Calendar.getInstance();
            dtVencimento.setTimeInMillis(dt_Vencimento.getTime());

            java.sql.Date dt_Resgate = rs.getDate("dtResgate");
            Calendar dtResgate = Calendar.getInstance();
            dtResgate.setTimeInMillis(dt_Resgate.getTime());

            int id_usuario = rs.getInt("id_usuario");

            Investimento investimento = new Investimento(codigo, dsinvestimento, vlrInvestimento, dtInvestimento, dtVencimento, dtResgate, id_usuario);
            lista.add(investimento);
            }


        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                rs.close();
                conexao.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        return lista;
    }
}
