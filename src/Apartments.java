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
        Flat mieszkanie2 = new Flat(7, "Gdańsk", false);
        mieszkanie2.setFloor(2);

        System.out.println("Mieszkanie 2: " + mieszkanie2.getFloor());
        System.out.println("Mieszkanie 2: " + mieszkanie2.getCity());
    }
}