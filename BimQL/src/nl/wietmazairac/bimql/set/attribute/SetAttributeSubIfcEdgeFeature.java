package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcEdgeFeature;

public class SetAttributeSubIfcEdgeFeature {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcEdgeFeature() {
	}

	public SetAttributeSubIfcEdgeFeature(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("FeatureLength")) {
			//1NoEList
			((IfcEdgeFeature) object).setFeatureLength(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("FeatureLengthAsString")) {
			//1NoEList
			((IfcEdgeFeature) object).setFeatureLengthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("VoidsElements")) {
			//2NoEList
			 //2void
			 //2IfcRelVoidsElement
		}
		else if (attributeName.equals("Tag")) {
			//5NoEList
			((IfcEdgeFeature) object).setTag(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("ObjectPlacement")) {
			//5NoEList
			 //5void
			 //5IfcObjectPlacement
		}
		else if (attributeName.equals("Representation")) {
			//5NoEList
			 //5void
			 //5IfcProductRepresentation
		}
		else if (attributeName.equals("ObjectType")) {
			//5NoEList
			((IfcEdgeFeature) object).setObjectType(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("GlobalId")) {
			//5NoEList
			 //5void
			 //5IfcGloballyUniqueId
		}
		else if (attributeName.equals("OwnerHistory")) {
			//5NoEList
			 //5void
			 //5IfcOwnerHistory
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcEdgeFeature) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcEdgeFeature) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
