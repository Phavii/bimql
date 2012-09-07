package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcFeatureElementAddition {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFeatureElementAddition(Object object, String string) {
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
		if (string.equals("ProjectsElements")) {
			resultList.add(((IfcFeatureElementAddition) object).getProjectsElements());
			 //1IfcRelProjectsElement
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementAddition) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcFeatureElementAddition) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementAddition) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcFeatureElementAddition) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementAddition) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcFeatureElementAddition) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementAddition) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcFeatureElementAddition) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementAddition) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcFeatureElementAddition) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementAddition) object).getHasPorts().size(); i++) {
				resultList.add(((IfcFeatureElementAddition) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementAddition) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcFeatureElementAddition) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementAddition) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcFeatureElementAddition) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementAddition) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcFeatureElementAddition) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementAddition) object).getHasProjections().size(); i++) {
				resultList.add(((IfcFeatureElementAddition) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementAddition) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcFeatureElementAddition) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementAddition) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcFeatureElementAddition) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcFeatureElementAddition) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcFeatureElementAddition) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcFeatureElementAddition) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementAddition) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcFeatureElementAddition) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcFeatureElementAddition) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementAddition) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcFeatureElementAddition) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementAddition) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcFeatureElementAddition) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementAddition) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcFeatureElementAddition) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementAddition) object).getDecomposes().size(); i++) {
				resultList.add(((IfcFeatureElementAddition) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementAddition) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcFeatureElementAddition) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcFeatureElementAddition) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcFeatureElementAddition) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcFeatureElementAddition) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcFeatureElementAddition) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcFeatureElementAddition) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}