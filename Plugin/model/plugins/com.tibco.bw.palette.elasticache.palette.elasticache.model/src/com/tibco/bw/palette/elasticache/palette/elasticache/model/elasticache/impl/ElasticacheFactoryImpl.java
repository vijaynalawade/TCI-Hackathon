/**
 */
package com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.impl;

import com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElasticacheFactoryImpl extends EFactoryImpl implements ElasticacheFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ElasticacheFactory init() {
		try {
			ElasticacheFactory theElasticacheFactory = (ElasticacheFactory)EPackage.Registry.INSTANCE.getEFactory(ElasticachePackage.eNS_URI);
			if (theElasticacheFactory != null) {
				return theElasticacheFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ElasticacheFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElasticacheFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ElasticachePackage.GET: return createget();
			case ElasticachePackage.PUT: return createput();
			case ElasticachePackage.DELETE: return createdelete();
			case ElasticachePackage.UPDATE: return createupdate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public get createget() {
		getImpl get = new getImpl();
		return get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public put createput() {
		putImpl put = new putImpl();
		return put;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public delete createdelete() {
		deleteImpl delete = new deleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public update createupdate() {
		updateImpl update = new updateImpl();
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElasticachePackage getElasticachePackage() {
		return (ElasticachePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ElasticachePackage getPackage() {
		return ElasticachePackage.eINSTANCE;
	}

} //ElasticacheFactoryImpl
