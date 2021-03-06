package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcGeometricCurveSet;

public class GetAttributeSubIfcGeometricCurveSet {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcGeometricCurveSet(Object object, String string) {
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
		if (string.equals("Dim")) {
			resultList.add(((IfcGeometricCurveSet) object).getDim());
			 //2int
		}
		else if (string.equals("Elements")) {
			//3xxx
			for (int i = 0; i < ((IfcGeometricCurveSet) object).getElements().size(); i++) {
				resultList.add(((IfcGeometricCurveSet) object).getElements().get(i));
			}
			 //2EList
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcGeometricCurveSet) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcGeometricCurveSet) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcGeometricCurveSet) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcGeometricCurveSet) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
