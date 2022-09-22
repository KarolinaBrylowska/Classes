public class Flat {
    int floor;
    String city;
    boolean balcony;
    Flat(int floor, String city, boolean balcony){
        this.balcony = balcony;
        this.city = city;
        this.floor = floor;
    }

    public int getFloor () {
        return floor;
    }
    public String getCity  () {
        return city;
    }
    public Boolean getBalcony () {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }
}


