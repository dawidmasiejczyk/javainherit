/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dziedziczenie.potwory;

/**
 *
 * @author Masiejczyk
 */
public class Potwor {
    public double predkoscChodzenia;
    public double zywotnosc;
        public void atakuj()
        {
            // implementacja ataku domyslna
            System.out.println("To jest metoda atakuj z klasy potwór");
        }
    public Potwor()
    {
        System.out.println("Domyslny konstruktor z klasy Potwor");
    }
     public Potwor(double predkoscChodzenia, double zywotnosc)
    {
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc = zywotnosc;
        System.out.println("NieDomyslny konstruktor z klasy Potwor");
    }
}


