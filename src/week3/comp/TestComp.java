package week3.comp;

public class TestComp {
    public static void main(String[] args) {
        /*
        Component comp = new Decorator(new ConcreteComponent());
        comp.simpleOperation();
        */
//        Component comp = new Decorator2nd(new Decorator(new ConcreteComponent()));
//        comp.simpleOperation();

        Component comp = new ConcreteDecorator(new ConcreteComponent());
        comp.simpleOperation();


    }
}
