/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameZ4;

import java.util.Scanner;

/**
 *
 * @author ALEW
 */
public class Paciente {
    Scanner sc;
    private String frase;

    public Paciente(){
        sc = new Scanner(System.in);
        setFrase();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase() {
        this.frase = sc.nextLine();
    }
}
