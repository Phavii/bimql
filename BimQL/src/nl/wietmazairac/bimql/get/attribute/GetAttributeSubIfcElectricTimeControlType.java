package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcElectricTimeControlType;

public class GetAttributeSubIfcElectricTimeControlType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcElectricTimeControlType(Object object, String string) {
		this.object = object;
		this.string = string;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public ArrayList<Object> getResult() {
	ArrayList<Object> resultList = new ArrayList<Object>();
		if (string.equals("PredefinedType")) {
			resultList.add(((IfcElectricTimeControlType) object).getPredefinedType());
			 //1IfcElectricTimeControlTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcElectricTimeControlType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricTimeControlType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcElectricTimeControlType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcElectricTimeControlType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcElectricTimeControlType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricTimeControlType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcElectricTimeControlType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricTimeControlType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcElectricTimeControlType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricTimeControlType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcElectricTimeControlType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricTimeControlType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcElectricTimeControlType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricTimeControlType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcElectricTimeControlType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricTimeControlType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcElectricTimeControlType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcElectricTimeControlType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcElectricTimeControlType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcElectricTimeControlType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcElectricTimeControlType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcElectricTimeControlType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
