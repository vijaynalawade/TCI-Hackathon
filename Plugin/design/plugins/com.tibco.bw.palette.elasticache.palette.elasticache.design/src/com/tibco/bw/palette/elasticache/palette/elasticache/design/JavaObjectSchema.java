package com.tibco.bw.palette.elasticache.palette.elasticache.design;

import java.io.InputStream;

import org.eclipse.xsd.XSDComplexTypeDefinition;
import org.eclipse.xsd.XSDCompositor;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDFactory;
import org.eclipse.xsd.XSDForm;
import org.eclipse.xsd.XSDModelGroup;
import org.eclipse.xsd.XSDParticle;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDSimpleTypeDefinition;
import org.eclipse.xsd.XSDTypeDefinition;
import org.eclipse.xsd.util.XSDConstants;
import org.eclipse.xsd.util.XSDSchemaBuildingTools;

import com.tibco.bw.design.api.BWExtensionActivitySchema;

public class JavaObjectSchema extends BWExtensionActivitySchema {
	public static final JavaObjectSchema INSTANCE = new JavaObjectSchema();
	private static final String SCHEMA_FILE_PATH = "/schema/JavaObjectSchema.xsd"; //$NON-NLS-1$

	private static final String JAVA_OBJECT_REFERENCE_TYPE = "nativeJavaObjectKey"; //$NON-NLS-1$

	public static final String UTILITY_SCHEMA_NS = "http://www.tibco.com/tnt/utilitySchema";
	private static XSDSimpleTypeDefinition javaObjectType = null;
	

	@Override
	protected InputStream getSchemaAsInputStream() {
		return this.getClass().getResourceAsStream(JavaObjectSchema.SCHEMA_FILE_PATH);
	}

	/**
	 * @param string
	 * @return JavaObject schema type.
	 */
	public static XSDSimpleTypeDefinition getJavaObjectType() {
		JavaObjectSchema.javaObjectType = JavaObjectSchema.INSTANCE.loadSchema().resolveSimpleTypeDefinition(JavaObjectSchema.JAVA_OBJECT_REFERENCE_TYPE);

		return JavaObjectSchema.javaObjectType;
	}
	

	public static XSDComplexTypeDefinition createJavaObjectType() {
		
		XSDFactory xsdFactory = XSDSchemaBuildingTools.getXSDFactory();
		XSDSchema xsdSchema = xsdFactory.createXSDSchema();
		xsdSchema.setTargetNamespace(UTILITY_SCHEMA_NS);

		XSDComplexTypeDefinition javaObjectType = xsdFactory.createXSDComplexTypeDefinition();
		javaObjectType.setName("nativeJavaObjectKey");
		
		XSDTypeDefinition xsdType = xsdSchema.resolveTypeDefinition(XSDConstants.SCHEMA_FOR_SCHEMA_URI_2001, "string");
		javaObjectType.setBaseTypeDefinition(xsdType);
		
		XSDModelGroup paramModelGroup = xsdFactory.createXSDModelGroup();
		paramModelGroup.setCompositor(XSDCompositor.SEQUENCE_LITERAL);
		XSDParticle particle = xsdFactory.createXSDParticle();
		particle.setContent(paramModelGroup);
		javaObjectType.setContent(particle);
		
		xsdSchema.getContents().add(javaObjectType);
		return javaObjectType;
	}
	
	public static XSDComplexTypeDefinition createJavaObjectType(XSDFactory xsdFactory, XSDSchema xsdSchema) {
		
		XSDComplexTypeDefinition javaObjectType = xsdFactory.createXSDComplexTypeDefinition();
		javaObjectType.setName("nativeJavaObjectKey");
		
		XSDTypeDefinition xsdType = xsdSchema.resolveTypeDefinition(XSDConstants.SCHEMA_FOR_SCHEMA_URI_2001, "string");
		javaObjectType.setBaseTypeDefinition(xsdType);
		javaObjectType.setTargetNamespace(UTILITY_SCHEMA_NS);
		
		
		XSDModelGroup paramModelGroup = xsdFactory.createXSDModelGroup();
		paramModelGroup.setCompositor(XSDCompositor.SEQUENCE_LITERAL);
		XSDParticle particle = xsdFactory.createXSDParticle();
		particle.setContent(paramModelGroup);
		javaObjectType.setContent(particle);
		
		xsdSchema.getContents().add(javaObjectType);
		return javaObjectType;
	}
	
	public static XSDParticle generateElementForJavaObject(XSDFactory xsdFactory, XSDSchema xsdSchema, String elementName,XSDTypeDefinition xsdType, int minOccurs, int maxOccurs) {
		XSDElementDeclaration localElement = xsdFactory.createXSDElementDeclaration();
		localElement.setName(elementName); // $NON-NLS-1$
		localElement.setTypeDefinition(xsdType);
		localElement.setForm(XSDForm.UNQUALIFIED_LITERAL);
/*		xsdType.setTargetNamespace(JAVAPaletteConstants.UTILITY_SCHEMA_NS);

		localElement.setTargetNamespace(JAVAPaletteConstants.UTILITY_SCHEMA_NS);*/

		XSDParticle localElementParticle = xsdFactory.createXSDParticle();
		localElementParticle.setContent(localElement);
		localElementParticle.setMinOccurs(minOccurs);
		localElementParticle.setMaxOccurs(maxOccurs);

		return localElementParticle;

	}

}
