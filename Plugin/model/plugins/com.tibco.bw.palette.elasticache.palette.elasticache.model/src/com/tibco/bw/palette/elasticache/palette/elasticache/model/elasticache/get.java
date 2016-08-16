/**
 */
package com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>get</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.get#getUrl <em>Url</em>}</li>
 *   <li>{@link com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.get#getPort <em>Port</em>}</li>
 *   <li>{@link com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.get#getUsername <em>Username</em>}</li>
 *   <li>{@link com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.get#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.ElasticachePackage#getget()
 * @model annotation="dkactivityconfig activitytype='Asynchronous' schemaType='XSD Editor' schemaFile='getSchema.xsd' inputelementname='getInput' outputelementname='getOutput' faultelementname='' helpdocuuid='53e114c1-082e-4bad-9a07-95337edefb60'"
 * @generated
 */
public interface get extends EObject {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.ElasticachePackage#getget_Url()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='false' label='URL' isModelProperty='false' control='TextBox' value=''"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.get#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.ElasticachePackage#getget_Port()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='false' label='Port' isModelProperty='false' control='Spinner' value=''"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.get#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.ElasticachePackage#getget_Username()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='false' label='Username' isModelProperty='false' control='TextBox' value=''"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.get#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.ElasticachePackage#getget_Password()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='false' label='Password' isModelProperty='false' control='TextBox' value=''"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.get#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // get
