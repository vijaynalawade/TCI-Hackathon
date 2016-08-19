/*
 *
 * Copyright© 2011 - 2013 TIBCO Software Inc.
 * All rights reserved.
 *
 * This software is confidential and proprietary information of TIBCO Software Inc.
 *
 */

package com.tibco.bw.palette.elasticache.palette.elasticache.design.schemaeditor;

import com.tibco.bw.palette.elasticache.model.elasticache.Get;
import com.tibco.bw.palette.elasticache.model.elasticache.Set;
import com.tibco.zion.common.component.xsdtree.impl.SchemaLabelProvider;

public class ValueElementSchemaTreeLabelProvider extends SchemaLabelProvider {

	@Override
	public String getText(Object object) {
		if(object instanceof Set || object instanceof Get) {
			return "Data";
		}
		return super.getText(object);
	}


}
