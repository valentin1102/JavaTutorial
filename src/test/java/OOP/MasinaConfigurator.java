package OOP;

public class MasinaConfigurator {

    public String marca;
    public String model;
    public Integer an;
    public Double pretStandard;

    public MasinaConfigurator(String marca, String model, Integer an, Double pretStandard) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.pretStandard = pretStandard;
    }

    //OOP= programare orientata pe obiecte
    //OOP = 4 principii -> mostenire, incapsulare, polimorfism, abstractizare
    //Mostenirea = conceptul prin care o clasa mosteneste o alta clasa
    //Clasa care este mostenita = parinte
    //Clasa care mosteneste = copil
    //In Java, putem mosteni o singura clasa
    // Mostenirea se realizeaza cu cuvantul "extends"
    // Cand copilul mosteneste parintele, copilul trebuie sa apeleze constructorul din parinte
    //Copilul va avea acces la proprietatile/metodele din clasa parinte(daca se foloseste public/protected/default)
    //Ca sa apelam constructorul din parinte in copil, se foloseste cuvantul "super"

    public void infoMasina(){
        System.out.println("Marca Masinii este: " + marca);
        System.out.println("Modelul Masinii este: " + model);
        System.out.println("Anul Masinii este: " + an);
        System.out.println("Pretul standard al Masinii este: " + pretStandard);
    }

}
