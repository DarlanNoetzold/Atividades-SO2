/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author 20201PF.CC0149
 */
public class Main {
    
    public static void main(String[] args) {
        Soma soma = new Soma(8, 5);
        soma.start();
        Subtracao subtracao = new Subtracao(8, 5);
        subtracao.start();
        Multiplicacao multiplicacao = new Multiplicacao(8, 5);
        multiplicacao.start();
        Divisao divisao = new Divisao(8, 5);
        divisao.start();
    }
    
}
