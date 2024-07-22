package OOP;

import java.util.List;

public class DaciaConfigurator extends MasinaConfigurator {

    private String versiune;
    private String motor;
    private String culoare;
    private String jante;
    private String interior;
    private List<String> echipamente;
    private List<String> accessorii;
    private Double pretStandard;
    private Double pretFinal;


    public DaciaConfigurator(String marca, String model, Integer an, String versiune,
                             String motor, String culoare, String jante, String interior, List<String> echipamente,
                             List<String> accessorii) {
        super(marca, model, an);
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
        calculPretStandard();
        calculPretFinal();
    }

    //trebuie sa determinam pretul standard in functie de modelul masinii (dacia vs vw)

    public void calculPretStandard(){
        if (getModel().equals("Logan")) {
            if (versiune.equals("Essential")){
                pretStandard = 13.500;
            }
            if (versiune.equals("Expression")){
                pretStandard = 15.500;
            }
            if (versiune.equals("Journey")){
                pretStandard = 20.500;
            }
            if (versiune.equals("Journey+")){
                pretStandard = 30.500;
            }
        }
        System.out.printf("Pretul standard este de: %,.3f \n" , pretStandard); //metoda afisare cu multiple decimale
    }

    public void calculPretFinal() {
        double pretOptiuni = 0.000;
        if (getModel().equals("Logan")) {
            if (versiune.equals("Essential")) {
                switch (culoare) {
                    case "Grey":
                        pretOptiuni += 0.460;//shortcut pt pretOptiuni = pretOptiuni + 0.460
                        break;
                    case "Alb":
                        pretOptiuni += 0;
                        break;
                }
                switch (jante) {
                    case "Standard":
                        pretOptiuni += 2.000;
                        break;
                }
                switch (interior) {
                    case "Standard":
                        pretOptiuni += 0;
                        break;
                }
            }
        }
        pretFinal = pretStandard + pretOptiuni;
        System.out.printf("Pretul final al masinii cu optiunile alese este: %,.3f \n", pretFinal);
    }

    public String getVersiune() {
        return versiune;
    }

    public String getMotor() {
        return motor;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getJante() {
        return jante;
    }

    public String getInterior() {
        return interior;
    }

    public List<String> getEchipamente() {
        return echipamente;
    }

    public List<String> getAccessorii() {
        return accessorii;
    }

    public Double getPretStandard() {
        return pretStandard;
    }

    public Double getPretFinal() {
        return pretFinal;
    }

    public void setVersiune(String versiune) {
        this.versiune = versiune;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setJante(String jante) {
        this.jante = jante;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public void setEchipamente(List<String> echipamente) {
        this.echipamente = echipamente;
    }

    public void setAccessorii(List<String> accessorii) {
        this.accessorii = accessorii;
    }
}
