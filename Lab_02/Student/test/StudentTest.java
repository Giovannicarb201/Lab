import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class StudentTest {
    @Test
    public void newStudent(){
        Student s1=new Student("Giovanni","Carbone");
        Assert.assertEquals("Giovanni",s1.getFirstName());
        Assert.assertEquals("Carbone",s1.getLastName());
        Assert.assertTrue(s1.getExams().isEmpty());
        System.out.println(s1.getFirstName());
        System.out.println(s1.getLastName());
    }
    @Test
    public void registerExamTest(){
        Student s1=new Student("Giovanni","Carbone");
        Exam e1=new Exam("Programmazione 1",new GregorianCalendar(2022,Calendar.FEBRUARY,10),30);
        s1.registerExam(e1);
        Assert.assertEquals(1,s1.getExams().size(),0);
        Assert.assertEquals(30,s1.computeAverageGrade(),0);
        System.out.println(s1.getFirstName());
        System.out.println(s1.getLastName());
        System.out.println(s1.getExams().size());
        System.out.println(s1.computeAverageGrade());
    }
    @Test
    public void registerExamsTest() {
        Student s1=new Student("Giovanni","Carbone");
        Exam e1=new Exam("Programmazione 1",new GregorianCalendar(2022,Calendar.FEBRUARY,10),30);
        Exam e2=new Exam("Programmazione Objected Oriented",new GregorianCalendar(2022,Calendar.JUNE,24),22);
        s1.registerExam(e1);
        s1.registerExam(e2);
        Assert.assertEquals(2,s1.getExams().size(),0);
        Assert.assertEquals(26,s1.computeAverageGrade(),0);
        System.out.println(s1.getFirstName());
        System.out.println(s1.getLastName());
        System.out.println(s1.getExams().size());
        System.out.println(s1.computeAverageGrade());
    }
}