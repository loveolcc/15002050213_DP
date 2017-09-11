package week1;

/**
 * Created by 胡晓军 on 2017/9/11.
 */
public class TicketMarket {

    private static TicketMarket ticketMarket=new TicketMarket();

    private int ticketNum=1000;

    public static TicketMarket getInstance(){
        return ticketMarket;
    }
    public int getNextTicketNum(){
        return ticketNum++;
    }
    private TicketMarket(){

    }
}
