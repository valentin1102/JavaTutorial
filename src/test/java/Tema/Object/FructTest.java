package Tema.Object;

import org.testng.annotations.Test;

public class FructTest {

    @Test
    public void testFruct(){
        Fruct Strugure = new Fruct("Strugure", "Mov", 12, 24.0, true);
        Strugure.prezentareFruct();

        System.out.println("------------------------------------");

        Fruct Mar = new Fruct("Mar", "Verde", 4, 65.0, false);
        Mar.prezentareFruct();

        System.out.println("---------------------------------------");
        Fruct Banana = new Fruct("Banana", "Galbena", 67, 90.0, true);
        Banana.prezentareFruct();
        Banana.pret=190.0;
        Banana.prezentareFruct();

    }
}
