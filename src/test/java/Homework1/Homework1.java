package Homework1;

import org.testng.annotations.Test;

public class Homework1 {

    @Test
    public void methodTest(){
        testAna();
    }


    public void helloWorld() {
        System.out.println("Hello World");
    }

    public void detailsPerson(){
        System.out.println(34);
        System.out.println("Valentin");
        System.out.println("Stoica");
    }

    public void testAna(){
        Character Z = 'Z';
        System.out.println("Ana"+ Z + " are" + " mere"+ Z + ", pere" + Z + ", prune" + Z);
    }
}
