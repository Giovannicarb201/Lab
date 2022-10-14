import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastWordTest {
    @Test
    public void test(){
        List<String> stringList=new ArrayList<>();
        stringList.add("giovanni");
        stringList.add("pasqua");
        stringList.add("CCC");

        FirstAndLastWord falw=new FirstAndLastWord(stringList);
        falw.sort();
        Assert.assertEquals("CCC",falw.getFirst());
        Assert.assertEquals("pasqua",falw.getLast());

        System.out.println(falw.getFirst());
        System.out.println(falw.getLast());
    }
    @Test
    public void testIgnoreCase(){
        List<String> stringList=new ArrayList<>();
        stringList.add("giovanni");
        stringList.add("pasqua");
        stringList.add("CCC");

        FirstAndLastWord falw=new FirstAndLastWord(stringList);
        falw.sortIgnoreCase();
        Assert.assertEquals("CCC",falw.getFirst());
        Assert.assertEquals("pasqua",falw.getLast());

        System.out.println(falw.getFirst());
        System.out.println(falw.getLast());
    }
}