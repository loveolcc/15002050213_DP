package week2.validator_ex;

public class Md5Encrypter implements Encrypter {
    @Override
    public String encrypt(String plainText) {
        System.out.println("Using MD5 Encryption");
        return plainText;
    }
}
