/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bigodudak
 */
public class Pessoa {
 private String nome;
 private String sobrenome;
 private int idade;
 private int peso;
 private int altura;
 private int IMC;
 
 public Pessoa (String nome,String sobrenome,int idade,int peso,int altura,int IMC) {
     this.nome = nome;
     this.sobrenome = sobrenome;
     this.idade = idade;
     this.peso = peso;
     this.altura = altura;
             
 }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return the IMC
     */
    public int getIMC() {
        return IMC;
    }

    /**
     * @param IMC the IMC to set
     */
    public void setIMC(int IMC) {
        this.IMC = IMC;
    }

    public void InformaObesidade (){
        double IMC = peso / (altura * altura);
        if (IMC < 18.5 ){
        System.out.println("abaixo do peso");
        } else if (IMC >= 18.5 && IMC <  24.9){
            System.out.println("peso normal");
        }else if (IMC >=25 && IMC < 29.9){
            System.out.println("sobrepeso");
        }else if (IMC >=30 && IMC < 34.9){
            System.out.println("obesidade grau 1");
        }else if (IMC >=35 && IMC < 39.9){
            System.out.println("obesidade grau 2");
        }else {
            System.out.println("obesidade grau 3");

    }
 }
}

