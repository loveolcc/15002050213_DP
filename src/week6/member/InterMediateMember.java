package week6.member;

public class InterMediateMember implements MemberStartegy {

    @Override
    public double calcPrice(double price) {
        return price*0.9;
    }
}
