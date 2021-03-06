package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRepresentationItem;

public class GetAttributeSubIfcRepresentationItem {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRepresentationItem(Object object, String string) {
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
		if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcRepresentationItem) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcRepresentationItem) object).getStyledByItem().get(i));
			}
			 //1EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcRepresentationItem) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcRepresentationItem) object).getLayerAssignments().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
