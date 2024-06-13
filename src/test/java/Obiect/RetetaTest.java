package Obiect;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class RetetaTest {

    @Test
    public void methodTest(){
        List<String> briosa=new ArrayList<>();
        briosa.add("Faina");
        briosa.add("Oua");
        briosa.add("Lapte");
        briosa.add("Unt");

        Reteta Briosa = new Reteta("Briose", briosa);
        Briosa.Reteta();
    }
}
