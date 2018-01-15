package week3.starbucks_ex;
/**
 * 咖啡
 */
public class Coffee implements IDrink {
   protected IDrink iDrink;
    private double price = 11;

    public Coffee(IDrink iDrink) {
        this.iDrink=iDrink;
    }

    public Coffee() {

    }

    @Override
    public void getPrice() {
        System.out.println("Coffee: "+price);


    }
}
