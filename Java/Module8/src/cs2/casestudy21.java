package cs2;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;


public class casestudy21 {

	public static final String xmlFilePath = "/home/dhruv/AMDOCS/Java/Module8/src/xml_casestudy2.xml";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
 
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
 
            Document document = documentBuilder.newDocument();
 
            // root element
            Element root = document.createElement("school");
            document.appendChild(root);
 
            // student element
            Element student = document.createElement("student");
            root.appendChild(student);
            Attr attr = document.createAttribute("id");
            attr.setValue("10");
            student.setAttributeNode(attr);
            Element name = document.createElement("name");
            name.appendChild(document.createTextNode("James"));
            student.appendChild(name);
            Element std = document.createElement("std");
            std.appendChild(document.createTextNode("5"));
            student.appendChild(std);
            Element gender = document.createElement("gender");
            gender.appendChild(document.createTextNode("M"));
            student.appendChild(gender);
            Element marks = document.createElement("marks");
            marks.appendChild(document.createTextNode("98"));
            student.appendChild(marks);
            Element address = document.createElement("address");
            address.appendChild(document.createTextNode("221B Baker Street"));
            student.appendChild(address);
            
            Element student1 = document.createElement("student");
            root.appendChild(student1);
            Attr attr1 = document.createAttribute("id");
            attr1.setValue("20");
            student1.setAttributeNode(attr1);
            Element name1 = document.createElement("name");
            name1.appendChild(document.createTextNode("Lisa"));
            student1.appendChild(name1);
            Element std1 = document.createElement("std");
            std1.appendChild(document.createTextNode("6"));
            student1.appendChild(std1);
            Element gender1 = document.createElement("gender");
            gender1.appendChild(document.createTextNode("F"));
            student1.appendChild(gender1);
            Element marks1 = document.createElement("marks");
            marks1.appendChild(document.createTextNode("95"));
            student1.appendChild(marks1);
            Element address1 = document.createElement("address");
            address1.appendChild(document.createTextNode("222B Baker Street"));
            student1.appendChild(address1);
            // create the xml file
            //transform the DOM Object to an XML File
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));
 
            // If you use
            // StreamResult result = new StreamResult(System.out);
            // the output will be pushed to the standard output ...
            // You can use that for debugging 
 
            transformer.transform(domSource, streamResult);
 
            System.out.println("Done creating XML File");
 
        } 
		catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        }
		catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
		
	}

}