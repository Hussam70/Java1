package ooo;
import java.util.Scanner;

public class Ampt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] Menu = {
				{"1", "pizza"},
				{"2", "burger"},
				{"3", "fish"},
				{"4", "pnana"}
				};
				
		Scanner r = new Scanner(System.in);
		System.out.print("Choose what you like");
		String M = r.next();
		
		for(int i = 0; i < Menu.length; i++)
		{
			if(M.equals(Menu[i][0])) {
				System.out.println(Menu[i][1]);
				break;
			}
		}
		
	}

}
