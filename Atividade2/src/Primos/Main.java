/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Primos;

/**
 *
 * @author 20201PF.CC0149
 */
public class Main {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++){
            Primos pr = new Primos(i*1000);
            pr.start();    
        }
        
        
    }
}
