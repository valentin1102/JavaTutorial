package abstractizareRestaurant;

public class Restaurant {

    public Restaurant(String numeRestaurant, String adresa, Boolean delivery, String tipRestaurant) {
        this.numeRestaurant = numeRestaurant;
        this.adresa = adresa;
        this.delivery = delivery;
        this.tipRestaurant = tipRestaurant;
    }

    private String numeRestaurant;
    private String adresa;
    private Boolean delivery;
    private String tipRestaurant;

    public String getNumeRestaurant() {
        return numeRestaurant;
    }

    public void setNumeRestaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Boolean getDelivery() {
        return delivery;
    }

    public void setDelivery(Boolean delivery) {
        this.delivery = delivery;
    }

    public String getTipRestaurant() {
        return tipRestaurant;
    }

    public void setTipRestaurant(String tipRestaurant) {
        this.tipRestaurant = tipRestaurant;
    }
}
