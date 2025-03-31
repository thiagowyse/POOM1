public class Hospede extends  Pessoa {
    private String endereco;
    private String documento;

    public Hospede(String nome, String endereco, String documento) {
        super(nome);
        this.endereco = endereco;
        this.documento = documento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

}
