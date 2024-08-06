package valueReferenceType;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ValueReferenceTest {

    //Primitive = int, double, float, char, boolean, long
    //Non-primitive (referinta) = String, Object, Array
    //Static = valoare care se pastreaza pentru toate instantele dintr-o clasa
    // Final - defineste o constanta care nu isi poate modifica valoarea initiala
    // Wrapper class - constructie de clasa care este facut pe baza unui tip de data primitiva

    public int originalInt = 10;
    public String originalString = "Cuvant";
    public Curs cursTestare = new Curs("Curs de testare automata", "testare automata", 1);
    public final int nrCursanti = 16;
    public Integer defaultWrapper;
    public int defaultPrimitive;

    @Test
    public void metodaTest(){
        System.out.println("1. VALUE TYPE");
        valueTypeExample(originalInt);
        System.out.println("Valoarea initiala este: " + originalInt);

        System.out.println("2. Reference type string");
        referenceTypeStringExample(originalString);
        System.out.println("Valoarea initiala este: " + originalString);

        System.out.println("3. Reference type object");
        referenceTypeObjectExample(cursTestare);
        System.out.println("Valoarea initiala este:");
        cursTestare.prezentareCurs();

        System.out.println("4. Constant");
        //nrCursanti = nrCursanti + 10;

        System.out.println("5. Value type/Wrapper class");
        defaultValue();
    }

    public void valueTypeExample(int value){
        value = value + 5;
        System.out.println("Valoarea noua este: " + value);
    }

    public void referenceTypeStringExample(String value){
        value = value + "Exemplu";
        System.out.println("Valoarea noua este: " + value);

    }

    public void referenceTypeObjectExample(Curs Object){
        Object.prezentareCurs();
        Object.setTitlu("Testare manuala");
        Object.prezentareCurs();
    }

    public void defaultValue(){
        System.out.println(defaultWrapper);
        System.out.println(defaultPrimitive);

        int[] Array = new int[5];
        List<Integer> list = new ArrayList<>();
    }
}
