package RegexAssignment;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import java.util.regex.Pattern;

public class RegexAssignment2 {

    public boolean regexMail(String str)
    {
        boolean bool3= Pattern.matches("[a-zA-Z]{1,}[.]{0,1}[-]{0,1}[+]{0,1}[a-zA-Z0-9]{0,}[@]{1}[a-zA-Z0-9]{1,}[.]{1}[a-z]{2,}[.]{0,1}[a-z]{0,}[,]{0,1}",str);
        if(bool3==true)
            return true;
        else
            return false;

    }
}
