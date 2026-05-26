/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bigodudak
 */
import java.util.Scanner;

public class questao2 {

    String nome;
    int idade;

    double coragem;
    double inteligencia;
    double ambicao;
    double lealdade;

    // atributos extras usados nas fórmulas
    double estrategia;
    double criatividade;

    String casa;

    // Método para calcular a casa
    public void calcularCasa() {

        double grifinoria = (2 * coragem) + lealdade;
        double sonserina = (2 * ambicao) + estrategia;
        double corvinal = (2 * inteligencia) + criatividade;
        double lufalufa = ((2 * lealdade) + coragem) / 3;

        double maior = grifinoria;
        casa = "Grifinória";

        if (sonserina > maior) {
            maior = sonserina;
            casa = "Sonserina";
        }

        if (corvinal > maior) {
            maior = corvinal;
            casa = "Corvinal";
        }

        if (lufalufa > maior) {
            maior = lufalufa;
            casa = "Lufa-Lufa";
        }
    }

    // Método para exibir informações
    public void exibirInformacoes() {

        System.out.println("\n===== DADOS DO ALUNO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        System.out.println("Coragem: " + coragem);
        System.out.println("Inteligência: " + inteligencia);
        System.out.println("Ambição: " + ambicao);
        System.out.println("Lealdade: " + lealdade);
        System.out.println("Estratégia: " + estrategia);
        System.out.println("Criatividade: " + criatividade);

        System.out.println("Casa escolhida: " + casa);
        System.out.println("==========================");
    }

    // Método principal
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {

            Aluno aluno = new Aluno();

            System.out.print("Nome do aluno: ");
            aluno.nome = sc.nextLine();

            System.out.print("Idade: ");
            aluno.idade = sc.nextInt();

            System.out.print("Coragem: ");
            aluno.coragem = sc.nextDouble();

            System.out.print("Inteligência: ");
            aluno.inteligencia = sc.nextDouble();

            System.out.print("Ambição: ");
            aluno.ambicao = sc.nextDouble();

            System.out.print("Lealdade: ");
            aluno.lealdade = sc.nextDouble();

            System.out.print("Estratégia: ");
            aluno.estrategia = sc.nextDouble();

            System.out.print("Criatividade: ");
            aluno.criatividade = sc.nextDouble();

            sc.nextLine(); // limpar buffer

            aluno.calcularCasa();

            aluno.exibirInformacoes();

            System.out.print("\nDeseja cadastrar outro aluno? (s/n): ");
            continuar = sc.nextLine();
        }

        System.out.println("\nPrograma encerrado!");

        sc.close();
    }
}