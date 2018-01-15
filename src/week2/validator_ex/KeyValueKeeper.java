package week2.validator_ex;

public interface KeyValueKeeper {
    public void store(String key, String value);
    public String retrieve(String key);
}
