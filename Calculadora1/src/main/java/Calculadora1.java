/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * Eu Melissa Martins dos Santos, estou desenvolvendo um trabalho em java que exerce a função de uma calculadora.
 */

        
public class Calculadora1 {
    public static void main(String[] args) {
        //definição de dois numeros
        double num1 = 7.6;
        double num2 = 3.1;
        
        //Realizando operações matemáticas
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 != 0 ? num1 / num2 : Double.NaN;
        double resto = num1 % num2;
        
        //exibindoos resultados
        System.out.println("Resultado das operações:");
        System.out.println("Soma:" + soma);
        System.out.println("Subtração:" + subtracao);
        System.out.println("Multiplicação:" + multiplicacao);
        System.out.println("Divisão:" + (num2 != 0 ? divisao: "Indefinido (divisão por zero)"));
        System.out.println("Resto da divisão:" + resto);
        
                
        
        
        
    }
    
}
