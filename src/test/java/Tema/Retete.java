package Tema;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Retete {

    @Test
    public void methodTest(){
        carteRetete();
    }

    public void carteRetete(){
        Map<String,List<String>> carte = new HashMap<>();

        List<String> ingredienteBriose = new ArrayList<>();
        ingredienteBriose.add("Faina");
        ingredienteBriose.add("Oua");
        ingredienteBriose.add("Unt");
        ingredienteBriose.add("Lapte");

        List<String> ingredientePaste = new ArrayList<>();
        ingredientePaste.add("Paste");
        ingredientePaste.add("Sos");
        ingredientePaste.add("Parmezan");
        ingredientePaste.add("Ciuperci");

        List<String> ingredienteCiorba = new ArrayList<>();
        ingredienteCiorba.add("Bors");
        ingredienteCiorba.add("Legume");
        ingredienteCiorba.add("Fasole");
        ingredienteCiorba.add("Carne");

        carte.put("Briose", ingredienteBriose);
        carte.put("Paste", ingredientePaste);
        carte.put("Ciorba", ingredienteCiorba);

        for (String key: carte.keySet()){
            System.out.println("Reteta este pentru a prepara: " + key);
            System.out.println("Ingredientele pentru aceasta reteta sunt: " + carte.get(key));
        }
    }
}
