package com.tibco.bw.palette.elasticache.palette.elasticache.design.get;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import com.tibco.bw.design.field.AttributeBindingField;
import com.tibco.bw.design.field.BWFieldFactory;
import com.tibco.bw.design.propertysection.AbstractBWTransactionalSection;
import com.tibco.bw.design.util.PropertyTypeQnameConstants;
import com.tibco.bw.palette.elasticache.model.elasticache.ElasticachePackage;
import com.tibco.bw.palette.elasticache.model.elasticache.Get;
import com.tibco.bw.palette.elasticache.model.elasticache.utils.Messages;

/**
 * General tab properties for the activity.
 */
public class getGeneralSection extends AbstractBWTransactionalSection {
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * 
	 * @generated
	 */
	private Text connectionField;
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * 
	 * @generated
	 */
	private Text usernameField;
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * 
	 * @generated
	 */
	private Text passwordField;

	private AttributeBindingField connection = null;
	private AttributeBindingField userName = null;
	private AttributeBindingField password = null;

	@Override
	protected Class<?> getModelClass() {
		return Get.class;
	}

	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * 
	 * @generated
	 *
	 *            Initialize bindings of controls to the input.
	 */
	@Override
	protected void initBindings() {
		getBindingManager().bind(connection, getInput(),
				ElasticachePackage.Literals.GET__CONNECTION);
		getBindingManager().bind(userName, getInput(),
				ElasticachePackage.Literals.GET__USERNAME);
		getBindingManager().bind(password, getInput(),
				ElasticachePackage.Literals.GET__PASSWORD);
		// begin-custom-code
		// end-custom-code
	}

	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * 
	 * @generated
	 *
	 *            This method to create the section-specific UI.
	 * @param root
	 * @return
	 */
	@Override
	protected Composite doCreateControl(final Composite root) {
		Composite parent = BWFieldFactory.getInstance()
				.createComposite(root, 2);
		BWFieldFactory.getInstance().createLabel(parent,
				Messages.GET_CONNECTION, true);
		connectionField = BWFieldFactory.getInstance().createTextBox(parent);
		connection = BWFieldFactory.getInstance().createAttributeBindingField(
				parent, connectionField,
				PropertyTypeQnameConstants.STRING_PRIMITIVE, true);

		BWFieldFactory.getInstance().createLabel(parent, Messages.GET_USERNAME,
				false);
		usernameField = BWFieldFactory.getInstance().createTextBox(parent);
		userName = BWFieldFactory.getInstance().createAttributeBindingField(
				parent, usernameField,
				PropertyTypeQnameConstants.STRING_PRIMITIVE, true);

		BWFieldFactory.getInstance().createLabel(parent, Messages.GET_PASSWORD,
				false);
		passwordField = BWFieldFactory.getInstance().createTextBox(parent);
		password = BWFieldFactory.getInstance().createAttributeBindingField(
				parent, passwordField,
				PropertyTypeQnameConstants.STRING_PRIMITIVE, true);

		// begin-custom-code
		// end-custom-code
		return parent;
	}

}
