package variabilaMetoda;

import org.testng.annotations.Test;

public class Cursant {

    // Recunoastem o clasa intr-un fisier Java dupa cuvantul cheie: class
    // Intr-un fisier Java putem avea o multime de clase pe care le diferentiem prin numele lor.
    // Nu este un practice bun in Java sa avem intr-un fisier mai multe clase.
    // In fiecare clasa trebuie sa aibe un nume.
    // Intelegem printr-o clasa ca fiind un sablon specific din viata reala.
    // Intr-o clasa putem defini variable si metode.
    // Variabila = proprietatea unei clase.
    // Intr-o clasa putem avea o multime de variabile.
    // Variabilele se diferentiaza prin tip si nume.
    // Variabilele pot fi de doua feluri: global si local.
    // Variabila globala = proprietate vizibila oriunde in cod.
    // Variabila locala = proprietate vizibila doar in locul definit.
    // Tipuri de date: string, integer, double/float, character, boolean.

    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areRestante;

    // Metoda = Actiunea unei clase.
    // Intr-o clasa putem avea o multime de metode diferentiate prin numele acestora.
    // Exista doua tipuri de metode: void si return.
    // Metoda void = actiune pe care vrem sa o afisam/interpretam fara a fi nevoie sa o returnam.
    // Pentru o metoda trebuie sa specificam un access control(public), () si {}

    @Test
    public void metodaTest () {

    descrieCursantul();
    primesteBursa();


    }

    public void primesteBursa () {
        Integer bursa = 1000;

        System.out.println("Bursa cursantului este: " + bursa);
    }

    public void descrieCursantul () {

        nume = "Stoica";
        prenume = "Valentin";
        varsta = 34;
        adresa = "Timisoara, Strada Whatever";
        inaltime = 1.74;
        greutate = 84.00f;
        sex = 'M';
        areRestante = true;


        System.out.println("Numele cursantului este " + nume); // concatenare
        System.out.println("Iar prenumele este " + prenume);
        System.out.println("Varsta cursantului este " + varsta);
        System.out.println("Adresa cursantului este " + adresa);
        System.out.println("Inaltimea cursantului este de " + inaltime);
        System.out.println("Greutatea cursantului este " + greutate + " de kilograme");
        System.out.println("Sexul cursantului este " + sex);
        System.out.println("Are cursantul restate? " + areRestante);

    }

}
