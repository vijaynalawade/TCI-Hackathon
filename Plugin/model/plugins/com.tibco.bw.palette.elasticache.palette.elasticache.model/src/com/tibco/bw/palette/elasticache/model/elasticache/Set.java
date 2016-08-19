/**
 */
package com.tibco.bw.palette.elasticache.model.elasticache;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.bw.palette.elasticache.model.elasticache.Set#getConnection <em>Connection</em>}</li>
 *   <li>{@link com.tibco.bw.palette.elasticache.model.elasticache.Set#getUsername <em>Username</em>}</li>
 *   <li>{@link com.tibco.bw.palette.elasticache.model.elasticache.Set#getPassword <em>Password</em>}</li>
 *   <li>{@link com.tibco.bw.palette.elasticache.model.elasticache.Set#getType <em>Type</em>}</li>
 *   <li>{@link com.tibco.bw.palette.elasticache.model.elasticache.Set#getValueTypeQName <em>Value Type QName</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.bw.palette.elasticache.model.elasticache.ElasticachePackage#getSet()
 * @model annotation="dkactivityconfig activitytype='Asynchronous' schemaType='XSD Editor' schemaFile='putSchema.xsd' inputelementname='putInput' outputelementname='putOutput' faultelementname='' helpdocuuid='5c58ef89-fbdc-465a-a289-60d070c92563'"
 * @generated
 */
public interface Set extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' attribute.
	 * @see #setConnection(String)
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.ElasticachePackage#getSet_Connection()
	 * @model required="true"
	 *        annotation="dkcontrolconfig sectionName='General' isRequired='false' label='URL' isModelProperty='false' control='TextBox' value=''"
	 * @generated
	 */
	String getConnection();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.elasticache.model.elasticache.Set#getConnection <em>Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' attribute.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(String value);

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
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.ElasticachePackage#getSet_Username()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='false' label='Username' isModelProperty='false' control='TextBox' value=''"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.elasticache.model.elasticache.Set#getUsername <em>Username</em>}' attribute.
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
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.ElasticachePackage#getSet_Password()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='false' label='Password' isModelProperty='false' control='TextBox' value=''"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.elasticache.model.elasticache.Set#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Text"</code>.
	 * The literals are from the enumeration {@link com.tibco.bw.palette.elasticache.model.elasticache.ValueTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.ValueTypes
	 * @see #setType(ValueTypes)
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.ElasticachePackage#getSet_Type()
	 * @model default="Text" required="true"
	 * @generated
	 */
	ValueTypes getType();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.elasticache.model.elasticache.Set#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.ValueTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(ValueTypes value);

	/**
	 * Returns the value of the '<em><b>Value Type QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type QName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type QName</em>' attribute.
	 * @see #setValueTypeQName(QName)
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.ElasticachePackage#getSet_ValueTypeQName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 * @generated
	 */
	QName getValueTypeQName();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.elasticache.model.elasticache.Set#getValueTypeQName <em>Value Type QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type QName</em>' attribute.
	 * @see #getValueTypeQName()
	 * @generated
	 */
	void setValueTypeQName(QName value);

} // Set
