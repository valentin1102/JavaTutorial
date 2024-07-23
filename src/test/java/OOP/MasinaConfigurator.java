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

    // POLIMORFISM = CONCEPTUL PRIN CARE O METODA POATE AVEA IMPLEMENTARI DIFERITE
    // POLIMORFISMUL POATE SA FIE DE DOUA FELURI: DINAMIC(OVERRIDE) SI STATIC(OVERLOAD)

    // POLIMORFISM DINAMIC = INTR-O IERARHIE DE CLASE OBTINUTE PRIN MOSTENIRE, O METODA POATE AVEA IMPLEMENTARI DIFERITE
    // POLIMORFISMUL DINAMIC ESTE PREZENT DOAR LA MOSTENIRE

    // POLIMORFISMUL STATIC = DACA AVEM NEVOIE CA O METODA SA FIE FOLOSITA IN DIFERITE CIRCUMSTANTE, PUTEM DEFINI
       // MAI MULTE METODE CU ACELASI NUME, AVAND NUMAR DE PARAMETRI/TIP PARAMETRI DIFERITI

    public void infoMasina(){
        System.out.println("Marca Masinii este: " + marca);
        System.out.println("Modelul Masinii este: " + model);
        System.out.println("Anul Masinii este: " + an);
    }

    //POLIMORFISM DINAMIC

    public void pornesteMotor(){
        System.out.println("Masina se porneste cu ajutorul cheii");
    }

    public void deschideGeam(){
        System.out.println("Geamul se deschide manual");
    }

    //POLIMORFISM STATIC

    public void promotieDacia(){
        System.out.println("Pentru luna iulie, Dacia nu are promotie");
    }

    public void promotieDacia(String ticket){
        System.out.println("Daca ai" + ticket + "rabla, ai promotie");
    }

    public void promotieDacia(Integer reducere){
        System.out.println("Daca ai" + reducere + "rabla, ai promotie");
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
