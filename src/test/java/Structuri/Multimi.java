package Structuri;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Multimi {


    @Test
    public void metodaTest() {
    //afisareColegiArray();
       //afisareColegiArray();
        //obiecteMap();
        tariOrase();
    }
    //multimi = array, list (arraylist), map

    //afisam numele colegilor de la curs
    public void afisareColegiArray() {
        String[] Colegi = new String[6];
        Colegi[0] = "Larisa";
        Colegi[1] = "Marius";
        Colegi[2] = "Valentin";
        Colegi[3] = "Alex";
        Colegi[4] = "Corina";
        Colegi[5] = "Darius";
        for (Integer index = 0; index < Colegi.length; index++) {
            System.out.println("Numele cursantului este: " + Colegi[index]);
        }
    }
    //afisam numele colegilor de la curs - arraylist
    public void afisareColegiArraylist(){
        List<String> colegi=new ArrayList<>();
        colegi.add("Larisa");
        colegi.add("Marius");
        colegi.add("Valentin");
        colegi.add("Darius");
        colegi.add("Alex");
        for (Integer index = 0; index < colegi.size(); index++) {
            System.out.println("Numele cursantului este: " + colegi.get(index));
        }
    }

    //Key-value
    public void obiecteMap(){
        Map<String,String> obiecte=new HashMap<>();
        obiecte.put("fruct","mar");
        obiecte.put("masina","bmw");
        obiecte.put("electronice","telefon");
        obiecte.put("consola","ps5");
        obiecte.put("banca","ing");
        for (String key: obiecte.keySet()){
            System.out.println("Cheia este: "+key);
            System.out.println("Valoarea este: "+obiecte.get(key));
        }
    }

    //afisam cateva tari cu orasele aferente
    public void tariOrase(){
        Map<String,List<String>> tari=new HashMap<>();

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Timisoara");
        oraseRomania.add("Iasi");
        oraseRomania.add("Constanta");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Milano");
        oraseItalia.add("Napoli");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Valencia");
        oraseSpania.add("Barcelona");
        oraseSpania.add("Tenerife");

        tari.put("Romania", oraseRomania);
        tari.put("Italia", oraseItalia);
        tari.put("Spania", oraseSpania);

        for (String key: tari.keySet()){
            System.out.println("Tara este: "+key);
            System.out.println("Orasele sunt: "+tari.get(key));
        }
    }
}

//Tema
//de reprodus o carte de retete.
//map-ul e cartea de retete, tara e reteta iar orasele sunt ingredientele
