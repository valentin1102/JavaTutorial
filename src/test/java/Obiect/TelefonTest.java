package Obiect;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelefonTest {

    @Test
    public void metodaTest(){
        System.out.println("===TELEFON: IPHONE15===");
        Map<String,String> iphone15Specificatii=new HashMap<>();
        iphone15Specificatii.put("Model procesor","Apple A16 Bionic");
        iphone15Specificatii.put("Sistem de operare","iOS");
        iphone15Specificatii.put("Memorie RAM","6 GB");
        iphone15Specificatii.put("Rezolutie video","Full HD");
        iphone15Specificatii.put("Tip display","Super Retina XDR");
        iphone15Specificatii.put("Porturi","USB Type C");

        List<String> iphone15Accessorii=new ArrayList<>();
        iphone15Accessorii.add("Telefon");
        iphone15Accessorii.add("Incarcator");
        iphone15Accessorii.add("Cablu USB");
        iphone15Accessorii.add("Casti");
        iphone15Accessorii.add("Stylus");
        iphone15Accessorii.add("Stickere");

        Telefon Iphone15 = new Telefon("Iphone", "15", "Albastru", "128 GIGA", 2000, iphone15Specificatii, iphone15Accessorii, false);
        Iphone15.infoTelefon();

        System.out.println("===TELEFON: Samsung24===");
        Map<String,String> samsung24Specificatii=new HashMap<>();
        samsung24Specificatii.put("Model procesor","Exynos 2400");
        samsung24Specificatii.put("Sistem de operare","Android 14");
        samsung24Specificatii.put("Memorie RAM","8 GB");
        samsung24Specificatii.put("Rezolutie video","8K");
        samsung24Specificatii.put("Tip display","Dynamic AMOLED");
        samsung24Specificatii.put("Porturi","USB Type C");

        List<String> samsung24Accessorii=new ArrayList<>();
        samsung24Accessorii.add("Telefon");
        samsung24Accessorii.add("Incarcator");
        samsung24Accessorii.add("Cablu USB");

        Telefon Samsung24 = new Telefon("Samsung", "24", "Negru", "64 giga", 4000, samsung24Specificatii, samsung24Accessorii, false);
        Samsung24.infoTelefon();

        System.out.println("===TELEFON: Huawei");
        Map<String,String> huaweiSpecificatii=new HashMap<>();
        huaweiSpecificatii.put("Model procesor","Exynos 2400");
        huaweiSpecificatii.put("Sistem de operare","Android 14");

        List<String> huaweiAccessorii=new ArrayList<>();
        huaweiAccessorii.add("Telefon");
        huaweiAccessorii.add("Incarcator");

        Telefon HuaweiPro = new Telefon("Huawei", "Pro", "rosu",
                "256 giga", 7000, huaweiSpecificatii, huaweiAccessorii, true, "Produs cu urme fine de utilizare");
        HuaweiPro.infoTelefon();

    }
}
