package week2.factory;

public class OperationFactory {
    public static Operation createOperation(String opCode) {
        Operation op = null;
        switch(opCode) {
            case "+":
                op = new OperationAdd();
                break;
            case "*":
                op = new OperationMul();
                break;
            default:
                break;
        }
        return op;
    }
}
