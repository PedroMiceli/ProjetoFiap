import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    private Connection conexao;

    public void get(Usuario usuario){
        PreparedStatement stmt = null;

        try{
            conexao = Connector.conectar();
            String sql = "SELECT * FROM T_USUARIO WHERE ID_USUARIO = ?";
            stmt.setInt(1, usuario.getId_usuario());
            stmt = conexao.prepareStatement(sql);

            stmt.executeUpdate();
        }catch (SQLException e){
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

}
