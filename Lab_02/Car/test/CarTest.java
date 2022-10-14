import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    @Test
    public void consumedTest(){
        Car c=new Car(30);
        c.addGas(400);
        Assert.assertEquals(400,c.getGas(),0);
        System.out.println("Il gas presente nell'auto e':"+c.getGas());
        c.drive(3);
        Assert.assertEquals(350,c.getGas(),50);
        System.out.println("Il gas restante per i chilometri percorsi e':"+c.getGas());
    }
}