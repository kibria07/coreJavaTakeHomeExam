package xml.reader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.Element;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;

import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlReader {

//String path = "/Users/mrahman/Documents/workspace/DataStructureExam/src/xml/reader/data.xml";
String path ="C:\\Users\\my_pc\\workspace\\SeleniumNovember2014DS-Exam\\src\\xml\\reader\\data.xml";
	
public List<Student> parseData(String tagName) throws ParserConfigurationException, SAXException, IOException{
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	DocumentBuilder builder = factory.newDocumentBuilder();
	File file = new File(path);
	Document doc = builder.parse(file);
	NodeList nodeList = doc.getDocumentElement().getChildNodes();
	List<Student> list = new ArrayList<>();
	for(int i=0;i<nodeList.getLength(); i++){
		Node node = nodeList.item(i);
		if(node instanceof Element){
			Student student = new Student();
			student.id = node.getAttributes().getNamedItem(tagName).getNodeValue();
			NodeList childNodes = node.getChildNodes();
			for(int j=0;j<childNodes.getLength();j++){
				Node cNode = childNodes.item(j);
				if(cNode instanceof Element){
					String content = cNode.getLastChild().getTextContent().trim();
					String data = cNode.getNodeName();
					switch(data){
					case "firstName":
						student.firstName = content;
						break;
					case "lastName":
						student.lastName = content;
						break;
					case "score":
						student.score = content;  
						break;	
					}
				}
			}
			list.add(student);
		}
		
	 }
	return list;		
  }
	
	//method here
	String grade;
	String data;
	
	public void getGrade(int score){
		if (score >90)
			grade ="A";
		else if (score >=80 && score <=89)
			grade = "B";
		else if (score >=70 && score <=79)
			grade = "C";
		else
			grade = "repeat needed";
		
		
			
	}
	
}


