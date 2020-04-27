package cs1;

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


public class casestudy11 {

	public static final String xmlFilePath = "/home/dhruv/AMDOCS/Java/Module8/src/xml_casestudy1.xml";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
 
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
 
            Document document = documentBuilder.newDocument();
 
            // root element
            Element root = document.createElement("company");
            document.appendChild(root);
 
            // employee element
            Element employee = document.createElement("employee");
            root.appendChild(employee);
            Attr attr = document.createAttribute("id");
            attr.setValue("10");
            employee.setAttributeNode(attr);
            Element name = document.createElement("name");
            name.appendChild(document.createTextNode("James"));
            employee.appendChild(name);
            Element gender = document.createElement("gender");
            gender.appendChild(document.createTextNode("M"));
            employee.appendChild(gender);
            Element salary = document.createElement("salary");
            salary.appendChild(document.createTextNode("100,000"));
            employee.appendChild(salary);
            Element address = document.createElement("address");
            address.appendChild(document.createTextNode("221B Baker Street"));
            employee.appendChild(address);
            
            Element employee1 = document.createElement("employee");
            root.appendChild(employee1);
            Attr attr1 = document.createAttribute("id");
            attr1.setValue("20");
            employee1.setAttributeNode(attr1);
            Element name1 = document.createElement("name");
            name1.appendChild(document.createTextNode("Lisa"));
            employee1.appendChild(name1);
            Element gender1 = document.createElement("gender");
            gender1.appendChild(document.createTextNode("F"));
            employee1.appendChild(gender1);
            Element salary1 = document.createElement("salary");
            salary1.appendChild(document.createTextNode("200,000"));
            employee1.appendChild(salary1);
            Element address1 = document.createElement("address");
            address1.appendChild(document.createTextNode("222B Baker Street"));
            employee1.appendChild(address1);
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
