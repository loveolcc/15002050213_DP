package week1;

/**
 * Created by 胡晓军 on 2017/9/11.
 */
public class DoMain {

    public static void main(String[] args) {
        TicketMarket ticketMarket=TicketMarket.getInstance();
        System.out.println(ticketMarket.getNextTicketNum());
    }
}
