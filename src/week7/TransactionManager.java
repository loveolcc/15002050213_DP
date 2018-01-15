package week7;

public class TransactionManager {
    public static void begin() {
        System.out.println("事务开始");
    }
    public static void commit() {
        System.out.println("事务提交");
    }
    public static void rollback() {
        System.out.println("事务回滚");
    }
}
