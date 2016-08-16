package com.tibco.bw.palette.elasticache.palette.elasticache.design.delete;

import org.eclipse.swt.SWT;
import com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.ElasticachePackage;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Spinner;

import org.eclipse.swt.widgets.Composite;
import com.tibco.bw.design.field.BWFieldFactory;
import com.tibco.bw.design.propertysection.AbstractBWTransactionalSection;
import com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.delete;
import com.tibco.bw.palette.elasticache.palette.elasticache.model.utils.Messages;
/**
 * General tab properties for the activity.
 */
public class deleteGeneralSection extends AbstractBWTransactionalSection {
   /**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*/
    private Text url;
   /**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*/
    private Spinner port;
   /**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*/
    private Text username;
   /**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*/
    private Text password;


    @Override
    protected Class<?> getModelClass() {
       return delete.class;
    }

    /**
	 * <!-- begin-custom-doc -->
     * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Initialize bindings of controls to the input. 
	 */
    @Override
    protected void initBindings() {
        getBindingManager().bind(url, getInput(), ElasticachePackage.Literals.DELETE__URL); 
        getBindingManager().bind(port, getInput(), ElasticachePackage.Literals.DELETE__PORT); 
        getBindingManager().bind(username, getInput(), ElasticachePackage.Literals.DELETE__USERNAME); 
        getBindingManager().bind(password, getInput(), ElasticachePackage.Literals.DELETE__PASSWORD); 
   	    // begin-custom-code
        // end-custom-code
    }

	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * This method to create the section-specific UI.
	 * @param root
	 * @return
	 */
    @Override
    protected Composite doCreateControl(final Composite root) {
        Composite parent = BWFieldFactory.getInstance().createComposite(root, 2);
   	    BWFieldFactory.getInstance().createLabel(parent, Messages.DELETE_URL, false);
   	    url = BWFieldFactory.getInstance().createTextBox(parent);

   	    BWFieldFactory.getInstance().createLabel(parent, Messages.DELETE_PORT, false);
   	    port = BWFieldFactory.getInstance().createSpinner(parent, 2, SWT.BORDER);

   	    BWFieldFactory.getInstance().createLabel(parent, Messages.DELETE_USERNAME, false);
   	    username = BWFieldFactory.getInstance().createTextBox(parent);

   	    BWFieldFactory.getInstance().createLabel(parent, Messages.DELETE_PASSWORD, false);
   	    password = BWFieldFactory.getInstance().createTextBox(parent);

        // begin-custom-code
        // end-custom-code
        return parent;
    }
  

}
