import org.junit.Assert;
import org.junit.Test;

public class LockerTest {
    @Test
    public void combinationTest(){
        Locker lock=new Locker();
        if(lock.isOpen()){
            lock.unlock("5791");
        }
        if(!lock.isOpen()){
            lock.lock();
        }
        if(lock.isOpen()){
            lock.newComb("9716");
        }
    }
}