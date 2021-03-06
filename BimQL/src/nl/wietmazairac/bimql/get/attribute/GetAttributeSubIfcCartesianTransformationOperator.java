package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcCartesianTransformationOperator;

public class GetAttributeSubIfcCartesianTransformationOperator {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCartesianTransformationOperator(Object object, String string) {
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
			resultList.add(((IfcCartesianTransformationOperator) object).getDim());
			 //1int
		}
		else if (string.equals("Axis1")) {
			resultList.add(((IfcCartesianTransformationOperator) object).getAxis1());
			 //1IfcDirection
		}
		else if (string.equals("Axis2")) {
			resultList.add(((IfcCartesianTransformationOperator) object).getAxis2());
			 //1IfcDirection
		}
		else if (string.equals("Scale")) {
			resultList.add(((IfcCartesianTransformationOperator) object).getScale());
			 //1double
		}
		else if (string.equals("LocalOrigin")) {
			resultList.add(((IfcCartesianTransformationOperator) object).getLocalOrigin());
			 //1IfcCartesianPoint
		}
		else if (string.equals("ScaleAsString")) {
			resultList.add(((IfcCartesianTransformationOperator) object).getScaleAsString());
			 //1String
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcCartesianTransformationOperator) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcCartesianTransformationOperator) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcCartesianTransformationOperator) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcCartesianTransformationOperator) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
