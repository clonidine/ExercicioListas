import entities.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Quantas pessoas você quer registrar? ");
        int capacidade = sc.nextInt();

        for (int i = 0; i < capacidade; i++) {
            sc.nextLine();

            System.out.print("\nNome: ");
            String nome = sc.nextLine();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            System.out.print("Ano de nascimento: ");
            int anoDeNascimento = sc.nextInt();

            Pessoa pessoa = new Pessoa(nome, altura, anoDeNascimento);
            pessoas.add(pessoa);
        }

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
