package model;

import java.time.LocalDate;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String cnpj, String razaoSocial, LocalDate dataCadastro) {
        super(dataCadastro);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    // getters e setters

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
