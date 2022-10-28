import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        long dtinvestimento = conversaodedatas("2014/10/29 18:10:45");

        long  dtvencimento = conversaodedatas("2019/10/29 18:10:45");

        long dataresgate = conversaodedatas("2020/10/29 18:10:45");

        Investimento investimento = new Investimento(1, "SEGUNDO TESTE", 1000, new Date(dtinvestimento), new Date(dtvencimento), new Date(dataresgate), 1);

        InvestimentoDAO investimentoDAO = new InvestimentoDAO();
        investimentoDAO.Insert(investimento);

        var listaInvestimento = investimentoDAO.getAll();

        System.out.println(listaInvestimento);
    }


    public static long conversaodedatas(String data) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        long datatraduzida = 0;
        try {
            Date datacomparser = sdf.parse(data);
            datatraduzida = datacomparser.getTime();

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return datatraduzida;
    }

}