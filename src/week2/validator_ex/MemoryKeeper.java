package week2.validator_ex;

import java.util.HashMap;
import java.util.Map;

public class MemoryKeeper implements KeyValueKeeper {
    private Map<String,String> map = new HashMap<String,String>();

    @Override
    public void store(String key, String value) {
        System.out.println("Store to MemoryKeeper");
        map.put(key,value);
    }

    @Override
    public String retrieve(String key) {
        System.out.println("Retrieve from MemoryKeeper");
        return map.get(key);
    }
}
