package cs2;
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
import cs2.Student;

public class userhandler extends DefaultHandler{
	private List<Student> stList = null;
	private Student st = null;
	private StringBuilder data = null;

	// getter method for employee list
	public List<Student> getStList() {
		return stList;
	}

	boolean bName = false;
	boolean bStd = false;
	boolean bGender = false;
	boolean bMarks = false;
	boolean bAddress = false;
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		if (qName.equalsIgnoreCase("Student")) {
			String id = attributes.getValue("id");
			st = new Student();
			st.setId(Integer.parseInt(id));
			// initialize list
			if (stList == null)
				stList = new ArrayList<>();
		} else if (qName.equalsIgnoreCase("name")) {
			// set boolean values for fields, will be used in setting Student variables
			bName = true;
		}
		else if (qName.equalsIgnoreCase("std")) {
			bStd = true;
		}
		else if (qName.equalsIgnoreCase("gender")) {
			bGender = true;
		} else if (qName.equalsIgnoreCase("marks")) {
			bMarks = true;
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
			st.setName(data.toString());
			bName = false;
		}
		else if (bStd) {
			st.setStd(data.toString());
			bStd = false;
		}
		else if (bGender) {
			st.setGender(data.toString());
			bGender = false;
		} else if (bMarks) {
			st.setMarks(data.toString());
			bMarks = false;
		}else if (bAddress) {
			st.setAddress(data.toString());
			bAddress = false;
		}
		
		
		if (qName.equalsIgnoreCase("Student")) {
			// add Student object to list
			stList.add(st);
		}
	}

	@Override
	public void characters(char ch[], int start, int length) throws SAXException {
		data.append(new String(ch, start, length));
	}
	
	
}
