package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcThermalExpansionCoefficientMeasure;

public class SetAttributeSubIfcThermalExpansionCoefficientMeasure {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcThermalExpansionCoefficientMeasure() {
	}

	public SetAttributeSubIfcThermalExpansionCoefficientMeasure(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("WrappedValueAsString")) {
			//1NoEList
			((IfcThermalExpansionCoefficientMeasure) object).setWrappedValueAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("WrappedValue")) {
			//1NoEList
			((IfcThermalExpansionCoefficientMeasure) object).setWrappedValue(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
	}
}
