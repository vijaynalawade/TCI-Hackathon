package com.tibco.bw.palette.elasticache.palette.elasticache.design.schemaeditor;

import org.eclipse.jface.action.ContributionManager;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xsd.XSDNamedComponent;
import org.eclipse.xsd.XSDSchema;

import com.tibco.bw.design.field.BWFieldFactory;
import com.tibco.bw.design.field.SimpleSchemaTreeField;
import com.tibco.bw.design.field.actions.SimpleSchemaRemoveElementAction;
import com.tibco.bw.design.field.actions.SimpleSchemaSelectElementAction;
import com.tibco.bw.design.field.dialogs.SchemaCreationStrategy;
import com.tibco.bw.palette.elasticache.palette.elasticache.design.ElastiCacheInputOutputSchemaHelper;
import com.tibco.zion.common.component.xsdtree.action.AddAnonymousElementAction;
import com.tibco.zion.common.component.xsdtree.action.AddComplexElementAction;
import com.tibco.zion.common.component.xsdtree.action.AddReferenceElementAction;
import com.tibco.zion.common.component.xsdtree.action.AddSimpleElementAction;
import com.tibco.zion.common.component.xsdtree.action.XSDMoveAction;

public abstract class ValueElementTree extends SimpleSchemaTreeField implements SchemaCreationStrategy{

	public ValueElementTree(Composite parent) {
		super(parent);
	}

	protected ValueElementSchemaTreeLabelProvider labelProvider;

	@Override
	public String getDefaultResourceName() {
		return "ElasticacheValueElementSchema";
	}

	@Override
	public XSDNamedComponent getSchemaEditorInput(Object data) {
		if (data instanceof XSDSchema) {
			return ElastiCacheInputOutputSchemaHelper.INSTANCE.getDefaultComplexType((XSDSchema) data);
		}
		return null;
	}

	@Override
	protected void createStandardActions(ContributionManager manager, TreeViewer viewer) {
		SimpleSchemaSelectElementAction selectElementAction = BWFieldFactory.getInstance().createSchemaSelectElementAction(viewer, "Select Value Element ", this);
		selectElementAction.setSchemaCreationStrategy(this);
		manager.add(selectElementAction);
		manager.add(new AddComplexElementAction(viewer));
		manager.add(new AddReferenceElementAction(viewer));
		manager.add(new AddAnonymousElementAction(viewer));
		manager.add(new AddSimpleElementAction(viewer));
		manager.add(new XSDMoveAction(viewer, SWT.UP));
		manager.add(new XSDMoveAction(viewer, SWT.DOWN));
		manager.add(new SimpleSchemaRemoveElementAction(viewer, "Remove Value Element Type Definition", this));

	}

	@Override
	protected LabelProvider getLabelProvider(Object inputData) {
		if (labelProvider == null) {
			labelProvider = new ValueElementSchemaTreeLabelProvider();
		}
		return labelProvider;
	}

}
