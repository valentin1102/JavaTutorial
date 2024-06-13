package Structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {

    // Structuri Alternative: If..Then..Else../ Switch..Case..

    @Test
    public void metodaTest () {
        //verificNr();
        //verificNrV2(11);
       // verificNrV2(8);
       // verificNrPar(-3);
        zileleSaptamanii(5);
    }

    // Verificam daca un numar este mai mare decat 10
    public void verificNr () {

        if (15>10) {
            System.out.println("Numarul 15 e mai mare decat 10!");
        }
        else {
            System.out.println("Numarul 15 nu e mai mare decat 10!");
        }
    }

    // Verificam daca un numar este mai mare decat 10 - V2
    public void verificNrV2 (Integer numar) {
        if (numar > 10) {
            System.out.println("Numarul " + numar + " e mai mare decat 10!");
        } else {
            System.out.println("Numarul " + numar + " nu e mai mare decat 10!");
        }
    }

    // Verificam daca un numar este par si pozitiv
    public void verificNrPar (Integer nr){

        // Daca vrem sa luam catul impartirii = / (divide)
        // Daca vrem sa luam restul impartirii = % (modulo)

        if (nr>0) {
            if (nr % 2==0) {
                System.out.println("Numarul " + nr + " e pozitiv si e par!");
            }
            else {
                System.out.println("Numarul " + nr + " este pozitiv si impar");
            }
        }
        else if (nr<0){
            if (nr % 2 ==0) {
                System.out.println("Numarul " + nr + " e negativ si e par!");
            }
            else {
                System.out.println("Numarul " + nr + "este negativ si impar");
            }
        }
            else {
            System.out.println("Numarul este egal cu zero");
        }
    }
    // Aici definim zilele saptamanii
    public void zileleSaptamanii (Integer zi) {
        switch (zi) {
            case 1:
                System.out.println("Astazi este Luni.");
                break; // Opreste case-ul aici
            case 2:
                System.out.println("Astazi este Marti.");
                break;
            case 3:
                System.out.println("Astazi este Miercuri");
                break;
            case 4:
                System.out.println("Astazi este Joi.");
                break;
            case 5:
                System.out.println("Astazi este Vineri.");
                break;
            default:
                System.out.println("Ziua nu exista.");
        }
    }

}
