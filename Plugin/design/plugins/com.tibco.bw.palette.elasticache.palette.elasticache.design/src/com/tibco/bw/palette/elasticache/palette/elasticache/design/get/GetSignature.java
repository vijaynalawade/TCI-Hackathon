package com.tibco.bw.palette.elasticache.palette.elasticache.design.get;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xsd.XSDComplexTypeDefinition;
import org.eclipse.xsd.XSDCompositor;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDFactory;
import org.eclipse.xsd.XSDImport;
import org.eclipse.xsd.XSDModelGroup;
import org.eclipse.xsd.XSDParticle;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDTypeDefinition;
import org.eclipse.xsd.util.XSDConstants;

import com.tibco.bw.design.api.BWActivitySignature;
import com.tibco.bw.design.util.ModelHelper;
import com.tibco.bw.palette.elasticache.model.elasticache.Get;
import com.tibco.bw.palette.elasticache.model.elasticache.ValueTypes;
import com.tibco.bw.palette.elasticache.palette.elasticache.design.ElasticacheExceptionsSchema;
import com.tibco.bw.palette.elasticache.palette.elasticache.design.JavaObjectSchema;
import com.tibco.bw.palette.elasticache.palette.elasticache.design.set.SetSignature;
import com.tibco.bw.model.activityconfig.Configuration;
/**
 * <!-- begin-custom-doc -->
 * 
 * <!-- end-custom-doc -->
 * @generated
 * 
 */
public class GetSignature extends BWActivitySignature {
	
	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * By default all activities have input.
	 * 
	 * Return false if activity doesn't want a InputTab.
	 *
	 * @return
	 */
    @Override
    public boolean hasInput() {
    	// begin-custom-code
        // end-custom-code
        return true;
    }
   	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 * By default all activities have output.
	 * 
	 * Return false if activity doesn't want a OutputTab.
	 * 
	 * @return
	 */
    @Override
    public boolean hasOutput() {
    	// begin-custom-code
        // end-custom-code
        return true;
    }
     
   /**
	* <!-- begin-custom-doc -->
	*
	* <!-- end-custom-doc -->
	* @generated
	*
	* Method to return the input element declaration of this activity.
	* @param config
	*			activity configuration
	* @return the input element declaration
	*/
    @Override
    public XSDElementDeclaration getInputType(final Configuration config) {
        XSDElementDeclaration inputType = null;
        inputType =  GetSchema.getInputType(); 
        // begin-custom-code
        // end-custom-code
        return inputType;
    } 
   /**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*
	* Method to return the output element declaration of this activity.
	* @param config
	*			activity configuration
	* @return the output element declaration
	*/
    @Override
    public XSDElementDeclaration getOutputType(final Configuration config) {
    	Get model = (Get) getDefaultEMFConfigObject(config);
        XSDElementDeclaration outputElement =  GetSchema.getOutputType();
        String namespace = createNamespace(new Object[] {
				outputElement.getSchema(), config, "output" }); //$NON-NLS-1$
		updateNamespace(outputElement, namespace);

		XSDSchema schema = outputElement.getSchema();
		XSDElementDeclaration bodyElement = getChildElement(outputElement,
				SetSignature.VALUE_ELEMENT_NAME, false);
		if (model.getType() == ValueTypes.BYTES) {
			bodyElement.setTypeDefinition(schema.resolveTypeDefinition(
					XSDConstants.SCHEMA_FOR_SCHEMA_URI_2001, SetSignature.XSD_BASE64BINARY));
		} else if (model.getType() == ValueTypes.XML) {
			XSDElementDeclaration element = ModelHelper.INSTANCE
					.getXSDElementByQName(model, model.getValueTypeQName());
			if (element != null) {
				XSDComplexTypeDefinition anonymousComplexType = xsdFactory
						.createXSDComplexTypeDefinition();
				XSDParticle groupParticle = xsdFactory.createXSDParticle();
				XSDModelGroup group = xsdFactory.createXSDModelGroup();
				group.setCompositor(XSDCompositor.SEQUENCE_LITERAL);
				XSDParticle refElementParticle = xsdFactory.createXSDParticle();
				XSDElementDeclaration refElement = xsdFactory
						.createXSDElementDeclaration();
				refElement.setName(SetSignature.REF_ELEMENT_NAME);
				refElementParticle.setContent(refElement);
				group.getContents().add(refElementParticle);
				groupParticle.setContent(group);
				anonymousComplexType.setContent(groupParticle);
				anonymousComplexType.setContentType(groupParticle);

				bodyElement.setTypeDefinition(anonymousComplexType);
				bodyElement.setAnonymousTypeDefinition(anonymousComplexType);

				// Fix for AMBW-20573
				if (element.getTargetNamespace() == null) {
					refElement.getElement().setAttribute(SetSignature.XML_MAMESPACE, "");
				}

				schema = compileSchema(schema);
				outputElement = schema.resolveElementDeclaration(outputElement
						.getName());
				bodyElement = getChildElement(outputElement, SetSignature.VALUE_ELEMENT_NAME,
						false);

				createImport(config, schema, element.getSchema());

				refElement = getChildElement(bodyElement, SetSignature.REF_ELEMENT_NAME,
						false);
				if (refElement != null) {
					refElement.setName(null);
					refElement.setResolvedElementDeclaration(element);
				}
			}

		} else if (model.getType() == ValueTypes.OBJECT) {
			XSDTypeDefinition javaObjectType = JavaObjectSchema
					.getJavaObjectType();
			XSDSchema refTypeSchema = javaObjectType.getSchema();

			List<XSDSchema> referencedSchemas = new ArrayList<XSDSchema>();
			referencedSchemas.add(refTypeSchema);

			XSDImport xsdImport = XSDFactory.eINSTANCE.createXSDImport();
			xsdImport.setNamespace(refTypeSchema.getTargetNamespace());
			xsdImport.setResolvedSchema(refTypeSchema);
			schema.getContents().add(0, xsdImport);

			schema = ModelHelper.INSTANCE.compileSchema(config, schema,
					referencedSchemas);
			outputElement = schema.resolveElementDeclaration(outputElement
					.getName());
			bodyElement = getChildElement(outputElement, SetSignature.VALUE_ELEMENT_NAME,
					false);

			bodyElement.setTypeDefinition(javaObjectType);
		}

        return outputElement;
    }

    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Method to return the list of fault element declarations that this activity may throw.
	 * @param config
	 *            current configuration of the activity, in case the faults depend on how the activity is current configured
	 * @return list of elements or an empty list if none
	 */
    @Override
    public List<XSDElementDeclaration> getFaultTypes(final Configuration config) {
    	List<XSDElementDeclaration> faultType = null;
        faultType =  ElasticacheExceptionsSchema.getElasticachePluginFaultTypes();
        // begin-custom-code
        // end-custom-code
		return faultType;
    }
}
