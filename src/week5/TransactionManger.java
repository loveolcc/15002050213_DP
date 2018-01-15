package week5;

public class TransactionManger {
    public static void begin(){
        System.out.println("TransactionManger begin...");
    }
    public static void commit(){
        System.out.println("TransactionManger commit...");
    }
    public static void rollback(){
        System.out.println("TransactionManger rollback...");
    }
}
