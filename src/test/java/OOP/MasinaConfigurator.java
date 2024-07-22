package OOP;

public class MasinaConfigurator {

    private String marca;
    private String model;
    private Integer an;


    public MasinaConfigurator(String marca, String model, Integer an) {
        this.marca = marca;
        this.model = model;
        this.an = an;

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

    //Incapsulare = conceptul prin care putem sa setam anumite restrictii de vizibilitate pentru proprietati/metode

    public void infoMasina(){
        System.out.println("Marca Masinii este: " + marca);
        System.out.println("Modelul Masinii este: " + model);
        System.out.println("Anul Masinii este: " + an);
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public Integer getAn() {
        return an;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAn(Integer an) {
        this.an = an;
    }
}
