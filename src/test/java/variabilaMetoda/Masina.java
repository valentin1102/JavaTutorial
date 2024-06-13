package variabilaMetoda;

import org.testng.annotations.Test;

public class Masina {

public String marca;
public String model;
public Integer pret;
public Integer anFabricatie;
public Boolean esteDecapotabila;
public Float greutate;


@Test
    public void metodaTest () {
    afisareMasina();
    System.out.println("===Exemplul 2===");
    afisareOriceMasina("Toyota", "Model 3", 30000, 2000, true, 3987.90f);
    System.out.println("===Exemplul 3===");
    afisareOriceMasina("Dacia", "Logan", 9000, 1987, false, 675.89f);
}

//Descriem o masina

    public void afisareMasina () {

    marca = "Mercedes";
    model = "NUMB";
    pret = 2000;
    anFabricatie = 1990;
    esteDecapotabila = true;
    greutate = 25.90f;

        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Pretul masinii este: " + pret);
        System.out.println("Anul fabricatiei este: " + anFabricatie);
        System.out.println("Este masina decapotabila? " + esteDecapotabila);
        System.out.println("Greutatea masinii este: " + greutate);

    }

    // Descriem orice masina

    public void afisareOriceMasina (String marca, String model, Integer pret, Integer anFabricatie, Boolean esteDecapotabila, Float greutate) {

        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Pretul masinii este: " + pret);
        System.out.println("Anul fabricatiei este: " + anFabricatie);
        System.out.println("Este masina decapotabila? " + esteDecapotabila);
        System.out.println("Greutatea masinii este: " + greutate);

    }

}


