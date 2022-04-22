/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tweets;


import java.time.LocalDateTime;

/**
 *
 * @author 20201PF.CC0149
 */
public class Thread2 extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
            System.out.println(LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
