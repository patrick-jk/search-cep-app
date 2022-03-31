package br.com.local.myappviacepapi;

public class CEP {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    public CEP() {
    }

    public CEP(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    @Override
    public String toString() {
        if (getComplemento().isEmpty()) {
            return "CEP: " + getCep()
                    + "\nRua: " + getLogradouro()
                    + "\nBairro: " + getBairro()
                    + "\nCidade: " + getLocalidade()
                    + "\nEstado: " + getUf();
        }
        return "CEP: " + getCep()
                + "\nRua: " + getLogradouro()
                + "\nComplemento: " + getComplemento()
                + "\nBairro: " + getBairro()
                + "\nCidade: " + getLocalidade()
                + "\nEstado: " + getUf();
    }
}
