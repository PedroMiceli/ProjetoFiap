import java.time.LocalDate;

public class Investimento {
    private int idInvestimento;
    private String dsInvestimento;
    private double vlrInvestimento;
    private LocalDate dtInvestimento;
    private LocalDate dtVencimento;
    private LocalDate dtResgate;
    private int id_usuario;

    public Investimento(int idInvestimento, String dsInvestimento, double vlrInvestimento, LocalDate dtInvestimento, LocalDate dtVencimento, LocalDate dtResgate, int id_usuario) {
        this.idInvestimento = idInvestimento;
        this.dsInvestimento = dsInvestimento;
        this.vlrInvestimento = vlrInvestimento;
        this.dtInvestimento = dtInvestimento;
        this.dtVencimento = dtVencimento;
        this.dtResgate = dtResgate;
        this.id_usuario = id_usuario;
    }

    public int getIdInvestimento() {
        return idInvestimento;
    }

    public void setIdInvestimento(int idInvestimento) {
        this.idInvestimento = idInvestimento;
    }

    public String getDsInvestimento() {
        return dsInvestimento;
    }

    public void setDsInvestimento(String dsInvestimento) {
        this.dsInvestimento = dsInvestimento;
    }

    public double getVlrInvestimento() {
        return vlrInvestimento;
    }

    public void setVlrInvestimento(double vlrInvestimento) {
        this.vlrInvestimento = vlrInvestimento;
    }

    public LocalDate getDtInvestimento() {
        return dtInvestimento;
    }

    public void setDtInvestimento(LocalDate dtInvestimento) {
        this.dtInvestimento = dtInvestimento;
    }

    public LocalDate getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(LocalDate dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public LocalDate getDtResgate() {
        return dtResgate;
    }

    public void setDtResgate(LocalDate dtResgate) {
        this.dtResgate = dtResgate;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
}
