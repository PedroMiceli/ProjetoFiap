import java.time.LocalDate;
import java.time.LocalDateTime;

public class LembreteReceita extends Lembrete {

    double valorDestaReceita;
    public LembreteReceita(int idLembrete,double valorDestaReceita, LocalDate dataLembrete, LocalDateTime horaLembrete, String descriçãoLembrete, String tipoLembrete) {
        super(idLembrete, dataLembrete, horaLembrete, descriçãoLembrete, tipoLembrete);
    }
    public void EditarDescrição(String novaDescricao){
        this.setDescricaoLembrete(novaDescricao);
    }


}