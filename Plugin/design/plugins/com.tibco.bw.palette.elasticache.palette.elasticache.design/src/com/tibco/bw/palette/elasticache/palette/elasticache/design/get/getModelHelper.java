package com.tibco.bw.palette.elasticache.palette.elasticache.design.get;

import org.eclipse.emf.ecore.EObject;
import com.tibco.bw.design.api.BWAbstractModelHelper;
import com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.ElasticacheFactory;
import com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.get;

public class getModelHelper extends BWAbstractModelHelper {

	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Create an instance of the activity configuration model and provide "good" default values.
	 *
	 * @return new instance
	 */
    @Override
    public EObject createInstance() {
        get activity = ElasticacheFactory.eINSTANCE.createget();
        // begin-custom-code
        // end-custom-code
        return activity;
    }
}
