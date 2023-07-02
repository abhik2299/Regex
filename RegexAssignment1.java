package RegexAssignment;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class RegexAssignment1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First name");
        String str1=sc.nextLine();
        boolean bool1=Pattern.matches("[A-Z]{1}[a-z]{2,}",str1);
        if(bool1==true)
            System.out.println("Valid First name");
        else
            System.out.println("Invalid First name ");


        System.out.println("Enter Second name ");
        String str2=sc.nextLine();
        boolean bool2=Pattern.matches("[A-Z]{1}[a-z]{2,}",str2);
        if(bool2==true)
            System.out.println("Valid second name");
        else
            System.out.println("Invalid second name ");


        System.out.println("Enter a valid email");
        String str3= sc.nextLine();
        boolean bool3=Pattern.matches("[a-zA-Z]{1,}[.]{0,1}[a-zA-Z0-9]{0,}[@]{1}[a-zA-Z0-9]{1,}[.]{1}[a-z]{2,}[.]{0,1}[a-z]{0,}",str3);
        if(bool3==true)
            System.out.println("Valid e-mail");
        else
            System.out.println("Invalid e-mail");


        System.out.println("enter phone no");
        String str4=sc.nextLine();
        boolean bool4=Pattern.matches("[9]{1}[1]{1}[0-9]{10}",str4);
        if(bool4==true)
            System.out.println("Valid phone no");
        else
            System.out.println("Invalid phone no");

        System.out.println("Enter the Password");
        String pass =sc.nextLine();
        boolean passCheck=Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[\\!\\#\\@\\$\\%\\&\\/\\(\\)\\=\\?\\*\\-\\+\\-\\_\\.\\:\\;\\,\\{\\}\\^]).{8,32}$",pass);
        if(passCheck==true)
        System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");



    }
}
