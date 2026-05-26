/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista5;

/**
 *
 * @author Bigodudak
 */
public class Lista5 {

    /**
     * @param args the command line arguments
     */
   public class Pessoa {

    public String nome;
    public String sobrenome;
    public int idade;
    public double altura;
    public double peso;

    public double calcularIMC() {
        if (altura <= 0) return 0;
        return peso / (altura * altura);
    }

    public String obterFaixaIMC() {
        double imc = calcularIMC();

        if (imc <= 18.5) {
            return "Abaixo do peso normal";
        } else if (imc <= 25) {
            return "Peso normal";
        } else if (imc <= 30) {
            return "Acima do peso normal";
        } else {
            return "Obesidade";
        }
    }

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public static void main(String[] args) {

        Pessoa p = new Pessoa();

        p.nome = "João";
        p.sobrenome = "Silva";
        p.altura = 1.75;
        p.peso = 70;

        System.out.println(p.getNomeCompleto());
        System.out.println("IMC: " + p.calcularIMC());
        System.out.println(p.obterFaixaIMC());
    }
}
}