import org.junit.Assert;
import org.junit.Test;

public class InfectedTest {

    @Test
    public void addInfectedTest(){
        Infected infect=new Infected("Ebola");
        infect.addInfected(5);
        Assert.assertEquals(5,infect.getNumberOfInfected(),0);
        System.out.println(infect.getDisease());
        System.out.println(infect.getNumberOfInfected());
    }
    @Test
    public void updateInfectedTest(){
        Infected infect=new Infected("Covid19");
        infect.addInfected(100);
        Assert.assertEquals(100,infect.getNumberOfInfected(),0);
        System.out.println(infect.getDisease());
        System.out.println(infect.getNumberOfInfected());
        infect.updateInfectedByRt(0.9);
        Assert.assertEquals(100,infect.getNumberOfInfected(),10);
        System.out.println(infect.getDisease());
        System.out.println(infect.getNumberOfInfected());
        infect.updateInfectedByRt(1.5);
        Assert.assertEquals(100,infect.getNumberOfInfected(),35);
        System.out.println(infect.getDisease());
        System.out.println(infect.getNumberOfInfected());
    }
}