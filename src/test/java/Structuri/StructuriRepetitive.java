package Structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    // Structuri repetitive = for, while, for each
    @Test
    public void testMethod(){
    numarPar();
    }
    // Afisam primele 15 numere
    public void afisareNrFor(){
        for (Integer index=0; index<=15; index++)
            System.out.println(index);
    }
    public void afisareNrWhile(){
        Integer index=0;
        while (index<=15){
            System.out.println(index);
            index++;
        }
    }
    // Afisam numerele pare de la 0 la 20
    public void numarPar(){
        for (Integer index=0; index<=20; index++) {
            if (index % 2==0){
                System.out.println("Numarul " + index + " este par!");
            }
            else {
                System.out.println("Numarul " + index + " este impar!");
            }
        }
    }
}
