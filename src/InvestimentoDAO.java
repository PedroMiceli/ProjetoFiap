import java.sql.*;

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
            Date dataResgate = Date.valueOf(investimento.getDtResgate());
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

    public void getAll(int id_usuario){
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try{
            conexao = Connector.conectar();

            String sql = "SELECT * FROM T_INVESTIMENTO WHERE ID_USUARIO = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id_usuario);
            rs = stmt.executeQuery();

            while (rs.next()){
            int codigo = rs.getInt("id_investimento");


                investimento = new Investimento();

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
        return ;

    }
}
