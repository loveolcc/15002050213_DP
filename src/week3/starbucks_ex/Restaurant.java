package week3.starbucks_ex;

public class Restaurant extends Coffee{
    public Restaurant(IDrink iDrink){
        super(iDrink);
    }
    @Override
    public void getPrice(){
        System.out.println("12346789");
        iDrink.getPrice();
    }
}
