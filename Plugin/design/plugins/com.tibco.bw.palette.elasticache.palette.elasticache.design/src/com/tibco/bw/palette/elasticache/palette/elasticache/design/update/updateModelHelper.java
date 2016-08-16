package com.tibco.bw.palette.elasticache.palette.elasticache.design.update;

import org.eclipse.emf.ecore.EObject;
import com.tibco.bw.design.api.BWAbstractModelHelper;
import com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.ElasticacheFactory;
import com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.update;

public class updateModelHelper extends BWAbstractModelHelper {

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
        update activity = ElasticacheFactory.eINSTANCE.createupdate();
        // begin-custom-code
        // end-custom-code
        return activity;
    }
}
