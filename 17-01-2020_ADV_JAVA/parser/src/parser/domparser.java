package parser;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;

public class domparser {

	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(new File("student.xml"));
		
		Element root = document.getDocumentElement();
		System.out.println(root.getNodeName());
		 
		//Get all employees
		NodeList nList = document.getElementsByTagName("student");
		System.out.println("============================");
		 
		for (int temp = 0; temp < nList.getLength(); temp++)
		{
		 Node node = nList.item(temp);
		 System.out.println("");    //Just a separator
		 if (node.getNodeType() == Node.ELEMENT_NODE)
		 {
		    //Print each employee's detail
		    Element eElement = (Element) node;
		    System.out.println("Employee id : "    + eElement.getAttribute("id"));
		    System.out.println("First Name : "  + eElement.getElementsByTagName("fname").item(0).getTextContent());
		    System.out.println("Last Name : "   + eElement.getElementsByTagName("lname").item(0).getTextContent());
		    System.out.println("age : "    + eElement.getElementsByTagName("age").item(0).getTextContent());
		    System.out.println("department : "    + eElement.getElementsByTagName("department").item(0).getTextContent());
		    System.out.println("college : "    + eElement.getElementsByTagName("college").item(0).getTextContent());
		    System.out.println("");
		 }
		}
		

	}

}
