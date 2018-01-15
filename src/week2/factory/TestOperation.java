package week2.factory;

public class TestOperation {
    public static void main(String[] args) {
        // 演示1：简单工厂
        /*
        Operation op = OperationFactory.createOperation("+");
        op.setNumberA(99);
        op.setNumberB(2);
        System.out.println(op.getResult());
        */
        // 演示2：工厂方法
        /*
        FactoryIntf factory = new FactoryMul();
        Operation op = factory.createOperation();
        op.setNumberA(99);
        op.setNumberB(2);
        System.out.println(op.getResult());
        */
        // 演示3
        /*
        Operation op = OperationFactoryReflect.createOperation("factory.OperationAdd");
        if(op!=null) {
            op.setNumberA(99);
            op.setNumberB(2);
            System.out.println(op.getResult());
        }
        */
        // 演示4
        /*Properties prop = new Properties();
        String OpName = null;
        try {
            prop.load(new FileInputStream("op.properties"));
            OpName = prop.getProperty("operation");

        } catch (IOException e) {
            e.printStackTrace();
        }*/
        Operation op = OperationFactoryReflect.createOperation();
        if(op!=null) {
            op.setNumberA(99);
            op.setNumberB(2);
            System.out.println(op.getResult());
        }
        /*File f = new File("op.properties");
        System.out.println(f.getAbsolutePath());*/
    }
}
