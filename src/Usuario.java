import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Usuario {
    private int id_usuario;
    private String nm_usuario;
    private String ds_email;
    private String dt_nascimento;
    private String senha;
    private int nmr_celular;
    private String cpf_usuario;

    public Usuario(int id_usuario, String nm_usuario, String ds_email, String dt_nascimento, String senha, int nmr_celular, String cpf_usuario) {
        this.id_usuario = id_usuario;
        this.nm_usuario = nm_usuario;
        this.ds_email = ds_email;
        this.dt_nascimento = dt_nascimento;
        this.senha = senha;
        this.nmr_celular = nmr_celular;
        this.cpf_usuario = cpf_usuario;
    }


    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNm_usuario() {
        return nm_usuario;
    }

    public void setNm_usuario(String nm_usuario) {
        this.nm_usuario = nm_usuario;
    }

    public String getDs_email() {
        return ds_email;
    }

    public void setDs_email(String ds_email) {
        this.ds_email = ds_email;
    }

    public String getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(String dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNmr_celular() {
        return nmr_celular;
    }

    public void setNmr_celular(int nmr_celular) {
        this.nmr_celular = nmr_celular;
    }

    public String getCpf_usuario() {
        return cpf_usuario;
    }

    public void setCpf_usuario(String cpf_usuario) {
        this.cpf_usuario = cpf_usuario;
    }
}
