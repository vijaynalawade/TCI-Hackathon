/**
 */
package com.tibco.bw.palette.elasticache.model.elasticache.impl;

import com.tibco.bw.palette.elasticache.model.elasticache.ElasticachePackage;
import com.tibco.bw.palette.elasticache.model.elasticache.Get;
import com.tibco.bw.palette.elasticache.model.elasticache.ValueTypes;

import javax.xml.namespace.QName;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.bw.palette.elasticache.model.elasticache.impl.GetImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link com.tibco.bw.palette.elasticache.model.elasticache.impl.GetImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link com.tibco.bw.palette.elasticache.model.elasticache.impl.GetImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link com.tibco.bw.palette.elasticache.model.elasticache.impl.GetImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.tibco.bw.palette.elasticache.model.elasticache.impl.GetImpl#getValueTypeQName <em>Value Type QName</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GetImpl extends EObjectImpl implements Get {
	/**
	 * The default value of the '{@link #getConnection() <em>Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected String connection = CONNECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ValueTypes TYPE_EDEFAULT = ValueTypes.TEXT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ValueTypes type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueTypeQName() <em>Value Type QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTypeQName()
	 * @generated
	 * @ordered
	 */
	protected static final QName VALUE_TYPE_QNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueTypeQName() <em>Value Type QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTypeQName()
	 * @generated
	 * @ordered
	 */
	protected QName valueTypeQName = VALUE_TYPE_QNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElasticachePackage.Literals.GET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnection() {
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection(String newConnection) {
		String oldConnection = connection;
		connection = newConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticachePackage.GET__CONNECTION, oldConnection, connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticachePackage.GET__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticachePackage.GET__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTypes getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ValueTypes newType) {
		ValueTypes oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticachePackage.GET__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getValueTypeQName() {
		return valueTypeQName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueTypeQName(QName newValueTypeQName) {
		QName oldValueTypeQName = valueTypeQName;
		valueTypeQName = newValueTypeQName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticachePackage.GET__VALUE_TYPE_QNAME, oldValueTypeQName, valueTypeQName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ElasticachePackage.GET__CONNECTION:
				return getConnection();
			case ElasticachePackage.GET__USERNAME:
				return getUsername();
			case ElasticachePackage.GET__PASSWORD:
				return getPassword();
			case ElasticachePackage.GET__TYPE:
				return getType();
			case ElasticachePackage.GET__VALUE_TYPE_QNAME:
				return getValueTypeQName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ElasticachePackage.GET__CONNECTION:
				setConnection((String)newValue);
				return;
			case ElasticachePackage.GET__USERNAME:
				setUsername((String)newValue);
				return;
			case ElasticachePackage.GET__PASSWORD:
				setPassword((String)newValue);
				return;
			case ElasticachePackage.GET__TYPE:
				setType((ValueTypes)newValue);
				return;
			case ElasticachePackage.GET__VALUE_TYPE_QNAME:
				setValueTypeQName((QName)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ElasticachePackage.GET__CONNECTION:
				setConnection(CONNECTION_EDEFAULT);
				return;
			case ElasticachePackage.GET__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case ElasticachePackage.GET__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case ElasticachePackage.GET__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ElasticachePackage.GET__VALUE_TYPE_QNAME:
				setValueTypeQName(VALUE_TYPE_QNAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ElasticachePackage.GET__CONNECTION:
				return CONNECTION_EDEFAULT == null ? connection != null : !CONNECTION_EDEFAULT.equals(connection);
			case ElasticachePackage.GET__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case ElasticachePackage.GET__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case ElasticachePackage.GET__TYPE:
				return type != TYPE_EDEFAULT;
			case ElasticachePackage.GET__VALUE_TYPE_QNAME:
				return VALUE_TYPE_QNAME_EDEFAULT == null ? valueTypeQName != null : !VALUE_TYPE_QNAME_EDEFAULT.equals(valueTypeQName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (connection: ");
		result.append(connection);
		result.append(", username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(", type: ");
		result.append(type);
		result.append(", valueTypeQName: ");
		result.append(valueTypeQName);
		result.append(')');
		return result.toString();
	}

} //GetImpl
