/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseP2;

/**
 *
 * @author ALEW
 */
public class RentalDemo {
    public static void main(String[] args) {
        Rental renta = new Rental(600,"A111");
        renta.setNoTelefono("9208729182");
        System.out.println(renta.getNoTelefono());
        System.out.println(renta.getNoContrato());
    }

}
