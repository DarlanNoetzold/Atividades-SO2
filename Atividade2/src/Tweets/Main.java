/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tweets;

/**
 *
 * @author 20201PF.CC0149
 */
public class Main {
    public static void main(String[] args) {
        for(int i = 0; i< 10;i++){
            Thread1 thread1 = new Thread1();
            Thread2 thread2 = new Thread2();
            Thread3 thread3 = new Thread3();
            thread1.start();
            thread2.start();
            thread3.start();
        }

    }
}
