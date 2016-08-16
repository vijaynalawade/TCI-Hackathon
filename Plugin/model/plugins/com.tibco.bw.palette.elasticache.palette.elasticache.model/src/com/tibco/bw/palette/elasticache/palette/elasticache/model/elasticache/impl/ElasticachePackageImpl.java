/**
 */
package com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.impl;

import com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.ElasticacheFactory;
import com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.ElasticachePackage;
import com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.delete;
import com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.get;
import com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.put;
import com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.update;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElasticachePackageImpl extends EPackageImpl implements ElasticachePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass putEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.tibco.bw.palette.elasticache.palette.elasticache.model.elasticache.ElasticachePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ElasticachePackageImpl() {
		super(eNS_URI, ElasticacheFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ElasticachePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ElasticachePackage init() {
		if (isInited) return (ElasticachePackage)EPackage.Registry.INSTANCE.getEPackage(ElasticachePackage.eNS_URI);

		// Obtain or create and register package
		ElasticachePackageImpl theElasticachePackage = (ElasticachePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ElasticachePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ElasticachePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theElasticachePackage.createPackageContents();

		// Initialize created meta-data
		theElasticachePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theElasticachePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ElasticachePackage.eNS_URI, theElasticachePackage);
		return theElasticachePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getget() {
		return getEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getget_Url() {
		return (EAttribute)getEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getget_Port() {
		return (EAttribute)getEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getget_Username() {
		return (EAttribute)getEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getget_Password() {
		return (EAttribute)getEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getput() {
		return putEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getput_Url() {
		return (EAttribute)putEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getput_Port() {
		return (EAttribute)putEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getput_Username() {
		return (EAttribute)putEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getput_Password() {
		return (EAttribute)putEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdelete() {
		return deleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdelete_Url() {
		return (EAttribute)deleteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdelete_Port() {
		return (EAttribute)deleteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdelete_Username() {
		return (EAttribute)deleteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdelete_Password() {
		return (EAttribute)deleteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getupdate() {
		return updateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getupdate_Url() {
		return (EAttribute)updateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getupdate_Port() {
		return (EAttribute)updateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getupdate_Username() {
		return (EAttribute)updateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getupdate_Password() {
		return (EAttribute)updateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElasticacheFactory getElasticacheFactory() {
		return (ElasticacheFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		getEClass = createEClass(GET);
		createEAttribute(getEClass, GET__URL);
		createEAttribute(getEClass, GET__PORT);
		createEAttribute(getEClass, GET__USERNAME);
		createEAttribute(getEClass, GET__PASSWORD);

		putEClass = createEClass(PUT);
		createEAttribute(putEClass, PUT__URL);
		createEAttribute(putEClass, PUT__PORT);
		createEAttribute(putEClass, PUT__USERNAME);
		createEAttribute(putEClass, PUT__PASSWORD);

		deleteEClass = createEClass(DELETE);
		createEAttribute(deleteEClass, DELETE__URL);
		createEAttribute(deleteEClass, DELETE__PORT);
		createEAttribute(deleteEClass, DELETE__USERNAME);
		createEAttribute(deleteEClass, DELETE__PASSWORD);

		updateEClass = createEClass(UPDATE);
		createEAttribute(updateEClass, UPDATE__URL);
		createEAttribute(updateEClass, UPDATE__PORT);
		createEAttribute(updateEClass, UPDATE__USERNAME);
		createEAttribute(updateEClass, UPDATE__PASSWORD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(getEClass, get.class, "get", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getget_Url(), ecorePackage.getEString(), "url", null, 0, 1, get.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getget_Port(), ecorePackage.getEInt(), "port", null, 0, 1, get.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getget_Username(), ecorePackage.getEString(), "username", null, 0, 1, get.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getget_Password(), ecorePackage.getEString(), "password", null, 0, 1, get.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(putEClass, put.class, "put", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getput_Url(), ecorePackage.getEString(), "url", null, 0, 1, put.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getput_Port(), ecorePackage.getEInt(), "port", null, 0, 1, put.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getput_Username(), ecorePackage.getEString(), "username", null, 0, 1, put.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getput_Password(), ecorePackage.getEString(), "password", null, 0, 1, put.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteEClass, delete.class, "delete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getdelete_Url(), ecorePackage.getEString(), "url", null, 0, 1, delete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getdelete_Port(), ecorePackage.getEInt(), "port", null, 0, 1, delete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getdelete_Username(), ecorePackage.getEString(), "username", null, 0, 1, delete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getdelete_Password(), ecorePackage.getEString(), "password", null, 0, 1, delete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateEClass, update.class, "update", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getupdate_Url(), ecorePackage.getEString(), "url", null, 0, 1, update.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getupdate_Port(), ecorePackage.getEInt(), "port", null, 0, 1, update.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getupdate_Username(), ecorePackage.getEString(), "username", null, 0, 1, update.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getupdate_Password(), ecorePackage.getEString(), "password", null, 0, 1, update.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// dkactivityconfig
		createDkactivityconfigAnnotations();
		// dkcontrolconfig
		createDkcontrolconfigAnnotations();
	}

	/**
	 * Initializes the annotations for <b>dkactivityconfig</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDkactivityconfigAnnotations() {
		String source = "dkactivityconfig";	
		addAnnotation
		  (getEClass, 
		   source, 
		   new String[] {
			 "activitytype", "Asynchronous",
			 "schemaType", "XSD Editor",
			 "schemaFile", "getSchema.xsd",
			 "inputelementname", "getInput",
			 "outputelementname", "getOutput",
			 "faultelementname", "",
			 "helpdocuuid", "53e114c1-082e-4bad-9a07-95337edefb60"
		   });	
		addAnnotation
		  (putEClass, 
		   source, 
		   new String[] {
			 "activitytype", "Asynchronous",
			 "schemaType", "XSD Editor",
			 "schemaFile", "putSchema.xsd",
			 "inputelementname", "putInput",
			 "outputelementname", "putOutput",
			 "faultelementname", "",
			 "helpdocuuid", "5c58ef89-fbdc-465a-a289-60d070c92563"
		   });	
		addAnnotation
		  (deleteEClass, 
		   source, 
		   new String[] {
			 "activitytype", "Asynchronous",
			 "schemaType", "XSD Editor",
			 "schemaFile", "deleteSchema.xsd",
			 "inputelementname", "deleteInput",
			 "outputelementname", "deleteOutput",
			 "faultelementname", "",
			 "helpdocuuid", "bc22daf7-3a9d-4ffe-83f7-fc8b3e0f7666"
		   });	
		addAnnotation
		  (updateEClass, 
		   source, 
		   new String[] {
			 "activitytype", "Asynchronous",
			 "schemaType", "XSD Editor",
			 "schemaFile", "updateSchema.xsd",
			 "inputelementname", "updateInput",
			 "outputelementname", "updateOutput",
			 "faultelementname", "",
			 "helpdocuuid", "74d2e317-6e4a-495f-abd8-7d3d6af23090"
		   });
	}

	/**
	 * Initializes the annotations for <b>dkcontrolconfig</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDkcontrolconfigAnnotations() {
		String source = "dkcontrolconfig";	
		addAnnotation
		  (getget_Url(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "false",
			 "label", "URL",
			 "isModelProperty", "false",
			 "control", "TextBox",
			 "value", ""
		   });	
		addAnnotation
		  (getget_Port(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "false",
			 "label", "Port",
			 "isModelProperty", "false",
			 "control", "Spinner",
			 "value", ""
		   });	
		addAnnotation
		  (getget_Username(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "false",
			 "label", "Username",
			 "isModelProperty", "false",
			 "control", "TextBox",
			 "value", ""
		   });	
		addAnnotation
		  (getget_Password(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "false",
			 "label", "Password",
			 "isModelProperty", "false",
			 "control", "TextBox",
			 "value", ""
		   });	
		addAnnotation
		  (getput_Url(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "false",
			 "label", "URL",
			 "isModelProperty", "false",
			 "control", "TextBox",
			 "value", ""
		   });	
		addAnnotation
		  (getput_Port(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "false",
			 "label", "Port",
			 "isModelProperty", "false",
			 "control", "Spinner",
			 "value", ""
		   });	
		addAnnotation
		  (getput_Username(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "false",
			 "label", "Username",
			 "isModelProperty", "false",
			 "control", "TextBox",
			 "value", ""
		   });	
		addAnnotation
		  (getput_Password(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "false",
			 "label", "Password",
			 "isModelProperty", "false",
			 "control", "TextBox",
			 "value", ""
		   });	
		addAnnotation
		  (getdelete_Url(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "false",
			 "label", "URL",
			 "isModelProperty", "false",
			 "control", "TextBox",
			 "value", ""
		   });	
		addAnnotation
		  (getdelete_Port(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "false",
			 "label", "Port",
			 "isModelProperty", "false",
			 "control", "Spinner",
			 "value", ""
		   });	
		addAnnotation
		  (getdelete_Username(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "false",
			 "label", "Username",
			 "isModelProperty", "false",
			 "control", "TextBox",
			 "value", ""
		   });	
		addAnnotation
		  (getdelete_Password(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "false",
			 "label", "Password",
			 "isModelProperty", "false",
			 "control", "TextBox",
			 "value", ""
		   });	
		addAnnotation
		  (getupdate_Url(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "false",
			 "label", "URL",
			 "isModelProperty", "false",
			 "control", "TextBox",
			 "value", ""
		   });	
		addAnnotation
		  (getupdate_Port(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "false",
			 "label", "Port",
			 "isModelProperty", "false",
			 "control", "Spinner",
			 "value", ""
		   });	
		addAnnotation
		  (getupdate_Username(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "false",
			 "label", "Username",
			 "isModelProperty", "false",
			 "control", "TextBox",
			 "value", ""
		   });	
		addAnnotation
		  (getupdate_Password(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "false",
			 "label", "Password",
			 "isModelProperty", "false",
			 "control", "TextBox",
			 "value", ""
		   });
	}

} //ElasticachePackageImpl
