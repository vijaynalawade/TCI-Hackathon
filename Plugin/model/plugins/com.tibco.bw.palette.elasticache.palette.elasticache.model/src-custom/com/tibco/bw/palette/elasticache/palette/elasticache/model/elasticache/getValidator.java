package com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache;

import com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.get;
import com.tibco.bw.validation.process.ActivityConfigurationValidator;
import com.tibco.bw.validation.process.ActivityValidationContext;

public class getValidator implements ActivityConfigurationValidator {	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 * Validates Activity model configuration.
	 * @param context
	 *			The activity validation context.Developers can retrieve following informations:
	 *          <li> Activity Configuration Model(EMF model)</li>
 	 *          <li> Name of the EventSource Activity</li>
     *          <li> Value of process property used in Activity Configuration</li>
     *          <li> Name of property configured in the Attribute Binding Field</li>
     *          <li> Name of the process</li><br>
	 */	
	@Override
	public void validateBWActivityConfiguration(ActivityValidationContext context) {
	    @SuppressWarnings("unused")
	    get model =(get) context.getActivityConfigurationModel();    	
			
		// begin-custom-code
	    // end-custom-code
  	}
}
