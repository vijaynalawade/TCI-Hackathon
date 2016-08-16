/**
 */
package com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.ElasticachePackage
 * @generated
 */
public interface ElasticacheFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ElasticacheFactory eINSTANCE = com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.impl.ElasticacheFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>get</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>get</em>'.
	 * @generated
	 */
	get createget();

	/**
	 * Returns a new object of class '<em>put</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>put</em>'.
	 * @generated
	 */
	put createput();

	/**
	 * Returns a new object of class '<em>delete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>delete</em>'.
	 * @generated
	 */
	delete createdelete();

	/**
	 * Returns a new object of class '<em>update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>update</em>'.
	 * @generated
	 */
	update createupdate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ElasticachePackage getElasticachePackage();

} //ElasticacheFactory
