package week4;

public class RCache implements CacheInterface {
    private Jedis jedis;
    public void setJedis(Jedis jedis){
        this.jedis=jedis;
    }
    @Override
    public void read(){
        this.jedis.readJedis();
    }
    @Override
    public void write(){
        this.jedis.writeJedis();
    }
}
