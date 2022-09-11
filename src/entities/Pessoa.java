package entities;

import java.util.Calendar;

public class Pessoa {
    Calendar calendar = Calendar.getInstance();
    private final String nome;
    private final double altura;
    private final int anoDeNascimento;

    public Pessoa(String nome, double altura, int anoDeNascimento) {
        this.nome = nome;
        this.altura = altura;
        this.anoDeNascimento = anoDeNascimento;
    }

    public int getIdade() {
        return calendar.get(Calendar.YEAR) - anoDeNascimento;
    }

    public String toString() {
        return "\nNome: " + nome + "\nAltura: " + String.format("%.2f", altura) +  "\nAno de nascimento: " + anoDeNascimento + "\nIdade: " + getIdade();
    }
}