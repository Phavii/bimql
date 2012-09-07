package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcAxis1Placement {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcAxis1Placement(Object object, String string) {
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
		if (string.equals("Axis")) {
			resultList.add(((IfcAxis1Placement) object).getAxis());
			 //1IfcDirection
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcAxis1Placement) object).getDim());
			 //2int
		}
		else if (string.equals("Location")) {
			resultList.add(((IfcAxis1Placement) object).getLocation());
			 //2IfcCartesianPoint
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcAxis1Placement) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcAxis1Placement) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcAxis1Placement) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcAxis1Placement) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}