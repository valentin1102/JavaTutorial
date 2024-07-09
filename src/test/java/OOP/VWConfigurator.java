package OOP;

import java.util.List;

public class VWConfigurator extends MasinaConfigurator {

    public String linieDeEchipare;
    public String motor;
    public String vopsea;
    public String roti;
    public String tapiterie;
    public List<String> dotariOptionale;


    public VWConfigurator(String marca, String model, Integer an, Double pretStandard, String linieDeEchipare, String motor, String vopsea, String roti,
                          String tapiterie, List<String> dotariOptionale) {
        super(marca, model, an, pretStandard);
        this.linieDeEchipare = linieDeEchipare;
        this.motor = motor;
        this.vopsea = vopsea;
        this.roti = roti;
        this.tapiterie = tapiterie;
        this.dotariOptionale = dotariOptionale;
    }
    public void infoVW(){
        infoMasina();
        System.out.println("Linia de echipare a masinii este " + linieDeEchipare);
        System.out.println("Motorul masinii este: " + motor);
        System.out.println("Vopseaua masinii este : " + vopsea);
        System.out.println("Rotile masinii sunt : " + roti);
        System.out.println("Tapiteria masinii este : " + linieDeEchipare);
        System.out.println("Dotarile optionale sunt: ");
        for (Integer index = 0; index < dotariOptionale.size(); index++) {
            System.out.println(dotariOptionale.get(index));
        }
    }
}
