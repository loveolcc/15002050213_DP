package week2.validator_ex;

public class Authenticator {
    private KeyValueKeeper keeper;
    private Encrypter encrypter;

    public Authenticator(KeyValueKeeper keeper, Encrypter encrypter) {
        this.encrypter = encrypter;
        this.keeper = keeper;
    }

    // 业务方法：存储用户名-密码
    public void save(String user, String password) {
        if(password == null)
            password = "";
        password = encrypter.encrypt(password);
        keeper.store(user, password);
    }

    // 业务方法：校验用户名-密码
    public boolean authenticate(String user, String password) {
        String storedPassword = keeper.retrieve(user);
        if( storedPassword == null )
            return  false;
        if( password == null )
            return false;

        return storedPassword.equals( encrypter.encrypt(password) );

    }
}
