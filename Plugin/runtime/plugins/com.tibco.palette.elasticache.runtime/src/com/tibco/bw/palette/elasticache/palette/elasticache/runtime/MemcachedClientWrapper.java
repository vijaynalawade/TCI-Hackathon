package com.tibco.bw.palette.elasticache.palette.elasticache.runtime;

import java.util.HashMap;

import net.spy.memcached.AddrUtil;
import net.spy.memcached.MemcachedClient;
import net.spy.memcached.internal.OperationFuture;


public class MemcachedClientWrapper {

	private static MemcachedClient client;
	public static String CONNECTION ="ELASTICACHE_CONNECTION";
	private HashMap<?, ?> moduleProperties;

	public MemcachedClientWrapper() {

	}

	public static Object getValue(String key) throws Exception {
		Object result = client.get(key);
		return result;
	}

	public static boolean deleteValue(String key) throws Exception {
		OperationFuture<Boolean> result = client.delete(key);
		 return result.get();
	}

	public static boolean setValue(String key, int expiry, Object value)
			throws Exception {
		OperationFuture<Boolean> result = client.set(key, expiry, value);
		return result.get();
	}

	
	//thread safe
	@SuppressWarnings("rawtypes")
	public  void createClient(HashMap moduleProperties) throws Exception {
		if (client == null) {
			synchronized (MemcachedClientWrapper.class) {
				if(moduleProperties==null||moduleProperties.size()==0)
					moduleProperties = this.moduleProperties;
				this.moduleProperties = moduleProperties;
				if(client == null){
					String connections = (String) moduleProperties
							.get(CONNECTION);
					try {
					client = new MemcachedClient(AddrUtil.getAddresses(connections));
					} catch(Throwable t) {
						t.printStackTrace();
					}
				}
			}
		}
	}
}
