package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcStructuralAnalysisModel;

public class SetAttributeSubIfcStructuralAnalysisModel {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcStructuralAnalysisModel() {
	}

	public SetAttributeSubIfcStructuralAnalysisModel(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("OrientationOf2DPlane")) {
			//1NoEList
			 //1void
			 //1IfcAxis2Placement3D
		}
		else if (attributeName.equals("PredefinedType")) {
			//1NoEList
			 //1void
			 //1IfcAnalysisModelTypeEnum
		}
		else if (attributeName.equals("IsGroupedBy")) {
			//5NoEList
			 //5void
			 //5IfcRelAssignsToGroup
		}
		else if (attributeName.equals("ObjectType")) {
			//5NoEList
			((IfcStructuralAnalysisModel) object).setObjectType(attributeNewValue);
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
			((IfcStructuralAnalysisModel) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcStructuralAnalysisModel) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
