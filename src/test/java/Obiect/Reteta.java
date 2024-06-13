package Obiect;

import java.util.List;

public class Reteta {

    public String produs;
    public List<String> ingredienteNecesare;

    public Reteta(String produs, List<String> ingredienteNecesare) {
        this.produs = produs;
        this.ingredienteNecesare = ingredienteNecesare;
    }

    public void Reteta(){
        System.out.println("Astazi gatim: " + produs);

        System.out.println("Ingredientele necesare pentru aceasta reteta sunt: ");
        for (Integer index = 0; index < ingredienteNecesare.size(); index++) {
            System.out.println(ingredienteNecesare.get(index));
        }
    }
}
