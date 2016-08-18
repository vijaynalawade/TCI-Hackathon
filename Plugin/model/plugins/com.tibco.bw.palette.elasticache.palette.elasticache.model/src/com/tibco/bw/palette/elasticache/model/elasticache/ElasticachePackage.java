/**
 */
package com.tibco.bw.palette.elasticache.model.elasticache;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.tibco.bw.palette.elasticache.model.elasticache.ElasticacheFactory
 * @model kind="package"
 * @generated
 */
public interface ElasticachePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "elasticache";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ns.tibco.com/bw/palette/elasticache";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "elasticache";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ElasticachePackage eINSTANCE = com.tibco.bw.palette.elasticache.model.elasticache.impl.ElasticachePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.tibco.bw.palette.elasticache.model.elasticache.impl.GetImpl <em>Get</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.impl.GetImpl
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.impl.ElasticachePackageImpl#getGet()
	 * @generated
	 */
	int GET = 0;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__USERNAME = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__PASSWORD = 2;

	/**
	 * The number of structural features of the '<em>Get</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.tibco.bw.palette.elasticache.model.elasticache.impl.SetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.impl.SetImpl
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.impl.ElasticachePackageImpl#getSet()
	 * @generated
	 */
	int SET = 1;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__USERNAME = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__PASSWORD = 2;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.tibco.bw.palette.elasticache.model.elasticache.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.impl.DeleteImpl
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.impl.ElasticachePackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 2;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__USERNAME = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__PASSWORD = 2;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.tibco.bw.palette.elasticache.model.elasticache.impl.UpdateImpl <em>Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.impl.UpdateImpl
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.impl.ElasticachePackageImpl#getUpdate()
	 * @generated
	 */
	int UPDATE = 3;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__USERNAME = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__PASSWORD = 2;

	/**
	 * The number of structural features of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link com.tibco.bw.palette.elasticache.model.elasticache.Get <em>Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get</em>'.
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.Get
	 * @generated
	 */
	EClass getGet();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.elasticache.model.elasticache.Get#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection</em>'.
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.Get#getConnection()
	 * @see #getGet()
	 * @generated
	 */
	EAttribute getGet_Connection();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.elasticache.model.elasticache.Get#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.Get#getUsername()
	 * @see #getGet()
	 * @generated
	 */
	EAttribute getGet_Username();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.elasticache.model.elasticache.Get#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.Get#getPassword()
	 * @see #getGet()
	 * @generated
	 */
	EAttribute getGet_Password();

	/**
	 * Returns the meta object for class '{@link com.tibco.bw.palette.elasticache.model.elasticache.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.Set
	 * @generated
	 */
	EClass getSet();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.elasticache.model.elasticache.Set#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection</em>'.
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.Set#getConnection()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_Connection();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.elasticache.model.elasticache.Set#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.Set#getUsername()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_Username();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.elasticache.model.elasticache.Set#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.Set#getPassword()
	 * @see #getSet()
	 * @generated
	 */
	EAttribute getSet_Password();

	/**
	 * Returns the meta object for class '{@link com.tibco.bw.palette.elasticache.model.elasticache.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.elasticache.model.elasticache.Delete#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection</em>'.
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.Delete#getConnection()
	 * @see #getDelete()
	 * @generated
	 */
	EAttribute getDelete_Connection();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.elasticache.model.elasticache.Delete#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.Delete#getUsername()
	 * @see #getDelete()
	 * @generated
	 */
	EAttribute getDelete_Username();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.elasticache.model.elasticache.Delete#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.Delete#getPassword()
	 * @see #getDelete()
	 * @generated
	 */
	EAttribute getDelete_Password();

	/**
	 * Returns the meta object for class '{@link com.tibco.bw.palette.elasticache.model.elasticache.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update</em>'.
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.Update
	 * @generated
	 */
	EClass getUpdate();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.elasticache.model.elasticache.Update#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection</em>'.
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.Update#getConnection()
	 * @see #getUpdate()
	 * @generated
	 */
	EAttribute getUpdate_Connection();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.elasticache.model.elasticache.Update#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.Update#getUsername()
	 * @see #getUpdate()
	 * @generated
	 */
	EAttribute getUpdate_Username();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.elasticache.model.elasticache.Update#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.Update#getPassword()
	 * @see #getUpdate()
	 * @generated
	 */
	EAttribute getUpdate_Password();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ElasticacheFactory getElasticacheFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.tibco.bw.palette.elasticache.model.elasticache.impl.GetImpl <em>Get</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tibco.bw.palette.elasticache.model.elasticache.impl.GetImpl
		 * @see com.tibco.bw.palette.elasticache.model.elasticache.impl.ElasticachePackageImpl#getGet()
		 * @generated
		 */
		EClass GET = eINSTANCE.getGet();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET__CONNECTION = eINSTANCE.getGet_Connection();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET__USERNAME = eINSTANCE.getGet_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET__PASSWORD = eINSTANCE.getGet_Password();

		/**
		 * The meta object literal for the '{@link com.tibco.bw.palette.elasticache.model.elasticache.impl.SetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tibco.bw.palette.elasticache.model.elasticache.impl.SetImpl
		 * @see com.tibco.bw.palette.elasticache.model.elasticache.impl.ElasticachePackageImpl#getSet()
		 * @generated
		 */
		EClass SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET__CONNECTION = eINSTANCE.getSet_Connection();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET__USERNAME = eINSTANCE.getSet_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET__PASSWORD = eINSTANCE.getSet_Password();

		/**
		 * The meta object literal for the '{@link com.tibco.bw.palette.elasticache.model.elasticache.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tibco.bw.palette.elasticache.model.elasticache.impl.DeleteImpl
		 * @see com.tibco.bw.palette.elasticache.model.elasticache.impl.ElasticachePackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE__CONNECTION = eINSTANCE.getDelete_Connection();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE__USERNAME = eINSTANCE.getDelete_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE__PASSWORD = eINSTANCE.getDelete_Password();

		/**
		 * The meta object literal for the '{@link com.tibco.bw.palette.elasticache.model.elasticache.impl.UpdateImpl <em>Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tibco.bw.palette.elasticache.model.elasticache.impl.UpdateImpl
		 * @see com.tibco.bw.palette.elasticache.model.elasticache.impl.ElasticachePackageImpl#getUpdate()
		 * @generated
		 */
		EClass UPDATE = eINSTANCE.getUpdate();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE__CONNECTION = eINSTANCE.getUpdate_Connection();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE__USERNAME = eINSTANCE.getUpdate_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE__PASSWORD = eINSTANCE.getUpdate_Password();

	}

} //ElasticachePackage
