/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Primos;

/**
 *
 * @author 20201PF.CC0149
 */
public class Primos extends Thread {
    
    private int valor;

    public Primos(int valor) {
        this.valor = valor;
    }
  
    @Override
    public void run() {
        try {
            for(int j = valor-1000; j<valor;j++){
                int cont=0;
                for(int i = 1; i < j; i++){
                    if(j % i == 0){
                        cont++;
                    }
                }
                if(cont <= 1){
                    System.out.println(getName() + " Primo: " + j);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    
}
