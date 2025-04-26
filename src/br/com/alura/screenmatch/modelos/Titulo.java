package br.com.alura.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLançamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;


    public Titulo(String nome, int anoDeLançamento) {
        this.nome = nome;
        this.anoDeLançamento = anoDeLançamento;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLançamento() {
        return anoDeLançamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLançamento(int anoDeLançamento) {
        this.anoDeLançamento = anoDeLançamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //Método
    public void exibeFichaTecnicaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de laçamento: " + anoDeLançamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {return somaDasAvaliacoes / totalDeAvaliacoes; }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", anoDeLançamento=" + anoDeLançamento +
                '}';
    }
}
