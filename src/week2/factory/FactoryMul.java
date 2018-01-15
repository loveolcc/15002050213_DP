package week2.factory;

public class FactoryMul implements FactoryIntf {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
