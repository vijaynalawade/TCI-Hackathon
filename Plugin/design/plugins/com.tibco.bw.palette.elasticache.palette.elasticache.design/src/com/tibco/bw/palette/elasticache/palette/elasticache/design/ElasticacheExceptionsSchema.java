package com.tibco.bw.palette.elasticache.palette.elasticache.design;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDSchema;
import com.tibco.bw.design.api.BWExtensionActivitySchema;

public class ElasticacheExceptionsSchema extends BWExtensionActivitySchema 

{
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 * File location
	 */
    private static String SCHEMA_FILE_PATH = "/schema/ElasticacheExceptions.xsd"; //$NON-NLS-1$
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 * The name of the fault elements
	 */
    private static final String[] ELASTICACHE_PLUGIN_FAULT_TYPE_ELEMENT_NAMES = new String[] { "ElasticachePluginException" }; //$NON-NLS-1$
    private static ElasticacheExceptionsSchema INSTANCE = new ElasticacheExceptionsSchema();
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
       // begin-custom-code
       // end-custom-code
       return getClass().getResourceAsStream(ElasticacheExceptionsSchema.SCHEMA_FILE_PATH);
    }
   
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 * Get the fault elements
	 * @return list of elements
	 */
    public static List<XSDElementDeclaration> getElasticachePluginFaultTypes() {
       // begin-custom-code
       // end-custom-code
       return getFaultElements(ElasticacheExceptionsSchema.ELASTICACHE_PLUGIN_FAULT_TYPE_ELEMENT_NAMES);
    }
    
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Get the fault elements according to the fault names
	 * @param faultNames
	 * @return list of elements
	 */
    private static List<XSDElementDeclaration> getFaultElements(final String[] faultNames) {
       List<XSDElementDeclaration> faultTypeElements = new ArrayList<XSDElementDeclaration>();
       XSDSchema fileExceptionsSchema = ElasticacheExceptionsSchema.INSTANCE.loadSchema();  
       if(fileExceptionsSchema != null) {
          for (String faultElementName : faultNames) {
             XSDElementDeclaration faultTypesElement = fileExceptionsSchema.resolveElementDeclaration(faultElementName);
             if(faultTypesElement != null) {
                faultTypeElements.add(faultTypesElement);
             }
          }
       }
       // begin-custom-code
       // end-custom-code
       return faultTypeElements;
    }
}
