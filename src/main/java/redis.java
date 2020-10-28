import redis.clients.jedis.Jedis;

/**
 * @author ymskr
 * @create 2020-10-27-16:29
 */
public class redis {
    public static void main(String[] args) {

        Jedis jedis = new Jedis("hadoop102", 6379);

        System.out.println(jedis.ping());
      jedis.sadd("b","a","21");
        System.out.println(jedis.scard("b"));


        jedis.close();

    }
}
