package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcParameterizedProfileDef;

public class GetAttributeSubIfcParameterizedProfileDef {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcParameterizedProfileDef(Object object, String string) {
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
		if (string.equals("Position")) {
			resultList.add(((IfcParameterizedProfileDef) object).getPosition());
			 //1IfcAxis2Placement2D
		}
		return resultList;
	}
}
