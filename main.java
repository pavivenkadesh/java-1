import.java.util.*;
import.java.util.Scanner.*;
public class Main
{
    public static void main(String[] args) 
    {
        int number;
		 Scanner in = new Scanner(System.in);
		
     
      number = in.nextInt();
        if(number > 0)
        {
            System.out.println(number+" is a positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }
    }
}
