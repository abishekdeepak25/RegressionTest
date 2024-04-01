package Project;
import static org.junit.Assert.*;

import org.junit.Test;
public class testcase {
    @Test
    public void test(){
        addition t=new addition();
        int actual=t.sumNum(10,20);
        int expected=30;
        assertEquals(expected,actual);
    }
}
