package RegexAssignment;

import org.junit.*;
import static org.junit.Assert.*;

public class RegexAssignment2Test {
    RegexAssignment2 regex=new RegexAssignment2();
    @BeforeClass
    public static void beforeClass(){
        System.out.println("This is @BeforeClass");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("This is @AfterClass");
    }
    @Test
    public void testregexMail(){
        boolean result= regex.regexMail("abc@yahoo.com,");
        assertEquals(true,result);
    }
    @Test
    public void TestregexMail(){
        boolean result= regex.regexMail("abc.100@yahoo.com");
        assertEquals(true,result);
    }
    @Test
    public void TestregexMail1(){
        boolean result= regex.regexMail("abc111@abc.com,");
        assertEquals(true,result);
    }
    


}