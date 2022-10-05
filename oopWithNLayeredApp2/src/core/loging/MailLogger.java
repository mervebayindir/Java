/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.loging;

/**
 *
 * @author Dell e7270
 */
public class MailLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Mail gönderildi : " + data);
    }
    
}
