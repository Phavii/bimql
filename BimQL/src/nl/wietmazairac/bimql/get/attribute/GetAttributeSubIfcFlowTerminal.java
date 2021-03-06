package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcFlowTerminal;

public class GetAttributeSubIfcFlowTerminal {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFlowTerminal(Object object, String string) {
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
		if (string.equals("HasControlElements")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminal) object).getHasControlElements().size(); i++) {
				resultList.add(((IfcFlowTerminal) object).getHasControlElements().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminal) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcFlowTerminal) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminal) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcFlowTerminal) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminal) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcFlowTerminal) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminal) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcFlowTerminal) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminal) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcFlowTerminal) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminal) object).getHasPorts().size(); i++) {
				resultList.add(((IfcFlowTerminal) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminal) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcFlowTerminal) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminal) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcFlowTerminal) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminal) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcFlowTerminal) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminal) object).getHasProjections().size(); i++) {
				resultList.add(((IfcFlowTerminal) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminal) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcFlowTerminal) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminal) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcFlowTerminal) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcFlowTerminal) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcFlowTerminal) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcFlowTerminal) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminal) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcFlowTerminal) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcFlowTerminal) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminal) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcFlowTerminal) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminal) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcFlowTerminal) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminal) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcFlowTerminal) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminal) object).getDecomposes().size(); i++) {
				resultList.add(((IfcFlowTerminal) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminal) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcFlowTerminal) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcFlowTerminal) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcFlowTerminal) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcFlowTerminal) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcFlowTerminal) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcFlowTerminal) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
