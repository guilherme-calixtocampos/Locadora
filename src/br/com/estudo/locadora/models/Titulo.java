package br.com.estudo.locadora.models;

public class Titulo {
    private String nome;
    private int avaliacao;
    private int genero;
    private int idadePermitida;
    private double preco;
    private boolean status;
    private String diretor;

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public int getIdadePermitida() {
        return idadePermitida;
    }

    public void setIdadePermitida(int idadePermitida) {
        this.idadePermitida = idadePermitida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String exibeFicha() {
        return "Nome: " + this.nome +
                "\nIdade mínima: " + this.idadePermitida +
                "\nValor: R$" + this.preco +
                "\nIdade permitida: +" +this.idadePermitida +
                "\nStatus: "+ this.status;
    }


}
