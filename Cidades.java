import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

  public class Cidades {
    private String nome;
    private int identificador;
    private int quantidadeVeiculos;
    private int numeroAcidentes;

    public Cidades(String nome, int identificador, int quantidadeVeiculos, int numeroAcidentes) {
        this.nome = nome;
        this.identificador = identificador;
        this.quantidadeVeiculos = quantidadeVeiculos;
        this.numeroAcidentes = numeroAcidentes;
    }

    public String getNome() {
        return nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getQuantidadeVeiculos() {
        return quantidadeVeiculos;
    }

    public int getNumeroAcidentes() {
        return numeroAcidentes;
    }

    public double calcularMediaAcidentes() {
        return (double) numeroAcidentes / quantidadeVeiculos;
    }
}

