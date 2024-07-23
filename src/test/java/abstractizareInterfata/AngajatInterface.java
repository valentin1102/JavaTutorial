package abstractizareInterfata;

public interface AngajatInterface extends CommonInterface {

    // Recunoastem intr-un fisier Java o interfata dupa cuvantul Interface
    //O interfata contine numai metode abstracte (metode care nu au body)
    // Toate metodele dintr-o interfata sunt by default publice
    // intr-o interfata putem avea atat metode void cat si metode cu return
    // o interfata nu poate contine un constructor
    // dintr-o interfata nu putem sa facem un obiect
    // o interfata se implementeaza
    // clasa care implementeaza interfata trebuie sa implementeze toate metodele abstracte din interfata
    // o clasa poate implementa mai multe interfete
    // o interfata poate mosteni o alta interfata

    void mergeLaServiciu();
    void desfasoaraActivitatea();
    void beaCafea();
    void incheieActivitatea();


}
