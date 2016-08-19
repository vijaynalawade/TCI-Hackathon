/*
 *
 * Copyright© 2011 - 2013 TIBCO Software Inc.
 * All rights reserved.
 *
 * This software is confidential and proprietary information of TIBCO Software Inc.
 *
 */

package com.tibco.bw.palette.elasticache.palette.elasticache.design;

import java.io.InputStream;
import java.util.Map;
import java.util.UUID;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.xsd.XSDComplexTypeDefinition;
import org.eclipse.xsd.XSDCompositor;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDFactory;
import org.eclipse.xsd.XSDModelGroup;
import org.eclipse.xsd.XSDParticle;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDTypeDefinition;
import org.eclipse.xsd.util.XSDConstants;

import com.tibco.bw.design.api.BWExtensionActivitySchema;
import com.tibco.bw.design.internal.base.BWDesign;

public class ElastiCacheInputOutputSchemaHelper extends BWExtensionActivitySchema {

	public static ElastiCacheInputOutputSchemaHelper INSTANCE = new ElastiCacheInputOutputSchemaHelper();

	public static String ATTRIBUTE_NAME = "source";
	XSDFactory xsdFactory = XSDFactory.eINSTANCE;
	


	public XSDSchema createBodyTypeDefEditorSchema(String ATTRIBUTE_VALUE) {
		String prefix = "tns";
		String namespace = "http://www.tibco.com/namespaces/tnt/plugins/elasticache"+ UUID.randomUUID().toString();;

		XSDSchema schema = xsdFactory.createXSDSchema();
		schema.setTargetNamespace(namespace);

		Map<String, String> qNamePrefixToNsMap = schema.getQNamePrefixToNamespaceMap();
		qNamePrefixToNsMap.put(schema.getSchemaForSchemaQNamePrefix(), XSDConstants.SCHEMA_FOR_SCHEMA_URI_2001);
		qNamePrefixToNsMap.put(prefix, namespace);

		// root complex type
		XSDComplexTypeDefinition rootComplexType = xsdFactory.createXSDComplexTypeDefinition();
		rootComplexType.setTargetNamespace(namespace);
		rootComplexType.setName("Data"); //$NON-NLS-1$

		// root complex type particle
		XSDParticle complexTypeParticle = xsdFactory.createXSDParticle();

		// particle's model group
		XSDModelGroup modelGroup = xsdFactory.createXSDModelGroup();
		modelGroup.setCompositor(XSDCompositor.SEQUENCE_LITERAL);

		complexTypeParticle.setContent(modelGroup);

		rootComplexType.setContent(complexTypeParticle);
		rootComplexType.setContentType(complexTypeParticle);

		schema.getContents().add(rootComplexType);

		XSDSchema compiledSchema = compileSchema(schema);
		addExtensionAttribute(compiledSchema, rootComplexType, ATTRIBUTE_NAME, ATTRIBUTE_VALUE);
		return compiledSchema;
	}

	public XSDSchema createBodyElementDecEditorSchema(String ATTRIBUTE_VALUE) {
		String prefix = "tns";
		String namespace = "http://www.tibco.com/namespaces/tnt/plugins/elasticache"+ UUID.randomUUID().toString();;

		XSDSchema schema = xsdFactory.createXSDSchema();
		schema.setTargetNamespace(namespace);

		Map<String, String> qNamePrefixToNsMap = schema.getQNamePrefixToNamespaceMap();
		qNamePrefixToNsMap.put(schema.getSchemaForSchemaQNamePrefix(), XSDConstants.SCHEMA_FOR_SCHEMA_URI_2001);
		qNamePrefixToNsMap.put(prefix, namespace);

		// root complex type
		XSDComplexTypeDefinition rootComplexType = xsdFactory.createXSDComplexTypeDefinition();
		rootComplexType.setTargetNamespace(namespace);

		// root complex type particle
		XSDParticle complexTypeParticle = xsdFactory.createXSDParticle();

		// particle's model group
		XSDModelGroup modelGroup = xsdFactory.createXSDModelGroup();
		modelGroup.setCompositor(XSDCompositor.SEQUENCE_LITERAL);

		complexTypeParticle.setContent(modelGroup);

		rootComplexType.setContent(complexTypeParticle);
		rootComplexType.setContentType(complexTypeParticle);

		XSDElementDeclaration rootElement = xsdFactory.createXSDElementDeclaration();
		rootElement.setTargetNamespace(namespace);
		rootElement.setAnonymousTypeDefinition(rootComplexType);
		rootElement.setName("Data");
		schema.getContents().add(rootElement);

		XSDSchema compiledSchema = compileSchema(schema);
		addExtensionAttribute(compiledSchema, rootElement, ATTRIBUTE_NAME, ATTRIBUTE_VALUE);
		return compiledSchema;
	}

	public IStatus validateInputHeaderType(XSDTypeDefinition xsdAnonymousElement, boolean matchExtension, String ATTRIBUTE_VALUE) {
		boolean isValid = false;
		XSDComplexTypeDefinition complexType = null;
		if (xsdAnonymousElement instanceof XSDComplexTypeDefinition) {
			complexType = (XSDComplexTypeDefinition) xsdAnonymousElement;
		}
		if (complexType != null) {
			XSDParticle particle = complexType.getComplexType();
			if (particle != null && particle.getTerm() instanceof XSDModelGroup) {
				if (matchExtension) {
					if (hasExtensionAttribute(xsdAnonymousElement, ATTRIBUTE_NAME, ATTRIBUTE_VALUE)) {
						isValid = true;
					} 
				} else {
					isValid = true;
				}
			}
		}
		if (isValid) {
			return Status.OK_STATUS;
		}
		return null;
	}

	public IStatus validateInputElement(XSDElementDeclaration xsdElement, boolean matchExtension,String ATTRIBUTE_VALUE) {
		boolean isValid = false;
		if (xsdElement != null) {
			XSDComplexTypeDefinition complexType = null;
			if (xsdElement.getAnonymousTypeDefinition() instanceof XSDComplexTypeDefinition) {
				complexType = (XSDComplexTypeDefinition) xsdElement.getAnonymousTypeDefinition();
			} else if (xsdElement.getTypeDefinition() instanceof XSDComplexTypeDefinition) {
				complexType = (XSDComplexTypeDefinition) xsdElement.getTypeDefinition();
			}
			if (complexType != null) {
				XSDParticle particle = complexType.getComplexType();
				if (particle != null && particle.getTerm() instanceof XSDModelGroup) {
					if (matchExtension) {
						if (hasExtensionAttribute(xsdElement, ATTRIBUTE_NAME, ATTRIBUTE_VALUE)) {
							isValid = true;
						} 
					} else {
						isValid = true;
					}
				}
			}
		}
		if (isValid) {
			return Status.OK_STATUS;
		}  else {
			return BWDesign.createErrorStatus("Invalid Body Element. Please select a complex Element");
		}
	}

	/**
	 * @see com.tibco.bw.design.api.BWExtensionActivitySchema#getSchemaAsInputStream()
	 */
	protected InputStream getSchemaAsInputStream() {
		// TODO Auto-generated method stub
		return null;
	}

}
