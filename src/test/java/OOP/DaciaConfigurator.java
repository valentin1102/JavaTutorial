package OOP;

import java.util.List;

public class DaciaConfigurator extends MasinaConfigurator {

    public String versiune;
    public String motor;
    public String culoare;
    public String jante;
    public String interior;
    public List<String> echipamente;
    public List<String> accessorii;


    public DaciaConfigurator(String marca, String model, Integer an, Double pretStandard, String versiune,
                             String motor, String culoare, String jante, String interior, List<String> echipamente,
                             List<String> accessorii) {
        super(marca, model, an, pretStandard);
        this.versiune = versiune;
        this.motor = motor;
        this.culoare = culoare;
        this.jante = jante;
        this.interior = interior;
        this.echipamente = echipamente;
        this.accessorii = accessorii;
    }

    public void infoDacia() {
        infoMasina();
        System.out.println("Versiunea masinii este: " + versiune);
        System.out.println("Motorul masinii este: " + motor);
        System.out.println("Culoarea masinii este: " + culoare);
        System.out.println("Jantele masinii sunt: " + jante);
        System.out.println("Interiorul masinii este: " + interior);
        System.out.println("Echipamentele masinii sunt: ");
        for (Integer index = 0; index < echipamente.size(); index++) {
            System.out.println(echipamente.get(index));
        }
        System.out.println("Accessoriile masinii sunt: ");
        for (Integer index = 0; index < accessorii.size(); index++) {
            System.out.println(accessorii.get(index));
        }
    }
}
