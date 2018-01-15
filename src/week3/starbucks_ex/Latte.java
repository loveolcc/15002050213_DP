package week3.starbucks_ex;
/**
 * 拿铁
 */

public class Latte implements IDrink {
    private double price = 33;
    @Override
    public void getPrice() {
        System.out.println("Latte: "+price);

    }
}
