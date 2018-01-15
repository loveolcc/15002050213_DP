package week3.comp;

public class ConcreteComponent implements Component {

    @Override
    public void simpleOperation() {
        System.out.println("具体实例：简单操作");
    }
}
