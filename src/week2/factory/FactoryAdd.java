package week2.factory;

public class FactoryAdd implements FactoryIntf {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
