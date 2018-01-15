package week4;

public class testCache {
    public static void main(String[] args) {
        MCache m=new MCache();
        m.read();
        m.read();

        RCache r=new RCache();
        r.read();
        r.write();
    }
}
