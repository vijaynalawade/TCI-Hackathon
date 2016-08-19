/*
 *
 * Copyright© 2011 - 2013 TIBCO Software Inc.
 * All rights reserved.
 *
 * This software is confidential and proprietary information of TIBCO Software Inc.
 *
 */

package com.tibco.bw.palette.elasticache.palette.elasticache.design.get;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDNamedComponent;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDTypeDefinition;

import com.tibco.bw.design.field.SimpleSchemaTreeField;
import com.tibco.bw.design.field.utils.QNameDataType;
import com.tibco.bw.design.internal.base.BWDesign;
import com.tibco.bw.design.propertysection.AbstractInlineSchemaSection;
import com.tibco.bw.palette.elasticache.model.elasticache.ElasticachePackage;
import com.tibco.bw.palette.elasticache.model.elasticache.Get;
import com.tibco.bw.palette.elasticache.model.elasticache.ValueTypes;
import com.tibco.bw.palette.elasticache.palette.elasticache.design.ElastiCacheInputOutputSchemaHelper;
import com.tibco.bw.palette.elasticache.palette.elasticache.design.schemaeditor.ValueElementTree;
import com.tibco.bw.palette.elasticache.palette.elasticache.design.schemaeditor.ValueTypeSchemaTree;

public class GetOutputEditorSection extends AbstractInlineSchemaSection {

	public GetOutputEditorSection() {
		setQNameDataTypeDynamic(true);
	}

	@Override
	protected Class<?> getModelClass() {
		return Get.class;
	}

	@Override
	protected void initBindings() {
		super.initBindings();
		Get model = (Get) getInput();
		if (!(model.getType() == ValueTypes.XML)) {
			schemaTree.setVisible(false);
		} else {
			schemaTree.setVisible(true);
		}
		if (schemaTree.isVisible()) {
			createSchemaEditor();
		}
	}

	@Override
	protected EStructuralFeature getBindingFeature() {
		return ElasticachePackage.Literals.GET__VALUE_TYPE_QNAME;
	}

	@Override
	protected QNameDataType getQNameDataType() {
		Get model = (Get) getInput();
		if (model != null) {
			if (model.getType() == ValueTypes.XML) {
				return QNameDataType.XSD_ELEMENT;
			}
		}
		return QNameDataType.XSD_TYPE;
	}

	@Override
	protected SimpleSchemaTreeField createSchemaTree(Composite parent) {
		Get model = (Get) getInput();
		ValueTypes type = null;
		if (model != null) {
			type = model.getType();
		}
		if (type == null) {
			return createNewBodyTypeSchemaTree();
		} else {
			if (type == ValueTypes.XML) {
				return createNewBodyElementSchemaTree();
			} else {
				return createNewBodyTypeSchemaTree();
			}
		}

	}

	private ValueTypeSchemaTree createNewBodyTypeSchemaTree() {
		return new ValueTypeSchemaTree(parent) {

			@Override
			public IStatus validateSchemaNamedComponent(
					XSDNamedComponent namedComponent, boolean matchExtension) {
				if (namedComponent instanceof XSDTypeDefinition) {
					return ElastiCacheInputOutputSchemaHelper.INSTANCE
							.validateInputHeaderType(
									(XSDTypeDefinition) namedComponent,
									matchExtension, "bw.elasticache.get");
				} else {
					return BWDesign
							.createErrorStatus("Invalid Value type. Please select complex type");
				}
			}

			@Override
			public int getSchemaTreeStandardActions() {
				return ADD_ANONYMOUS_ELEMENT | ADD_SIMPLE_ELEMENT | XSD_MOVE_UP
						| XSD_MOVE_DOWN | XSD_MOVE_IN | XSD_MOVE_OUT
						| XSD_REMOVE;
			}

			@Override
			public XSDSchema createSchema() {
				return ElastiCacheInputOutputSchemaHelper.INSTANCE
						.createBodyTypeDefEditorSchema("bw.elasticache.get");
			}

			@Override
			public EObject getContainerInput() {
				return GetOutputEditorSection.this.getInput();
			}

		};
	}

	private ValueElementTree createNewBodyElementSchemaTree() {
		return new ValueElementTree(parent) {

			@Override
			public IStatus validateSchemaNamedComponent(
					XSDNamedComponent namedComponent, boolean matchExtension) {
				if (namedComponent instanceof XSDElementDeclaration) {
					return ElastiCacheInputOutputSchemaHelper.INSTANCE
							.validateInputElement(
									(XSDElementDeclaration) namedComponent,
									matchExtension, "bw.elasticache.get");
				} else {
					return BWDesign
							.createErrorStatus("Invalid Value Element. Please select an Element");
				}
			}

			@Override
			public int getSchemaTreeStandardActions() {
				return ADD_COMPLEX_ELEMENT | ADD_REFERENCE_ELEMENT
						| ADD_SIMPLE_ELEMENT | XSD_MOVE_UP | XSD_MOVE_DOWN
						| XSD_MOVE_IN | XSD_MOVE_OUT | XSD_REMOVE;
			}

			@Override
			public XSDSchema createSchema() {
				return ElastiCacheInputOutputSchemaHelper.INSTANCE
						.createBodyElementDecEditorSchema("bw.elasticache.get");
			}

			@Override
			public EObject getContainerInput() {
				return GetOutputEditorSection.this.getInput();
			}
		};
	}

}
