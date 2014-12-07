package StudentDatabase;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

/*import student.database.ArrayList;
import student.database.IOException;
import student.database.List;
import student.database.ParserConfigurationException;
import student.database.SAXException;
import student.database.String;*/
import xml.reader.Student;
import xml.reader.XmlReader;

public class ProcessStudentInfo {

	
	
		

			/*
			 * Under XmlReader class, the parseData() will return list of Student Info which will contain Student first name, last name and score.
			 * You need to write some method which will convert score into Grade in letter('A'for90 to 100,'B'for 80 to 89 and 
			 * 'C' for 70 to 79.Then print this to the console.
			 * Do any necessary steps that require for below successful output.
			 * .................................................
			  Student (id= 1) "Marc" "Carp"   Grade= B
			 * Student (id= 2) "Israt" "Khan"   Grade= A
			 * Student (id= 3) "Mohi" "Uddin"   Grade= A
			 * Student (id= 4) "Abrar" "Hossain"   Grade= B
			 * Student (id= 5) "Abida" "Sultana"   Grade= B
			 * .................................................
			 * 
			 * 
			 */
	
				public static void main(String[] args) throws ParseException, ParserConfigurationException, SAXException, IOException {
					List<Student> list = new ArrayList<Student>();
					XmlReader reader = new XmlReader();
					list = reader.parseData("id");
					for(Student st:list){
						System.out.println(st.id+" "+st.firstName+" "+st.lastName);
					}
					XmlReader    xm = new XmlReader ();
					xm.parseData("name");
					Student st = new Student ();
					xm.getGrade(90);
				}
					
	

	}


