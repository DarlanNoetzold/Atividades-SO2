/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author 20201PF.CC0149
 */
public class Subtracao extends Thread{
    
    private int valor1;
    private int valor2;
    
    public Subtracao(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    @Override
    public void run(){
        try {
            System.out.println("A Subtracao eh: " + (valor1-valor2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
    
    
    
}
