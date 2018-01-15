package week6.member;

public class CartService {
    private MemberStartegy startegy;


    public double calcPrice(double price){
        this.startegy=new InterMediateMember();
        return startegy.calcPrice(price);

    }

    public static void main(String[] args) {
        CartService cartService =new CartService();
        cartService.calcPrice(80);
    }
}
