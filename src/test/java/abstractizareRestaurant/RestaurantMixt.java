package abstractizareRestaurant;

public class RestaurantMixt extends Restaurant implements VeganInterface, NonVegan{
    public RestaurantMixt(String numeRestaurant, String adresa, Boolean delivery, String tipRestaurant) {
        super(numeRestaurant, adresa, delivery, tipRestaurant);
    }

    @Override
    public void gatesteNonVegan() {

    }

    @Override
    public void gatesteVegan() {

    }

    @Override
    public void prezentareMeniu() {

    }
}
