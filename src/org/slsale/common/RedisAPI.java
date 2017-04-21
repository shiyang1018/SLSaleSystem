package org.slsale.common;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisAPI {
	public JedisPool jedisPool;//redis的连接池

	public JedisPool getJedisPool() {
		return jedisPool;
	}

	public void setJedisPool(JedisPool jedisPool) {
		this.jedisPool = jedisPool;
	}
	
	/**
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public boolean set(String key,String value){
		Jedis jedis =null;
		try {
			jedis = jedisPool.getResource();
			jedis.set(key, value);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			returnResource(jedisPool, jedis);
		}
		return false;
	}
	/**
	 * 判断某个key是否存在
	 * @param key
	 * @return
	 */
	public boolean exist(String key){
		Jedis jedis =null;
		try {
			jedis = jedisPool.getResource();
			return jedis.exists(key);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			returnResource(jedisPool, jedis);
		}
		return false;
	}
	
	/**
	 * 获取数据
	 * @param key
	 * @return
	 */
	public String get(String key){
		String value = null;
		Jedis jedis =null;
		try {
			jedis = jedisPool.getResource();
			value = jedis.get(key);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			returnResource(jedisPool, jedis);
		}
		return value;
	}
	
	public static void returnResource(JedisPool jedisPool,Jedis jedis){
		if(jedis !=null){
			jedisPool.returnResource(jedis);
		}
	}
}
