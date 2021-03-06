package com.tibco.bw.palette.elasticache.palette.elasticache.design.set;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDSimpleTypeDefinition;
import org.eclipse.xsd.XSDTypeDefinition;

import com.tibco.bw.design.api.BWExtensionActivitySchema;

import java.io.InputStream;

import org.eclipse.xsd.XSDSchema;

public class SetSchema extends BWExtensionActivitySchema {
	private static SetSchema INSTANCE = new SetSchema();
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * File location.
	 */
	private static final String SCHEMA_FILE_PATH = "/schema/putSchema.xsd";
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * The name of the input element.
	 */
	private static final String INPUT_TYPE_ELEMENT_NAME = "ActivityInput";
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * The name of the output element.
	 */
	private static final String OUTPUT_TYPE_ELEMENT_NAME = "putOutput";
	private static final String JAVA_OBJECT_REFERENCE_TYPE = "nativeJavaObjectKey";
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Get the input element according to the input name.
	 *
	 * @return input element
	 */
	public static XSDElementDeclaration getInputType() {
     	XSDSchema activitySignatureSchema = INSTANCE.loadSchema();
		XSDElementDeclaration activityInputType = null;
		if (activitySignatureSchema != null) {
			activityInputType = activitySignatureSchema.resolveElementDeclaration(INPUT_TYPE_ELEMENT_NAME);
		}
		// begin-custom-code
        // end-custom-code
		return activityInputType;
	}
	
	public static XSDSimpleTypeDefinition getJavaObjectType() {
     	XSDSchema activitySignatureSchema = INSTANCE.loadSchema();
     	XSDSimpleTypeDefinition activityInputType = null;
		if (activitySignatureSchema != null) {
			activityInputType = activitySignatureSchema.resolveSimpleTypeDefinition(JAVA_OBJECT_REFERENCE_TYPE);
		}
		// begin-custom-code
        // end-custom-code
		return activityInputType;
	}

	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Get the output element according to the output name.
	 *
	 * @return output element
	 */
	public static XSDElementDeclaration getOutputType() {
     	XSDSchema activitySignatureSchema = INSTANCE.loadSchema(); 
		XSDElementDeclaration activityOutputType = null;
		if (activitySignatureSchema != null) {
			activityOutputType = activitySignatureSchema.resolveElementDeclaration(OUTPUT_TYPE_ELEMENT_NAME);
		}
		// begin-custom-code
        // end-custom-code
		return activityOutputType;
	}	
	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Use the Java class loader to find and create a stream to the resource based on schema location in the workspace.
	 * @return stream to read the schema resource.	
	 */
	@Override
	protected InputStream getSchemaAsInputStream() {
		return this.getClass().getResourceAsStream(SCHEMA_FILE_PATH);
	}
	
}
