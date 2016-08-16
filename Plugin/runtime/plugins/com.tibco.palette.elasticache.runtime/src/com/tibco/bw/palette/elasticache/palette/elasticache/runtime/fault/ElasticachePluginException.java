package com.tibco.bw.palette.elasticache.palette.elasticache.runtime.fault;

import javax.xml.namespace.QName;
import org.genxdm.ProcessingContext;
import com.tibco.bw.runtime.ActivityContext;
import com.tibco.neo.localized.BundleMessage;
public class ElasticachePluginException extends ElasticacheActivityBaseException 
{
	private static final long serialVersionUID = 1L;
	
	public <N> ElasticachePluginException(ActivityContext<N> activityContext, Integer code,
			BundleMessage bundleMessage) {
		super(activityContext, code, bundleMessage);
	}
	
	/**
 	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 */
	public QName getFaultElementQName() {
		// begin-custom-code
        // add your own business code here
        // end-custom-code
		return new QName("http://schemas.tibco.com/bw/plugins/Elasticache/ElasticacheExceptions","ElasticachePluginException");
	}
	/**
 	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * This method to set fault data according to design time
	 * @param processingContext
	 *			XML processing context.  
	 */
	public <N> void buildFault(ProcessingContext<N> pcx) {
		N ElasticachePluginException = this.createFaultMessageElement(pcx);
		
		this.setData(ElasticachePluginException);
		// begin-custom-code
        // add your own business code here
        // end-custom-code
	}
	

}
