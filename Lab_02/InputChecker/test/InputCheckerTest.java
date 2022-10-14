import org.junit.Assert;
import org.junit.Test;

public class InputCheckerTest {
    @Test
    public void inputTest(){
        InputChecker inputChecker=new InputChecker();
        Assert.assertEquals("OK",inputChecker.checkInput("S"));
        System.out.println(inputChecker.checkInput("S"));
        Assert.assertEquals("OK",inputChecker.checkInput("SI"));
        System.out.println(inputChecker.checkInput("SI"));
        Assert.assertEquals("OK",inputChecker.checkInput("OK"));
        System.out.println(inputChecker.checkInput("OK"));
        Assert.assertEquals("OK",inputChecker.checkInput("certo"));
        System.out.println(inputChecker.checkInput("certo"));
        Assert.assertEquals("OK",inputChecker.checkInput("perché no?"));
        System.out.println(inputChecker.checkInput("perché no?"));

        Assert.assertEquals("Fine",inputChecker.checkInput("N"));
        System.out.println(inputChecker.checkInput("N"));
        Assert.assertEquals("Fine",inputChecker.checkInput("NO"));
        System.out.println(inputChecker.checkInput("NO"));

        Assert.assertEquals("Dato non corretto",inputChecker.checkInput("altro"));
        System.out.println(inputChecker.checkInput("altro"));
    }
}