import java.sql.SQLInvalidAuthorizationSpecException;

public class Apartments {
    public static void main(String[] args) {
        Flat mieszkanie1 = new Flat(2, "Wrocław", true);
        System.out.println("Mieszkanie1:" +mieszkanie1.getFloor());
        System.out.println("Mieszkanie1:" +mieszkanie1.getCity());
        System.out.println("Mieszkanie1:" +mieszkanie1.getBalcony());
        mieszkanie1.setBalcony(false);
        System.out.println("Mieszkanie1:" +mieszkanie1.getBalcony());
        mieszkanie1.setCity("Gdynia");
        System.out.println("Mieszkanie1:" +mieszkanie1.getCity());
        Flat mieszkanie2 = new Flat(0, "Gdynia", false);
        mieszkanie2.setFloor(7);
        System.out.println(mieszkanie2.getFloor());
    }
}