package week3.starbucks_ex;

public class Milk implements IDrink {
    private double price=42;
    @Override
    public void getPrice() {
        System.out.println("AddMilk: "+price);

    }

}
