package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcRelConnectsPorts {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelConnectsPorts(Object object, String string) {
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
		if (string.equals("RelatingPort")) {
			resultList.add(((IfcRelConnectsPorts) object).getRelatingPort());
			 //1IfcPort
		}
		else if (string.equals("RelatedPort")) {
			resultList.add(((IfcRelConnectsPorts) object).getRelatedPort());
			 //1IfcPort
		}
		else if (string.equals("RealizingElement")) {
			resultList.add(((IfcRelConnectsPorts) object).getRealizingElement());
			 //1IfcElement
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelConnectsPorts) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelConnectsPorts) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelConnectsPorts) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelConnectsPorts) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelConnectsPorts) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}