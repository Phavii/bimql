package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcMaterialLayerSetUsage;

public class SetAttributeSubIfcMaterialLayerSetUsage {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcMaterialLayerSetUsage() {
	}

	public SetAttributeSubIfcMaterialLayerSetUsage(Object object, String attributeName, String attributeNewValue) {
		this.object = object;
		this.attributeName = attributeName;
		this.attributeNewValue = attributeNewValue;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeNewValue() {
		return attributeNewValue;
	}

	public void setAttributeNewValue(String attributeNewValue) {
		this.attributeNewValue = attributeNewValue;
	}

	public void setAttribute() {
		if (attributeName.equals("ForLayerSet")) {
			//1NoEList
			 //1void
			 //1IfcMaterialLayerSet
		}
		else if (attributeName.equals("LayerSetDirection")) {
			//1NoEList
			 //1void
			 //1IfcLayerSetDirectionEnum
		}
		else if (attributeName.equals("DirectionSense")) {
			//1NoEList
			 //1void
			 //1IfcDirectionSenseEnum
		}
		else if (attributeName.equals("OffsetFromReferenceLine")) {
			//1NoEList
			((IfcMaterialLayerSetUsage) object).setOffsetFromReferenceLine(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("OffsetFromReferenceLineAsString")) {
			//1NoEList
			((IfcMaterialLayerSetUsage) object).setOffsetFromReferenceLineAsString(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
