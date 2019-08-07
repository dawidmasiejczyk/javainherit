/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dziedziczenie;

import dziedziczenie.potwory.Potwor;
import dziedziczenie.potwory.Zombie;
import dziedziczenie.potwory.szkielet;

/**
 *
 * @author Masiejczyk
 */
public class Dziedziczenie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Potwor p = new Potwor(10, 100);
        System.out.println(p.predkoscChodzenia);
        szkielet s = new szkielet(20,0);
        System.out.println(s.predkoscChodzenia);
        Zombie z = new Zombie();
    }
    
}
