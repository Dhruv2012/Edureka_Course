package cs2;
import cs2.Student;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

public class parser {
	public static final String xmlFilePath = "/home/dhruv/AMDOCS/Java/Module8/src/xml_casestudy2.xml";
	public static void main(String[] args) {
	    SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
	    try {
	        SAXParser saxParser = saxParserFactory.newSAXParser();
	        userhandler handler = new userhandler();
	        saxParser.parse(new File(xmlFilePath), handler);
	        //Get Students list
	        List<Student> empList = handler.getStList();
	        //print employee information
	        for(Student emp : empList)
	            System.out.println(emp);
	    } catch (ParserConfigurationException | SAXException | IOException e) {
	        e.printStackTrace();
	    }
	    }

}
