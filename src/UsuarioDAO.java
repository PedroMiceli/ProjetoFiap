import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class UsuarioDAO {

    private Connection conexao;

    public void insert(Usuario usuario){
        PreparedStatement stmt = null;
        try{
            conexao = Connector.conectar();
            String sql = "INSERT";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1,usuario.getId_usuario());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Usuario get(int id_usuario) {
        PreparedStatement stmt = null;
        ResultSet rs = null;


        Usuario usuario = null;
        try {
            conexao = Connector.conectar();
            String sql = "SELECT * FROM T_USUARIO WHERE ID_USUARIO = ?";
            stmt.setInt(1, id_usuario);
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            int id = rs.getInt("ID_USUARIO");
            String nmusuario = rs.getString("NM_USUARIO");
            String dsemail = rs.getString("DS_EMAIL");
            java.sql.Date dt_nascimento = rs.getDate("DT_NASCIMENTO");
            String senha = rs.getString("SENHA");
            int nmrcelular = rs.getInt("NMR_CELULAR");
            String cpfusuario = rs.getString("CPF_USUARIO");


            usuario = new Usuario(id, nmusuario, dsemail, dt_nascimento, senha, nmrcelular, cpfusuario);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return usuario;
    }

    public List<Usuario> getAll(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            conexao = Connector.conectar();
            String sql = "";
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()){

                int id_usuario = rs.getInt("id_usuario");
                String nm_usuario = rs.getString("nm_usuario");
                String ds_email = rs.getString("ds_email");
                Date dt_nascimento = rs.getDate("dt_nascimento");
                String senha = rs.getString("senha");
                int nmr_celular = rs.getInt("nmr_celular");
                String cpf_usuario = rs.getString("cpf_usuario");

                Usuario usuario = new Usuario(id_usuario,nm_usuario,ds_email, dt_nascimento,senha,nmr_celular,cpf_usuario);
                usuarios.add(usuario);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return usuarios;
    }

}
