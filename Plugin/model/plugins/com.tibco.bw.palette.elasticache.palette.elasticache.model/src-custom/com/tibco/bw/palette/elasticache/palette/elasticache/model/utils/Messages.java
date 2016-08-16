/*
 * This software is confidential and proprietary information of TIBCO Software Inc.
 * Overridable true
 */
package com.tibco.bw.palette.elasticache.palette.elasticache.model.utils;

import java.util.ResourceBundle;
import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "com.tibco.bw.palette.elasticache.palette.elasticache.model.utils.messages";

	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	public static ResourceBundle getBundle() {
		return ResourceBundle.getBundle(BUNDLE_NAME);
	}
    
	
	public static String GET_URL;
	public static String GET_PORT;
	public static String GET_USERNAME;
	public static String GET_PASSWORD;
	public static String PUT_URL;
	public static String PUT_PORT;
	public static String PUT_USERNAME;
	public static String PUT_PASSWORD;
	public static String DELETE_URL;
	public static String DELETE_PORT;
	public static String DELETE_USERNAME;
	public static String DELETE_PASSWORD;
	public static String UPDATE_URL;
	public static String UPDATE_PORT;
	public static String UPDATE_USERNAME;
	public static String UPDATE_PASSWORD;
	public static String PALETTE_PARAMETER_VALUE_INVALID;	
}
