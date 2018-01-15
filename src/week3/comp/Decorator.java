package week3.comp;

public class Decorator implements Component {

    protected Component comp;
    public Decorator(Component comp) {
        this.comp = comp;
    }

    @Override
    public void simpleOperation() {
        System.out.println("装饰器：简单操作");
        comp.simpleOperation();
    }
}
