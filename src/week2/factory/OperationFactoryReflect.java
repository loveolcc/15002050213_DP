package week2.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class OperationFactoryReflect {
    private static Properties prop = new Properties();
    static {
        try {
            prop.load(new FileInputStream("src/week2/factory/op.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Operation createOperation() {
        Operation op = null;
        try {
            op = (Operation) Class.forName(prop.getProperty("opName")).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return op;
    }
}
