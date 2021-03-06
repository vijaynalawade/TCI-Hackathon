package com.tibco.bw.palette.elasticache.palette.elasticache.design.delete;

import org.eclipse.emf.ecore.EObject;

import com.tibco.bw.design.api.BWAbstractModelHelper;
import com.tibco.bw.palette.elasticache.model.elasticache.Delete;
import com.tibco.bw.palette.elasticache.model.elasticache.ElasticacheFactory;

public class DeleteModelHelper extends BWAbstractModelHelper {

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
        Delete activity = ElasticacheFactory.eINSTANCE.createDelete();
        // begin-custom-code
        // end-custom-code
        return activity;
    }
}
