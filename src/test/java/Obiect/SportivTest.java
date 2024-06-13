package Obiect;

import org.testng.annotations.Test;

public class SportivTest {

    @Test
    public void metodaTest(){
    // Instantiem un obiect de tipul sportiv
        Sportiv Valentin = new Sportiv("Valentin", "Stoica", 34, "Masculin", "Fotbal", true);
        Valentin.prezentareSportiv();
        Valentin.varsta = 18;
        Valentin.sportPracticat = "Basketball";
        Valentin.prezentareSportiv();
        Valentin.verificareVarsta();

        System.out.println("----------------------------------------------");

        Sportiv Alin = new Sportiv("Alin", "Popescu", 22, "Masculin", "Box", false);
        Alin.prezentareSportiv();
        Alin.verificareVarsta();

        System.out.println("------------------------------------------------");

        Sportiv Vlad = new Sportiv("Vlad", "Artinel", 19, "Masculin", "Voley", true, 1900);
        Vlad.prezentareSportiv();
        Vlad.marireSalar(20);

    }
}
