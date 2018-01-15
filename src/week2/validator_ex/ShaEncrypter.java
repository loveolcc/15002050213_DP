package week2.validator_ex;

public class ShaEncrypter implements Encrypter {
    @Override
    public String encrypt(String plainText) {
        System.out.println("Using SHA Encryption");
        return plainText;
    }
}
