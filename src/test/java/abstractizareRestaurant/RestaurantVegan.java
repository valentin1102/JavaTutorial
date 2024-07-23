package abstractizareRestaurant;

public class RestaurantVegan extends Restaurant implements VeganInterface{
    public RestaurantVegan(String numeRestaurant, String adresa, Boolean delivery, String tipRestaurant) {
        super(numeRestaurant, adresa, delivery, tipRestaurant);
    }

    @Override
    public void gatesteVegan() {

    }

    @Override
    public void prezentareMeniu() {

    }
}
