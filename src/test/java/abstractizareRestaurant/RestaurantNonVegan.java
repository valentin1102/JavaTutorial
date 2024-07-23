package abstractizareRestaurant;

public class RestaurantNonVegan extends Restaurant implements NonVegan{
    public RestaurantNonVegan(String numeRestaurant, String adresa, Boolean delivery, String tipRestaurant) {
        super(numeRestaurant, adresa, delivery, tipRestaurant);
    }

    @Override
    public void gatesteNonVegan() {

    }

    @Override
    public void prezentareMeniu() {

    }
}
