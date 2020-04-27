package cs1;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.util.Iterator;
import javax.xml.parsers.ParserConfigurationException;
import cs1.Employee;


public class userhandler extends DefaultHandler{

	private List<Employee> empList = null;
	private Employee emp = null;
	private StringBuilder data = null;

	// getter method for employee list
	public List<Employee> getEmpList() {
		return empList;
	}

	boolean bName = false;
	boolean bGender = false;
	boolean bSalary = false;
	boolean bAddress = false;
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		if (qName.equalsIgnoreCase("Employee")) {
			String id = attributes.getValue("id");
			emp = new Employee();
			emp.setId(Integer.parseInt(id));
			// initialize list
			if (empList == null)
				empList = new ArrayList<>();
		} else if (qName.equalsIgnoreCase("name")) {
			// set boolean values for fields, will be used in setting Employee variables
			bName = true;
		}  else if (qName.equalsIgnoreCase("gender")) {
			bGender = true;
		} else if (qName.equalsIgnoreCase("salary")) {
			bSalary = true;
		}
		else if (qName.equalsIgnoreCase("address")) {
			bAddress = true;
		}
		
		// create the data container
		data = new StringBuilder();
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (bName) {
			emp.setName(data.toString());
			bName = false;
		} else if (bGender) {
			emp.setGender(data.toString());
			bGender = false;
		} else if (bSalary) {
			emp.setSalary(data.toString());
			bSalary = false;
		}else if (bAddress) {
			emp.setAddress(data.toString());
			bAddress = false;
		}
		
		
		if (qName.equalsIgnoreCase("Employee")) {
			// add Employee object to list
			empList.add(emp);
		}
	}

	@Override
	public void characters(char ch[], int start, int length) throws SAXException {
		data.append(new String(ch, start, length));
	}
}