import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {

    public static Connection conectar(){
        Connection conexao = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conexao = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","OPS$XXXX","XXXXX");
        } catch (Exception e){
            e.printStackTrace();
        }
        return conexao;
    }
}
