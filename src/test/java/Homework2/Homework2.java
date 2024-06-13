package Homework2;

import org.testng.annotations.Test;

public class Homework2 {

    @Test
    public void metodaTest(){
    verificareNumar();
    }

    public void numarAfisare(){
        for (Integer index=1; index<=3; index++)
            System.out.println(index);
    }

    public void verificareNumar() {
        for (Integer index = 0; index <= 100; index++) {
            if (index % 5 == 0) {
                System.out.println("Numarul " + index + " este divizibil cu 5!");
            }

        }
    }
}
