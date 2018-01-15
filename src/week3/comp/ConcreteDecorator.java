package week3.comp;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component comp) {
        super(comp);
    }

    public void simpleOperation() {
        System.out.println("具体装饰器：简单操作");
        comp.simpleOperation();
    }
}
