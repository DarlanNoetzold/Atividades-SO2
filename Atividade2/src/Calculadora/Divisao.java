/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author 20201PF.CC0149
 */
public class Divisao extends Thread{
    
    private double valor1;
    private double valor2;
    
    public Divisao(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    @Override
    public void run(){
        try {
            System.out.println("A divisao eh: " + valor1/valor2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
    
    
    
}
