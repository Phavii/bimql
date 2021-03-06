package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcApplication;

public class GetAttributeSubIfcApplication {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcApplication(Object object, String string) {
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
		if (string.equals("ApplicationDeveloper")) {
			resultList.add(((IfcApplication) object).getApplicationDeveloper());
			 //1IfcOrganization
		}
		else if (string.equals("ApplicationFullName")) {
			resultList.add(((IfcApplication) object).getApplicationFullName());
			 //1String
		}
		else if (string.equals("ApplicationIdentifier")) {
			resultList.add(((IfcApplication) object).getApplicationIdentifier());
			 //1String
		}
		else if (string.equals("Version")) {
			resultList.add(((IfcApplication) object).getVersion());
			 //1String
		}
		return resultList;
	}
}
