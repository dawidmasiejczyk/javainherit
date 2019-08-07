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
public class szkielet extends Potwor
{
    public szkielet()
    {
        System.out.println("Domyslny konstruktor z klasy szkielet");
    }
    public szkielet(double predkoscChodzenia, double zywotnosc)
    {
        super(predkoscChodzenia, zywotnosc);
        System.out.println("NieDomyslny konstruktor z klasy szkielet");
        //this.predkoscChodzenia = predkoscChodzenia;
       // this.zywotnosc = zywotnosc;
    }
}
