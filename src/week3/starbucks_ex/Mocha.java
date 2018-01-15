package week3.starbucks_ex;
/**
 * 摩卡
 * */
public class Mocha implements IDrink {
    private double price = 22;
    @Override
    public void getPrice() {
        System.out.println("Mocha: "+price);

    }
}
