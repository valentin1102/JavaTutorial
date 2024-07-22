package OOP;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OOPText {

    @Test
    public void methodTest(){
        //Dam o comanda de o masina Dacia
        List<String> EchipamenteLogan= Arrays.asList("Pachet Techno", "Pachet Clima", "Pachet Parking");
        List<String> AccessoriiLogan= Arrays.asList("Covorase", "Scrumiera", "Bluetooth");
        DaciaConfigurator Logan = new DaciaConfigurator("Dacia", "Logan", 2004, "Essential", "TCE 90", "Grey", "Standard",
                "Standard", EchipamenteLogan, AccessoriiLogan);
        Logan.infoDacia();

        System.out.println("========================VW=========================");

        List<String> dotariOptionalePolo = Arrays.asList("Trapa de sticla", "Alarma Antifurt", "Keyless Access");
        VWConfigurator Polo = new VWConfigurator("VW", "Polo", 2004, "Automata","Advanced", "Polo Life 3.1",
                "Rosie", "Metalice",  dotariOptionalePolo);
        Polo.infoVW();
    }

}

// Tema
//1) MAI DEFINESC O DACIE SI DOUA VW
//2) Mai aleg o marca de masina, fac o clasa si definesc doua obiecte