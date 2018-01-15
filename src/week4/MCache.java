package week4;

public class MCache implements CacheInterface {

    private MemcachedClient memcachedClient;

    public void setMemcachedClient(MemcachedClient memcachedClient){
        this.memcachedClient=memcachedClient;
    }

    @Override
    public void read(){
        this.memcachedClient.readMemcache();
    }

    @Override
    public void write(){
        this.memcachedClient.writeMemcache();
    }
}
