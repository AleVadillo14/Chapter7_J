/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseP1;

/**
 *
 * @author ALEW
 */
public class Event {
    public static void main(String[] args) {
        EventDemo fiesta = new EventDemo();
        fiesta.setNumeroDeTelefono();
        System.out.println(fiesta.getNumeroDeTelefono());
        System.out.println(fiesta.getEvento());
    }
}
