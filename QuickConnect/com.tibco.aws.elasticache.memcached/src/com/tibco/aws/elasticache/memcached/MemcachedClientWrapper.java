package com.tibco.aws.elasticache.memcached;

import java.util.HashMap;

import net.spy.memcached.AddrUtil;
import net.spy.memcached.MemcachedClient;
import net.spy.memcached.internal.OperationFuture;

import com.tibco.bw.palette.shared.java.ModuleProperties;

public class MemcachedClientWrapper {

	private static MemcachedClient client;

	public MemcachedClientWrapper() {

	}

	public static String getValue(String key) throws Exception {
		String result = (String) client.get(key);
		if (result == null) {
			throw new Exception("Failed to get value for Key[" + key
					+ "]. Key not found.");
		}
		return result;
	}

	public static void deleteValue(String key) throws Exception {
		OperationFuture<Boolean> result = client.delete(key);
		if (!result.get()) {
			throw new Exception("Failed to delete value for Key[" + key
					+ "]. Operation Status=" + result.getStatus().getMessage());
		}
	}

	public static void setValue(String key, int expiry, String value)
			throws Exception {
		OperationFuture<Boolean> result = client.set(key, expiry, value);
		if (!result.get()) {
			throw new Exception("Failed to set value for Key[" + key
					+ "]. Operation Status=" + result.getStatus().getMessage());
		}
	}

	@SuppressWarnings("rawtypes")
	@ModuleProperties
	public void createClient(HashMap moduleProperties) throws Exception {
		if (client == null) {
			String connections = (String) moduleProperties
					.get("ELASTICACHE_CONNECTION");
			System.out.println(connections);
			client = new MemcachedClient(AddrUtil.getAddresses(connections));
		}
	}
}
