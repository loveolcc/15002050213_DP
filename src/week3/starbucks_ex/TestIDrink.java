package week3.starbucks_ex;

public class TestIDrink {
    public static void main(String[] args) {
//        IDrink iDrink= new Restaurant(new Mocha());
        IDrink iDrink= new Restaurant(new Coffee());
        iDrink.getPrice();

    }
}
