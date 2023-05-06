package BasicSeleniumPrograms;
import java.util.*;
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc= new Scanner(System.in)	;
	System.out.println("Please provide name");
	String s=sc.nextLine();
	
	String rev = "";
		for (int i=s.length()-1;i>=0;i--) {
		
		rev=rev +  s.charAt(i);
		
	}
System.out.println(rev);
}}
