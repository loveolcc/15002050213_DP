package week7;

public class TestTran {
    public static void main(String[] args) {
        PersonInterface person = new PersonProxy(new PersonServiceImpl());
        person.save();
    }
}
