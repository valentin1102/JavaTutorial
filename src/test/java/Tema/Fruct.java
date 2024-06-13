package Tema;

import org.testng.annotations.Test;

public class Fruct {

    public String nume;
    public String culoare;
    public Integer greutate;
    public Double pret;
    public Boolean esteCopt;

    @Test
    public void metodaTest () {
        afisareFruct();
        System.out.println("=== Exemplul 2 ===");
        afisareOriceFruct ("Kiwi", "Verde", 20, 30.00, true);
        System.out.println("=== Exemplul 3 ===");
        afisareOriceFruct("Capsuna", "Rosu", 15, 25.25, false);
        System.out.println("=== Exemplul 4 ===");
        afisareOriceFruct("Strugure", "Verde", 12, 16.37, true);
        System.out.println("=== Exemplul 5 ===");
        afisareOriceFruct("Portocala", "Portocaliu", 70, 17.98, false);
        System.out.println("=== Exemplul 6 ===");
        afisareOriceFruct("Lamaie", "Galben", 19, 18.37, true);

    }

    public void afisareFruct () {

        nume = "Banana";
        culoare = "Galben";
        greutate = 300;
        pret = 30.00;
        esteCopt = true;

        System.out.println("Numele fructului este: " + nume);
        System.out.println("Culoarea fructului este: " + culoare);
        System.out.println("Greutatea fructului este de: " + greutate + " de grame");
        System.out.println("Pretul fructului este de: " + pret + " de lei");
        System.out.println("Este fructul copt? " + esteCopt);

    }

    public void afisareOriceFruct (String nume, String culoare, Integer greutate, Double pret, Boolean esteCopt) {

        System.out.println("Numele fructului este: " + nume);
        System.out.println("Culoarea fructului este: " + culoare);
        System.out.println("Greutatea fructului este de: " + greutate + " de grame");
        System.out.println("Pretul fructului este de: " + pret + " de lei");
        System.out.println("Este fructul copt? " + esteCopt);


    }


}


// Tema
// Review ultimele doua sesiuni
// Descrieti vreo 6 fructe folosind schema de la Masina