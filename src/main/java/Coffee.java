public class Coffee {
    private String name;
    private String roast;
    private double price;

    public Coffee() {}

    public Coffee(String name, String roast, double price) {
        this.name = name;
        this.roast = roast;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }
    public String getRoast(){
        return this.roast;
    }
    public double getPrice(){
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoast (String roast) {
        this.roast = roast;
    }

    public void setPrice (double price) {
        this.price = price;
    }

}
