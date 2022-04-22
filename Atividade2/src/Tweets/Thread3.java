/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tweets;

/**
 *
 * @author 20201PF.CC0149
 */
public class Thread3 extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(8000);
            System.out.println(Thread2.currentThread());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
