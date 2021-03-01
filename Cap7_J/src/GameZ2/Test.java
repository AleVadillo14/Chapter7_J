/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameZ2;

import java.util.ArrayList;

/**
 *
 * @author ALEW
 */
public class Test {
    public static void main(String[] args) {
        RockPaperScissors jugar = new RockPaperScissors();
        ArrayList a = new ArrayList();

        for (int i = 0; i < 10; i++) {
            jugar.jugar();
            a.add(jugar.getJugador())
        }

        for (int i = 0; i <a.size() ; i++) {
            System.out.println(a.get(i));
        }
    }
}
