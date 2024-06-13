package Tema.Object;

public class Fruct {



    public String nume;
    public String culoare;
    public Integer greutate;
    public Double pret;
    public Boolean esteCopt;

    public Fruct(String nume, String culoare, Integer greutate, Double pret, Boolean esteCopt) {
        this.nume = nume;
        this.culoare = culoare;
        this.greutate = greutate;
        this.pret = pret;
        this.esteCopt = esteCopt;
    }

    public void prezentareFruct () {
        System.out.println("Numele fructului este: " + nume);
        System.out.println("Culoarea fructului este: " + culoare);
        System.out.println("Greutatea fructului este " + greutate);
        System.out.println("Pretul fructului este: " + pret);
        System.out.println("Este fructul copt? " + esteCopt);
    }

}
