package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcProjectionCurve;

public class GetAttributeSubIfcProjectionCurve {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcProjectionCurve(Object object, String string) {
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
		if (string.equals("Styles")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectionCurve) object).getStyles().size(); i++) {
				resultList.add(((IfcProjectionCurve) object).getStyles().get(i));
			}
			 //3EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcProjectionCurve) object).getName());
			 //3String
		}
		else if (string.equals("Item")) {
			resultList.add(((IfcProjectionCurve) object).getItem());
			 //3IfcRepresentationItem
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectionCurve) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcProjectionCurve) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectionCurve) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcProjectionCurve) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
