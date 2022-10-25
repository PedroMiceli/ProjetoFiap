import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        DateFormat f = DateFormat.getDateInstance();

        Date data2 = f.parse("12/01/1995");


        Investimento investimento = new Investimento(1,data2,1200,);

        InvestimentoDAO investimentoDAO = new InvestimentoDAO();
        investimentoDAO.insert();
    }



}