package week3.comp;

public class Decorator2nd implements Component {

    protected Component comp;
    public Decorator2nd(Component comp) {
        this.comp = comp;
    }

    @Override
    public void simpleOperation() {
        System.out.println("装饰器2：简单操作");
        comp.simpleOperation();
    }
}
