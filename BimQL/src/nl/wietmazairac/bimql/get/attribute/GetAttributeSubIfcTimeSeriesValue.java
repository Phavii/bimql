package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcTimeSeriesValue;

public class GetAttributeSubIfcTimeSeriesValue {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTimeSeriesValue(Object object, String string) {
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
		if (string.equals("ListValues")) {
			//3xxx
			for (int i = 0; i < ((IfcTimeSeriesValue) object).getListValues().size(); i++) {
				resultList.add(((IfcTimeSeriesValue) object).getListValues().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
