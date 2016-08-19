/**
 */
package com.tibco.bw.palette.elasticache.model.elasticache.impl;

import com.tibco.bw.palette.elasticache.model.elasticache.Delete;
import com.tibco.bw.palette.elasticache.model.elasticache.ElasticacheFactory;
import com.tibco.bw.palette.elasticache.model.elasticache.ElasticachePackage;
import com.tibco.bw.palette.elasticache.model.elasticache.Get;
import com.tibco.bw.palette.elasticache.model.elasticache.Set;
import com.tibco.bw.palette.elasticache.model.elasticache.ValueTypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

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
	private EClass setEClass = null;

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
	private EEnum valueTypesEEnum = null;

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
	 * @see com.tibco.bw.palette.elasticache.model.elasticache.ElasticachePackage#eNS_URI
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

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

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
	public EClass getGet() {
		return getEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGet_Connection() {
		return (EAttribute)getEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGet_Username() {
		return (EAttribute)getEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGet_Password() {
		return (EAttribute)getEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGet_Type() {
		return (EAttribute)getEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGet_ValueTypeQName() {
		return (EAttribute)getEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSet() {
		return setEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Connection() {
		return (EAttribute)setEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Username() {
		return (EAttribute)setEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Password() {
		return (EAttribute)setEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Type() {
		return (EAttribute)setEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_ValueTypeQName() {
		return (EAttribute)setEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelete() {
		return deleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelete_Connection() {
		return (EAttribute)deleteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelete_Username() {
		return (EAttribute)deleteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelete_Password() {
		return (EAttribute)deleteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValueTypes() {
		return valueTypesEEnum;
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
		createEAttribute(getEClass, GET__CONNECTION);
		createEAttribute(getEClass, GET__USERNAME);
		createEAttribute(getEClass, GET__PASSWORD);
		createEAttribute(getEClass, GET__TYPE);
		createEAttribute(getEClass, GET__VALUE_TYPE_QNAME);

		setEClass = createEClass(SET);
		createEAttribute(setEClass, SET__CONNECTION);
		createEAttribute(setEClass, SET__USERNAME);
		createEAttribute(setEClass, SET__PASSWORD);
		createEAttribute(setEClass, SET__TYPE);
		createEAttribute(setEClass, SET__VALUE_TYPE_QNAME);

		deleteEClass = createEClass(DELETE);
		createEAttribute(deleteEClass, DELETE__CONNECTION);
		createEAttribute(deleteEClass, DELETE__USERNAME);
		createEAttribute(deleteEClass, DELETE__PASSWORD);

		// Create enums
		valueTypesEEnum = createEEnum(VALUE_TYPES);
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

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(getEClass, Get.class, "Get", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGet_Connection(), ecorePackage.getEString(), "connection", null, 1, 1, Get.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGet_Username(), ecorePackage.getEString(), "username", null, 0, 1, Get.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGet_Password(), ecorePackage.getEString(), "password", null, 0, 1, Get.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGet_Type(), this.getValueTypes(), "type", "Text", 1, 1, Get.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGet_ValueTypeQName(), theXMLTypePackage.getQName(), "valueTypeQName", null, 0, 1, Get.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setEClass, Set.class, "Set", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSet_Connection(), ecorePackage.getEString(), "connection", null, 1, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSet_Username(), ecorePackage.getEString(), "username", null, 0, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSet_Password(), ecorePackage.getEString(), "password", null, 0, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSet_Type(), this.getValueTypes(), "type", "Text", 1, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSet_ValueTypeQName(), theXMLTypePackage.getQName(), "valueTypeQName", null, 0, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteEClass, Delete.class, "Delete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelete_Connection(), ecorePackage.getEString(), "connection", null, 1, 1, Delete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelete_Username(), ecorePackage.getEString(), "username", null, 0, 1, Delete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelete_Password(), ecorePackage.getEString(), "password", null, 0, 1, Delete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(valueTypesEEnum, ValueTypes.class, "ValueTypes");
		addEEnumLiteral(valueTypesEEnum, ValueTypes.TEXT);
		addEEnumLiteral(valueTypesEEnum, ValueTypes.XML);
		addEEnumLiteral(valueTypesEEnum, ValueTypes.OBJECT);
		addEEnumLiteral(valueTypesEEnum, ValueTypes.BYTES);

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
		  (setEClass, 
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
		  (getGet_Connection(), 
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
		  (getGet_Username(), 
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
		  (getGet_Password(), 
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
		  (getSet_Connection(), 
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
		  (getSet_Username(), 
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
		  (getSet_Password(), 
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
		  (getDelete_Connection(), 
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
		  (getDelete_Username(), 
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
		  (getDelete_Password(), 
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
