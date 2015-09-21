import java.util.Scanner;
public class apples {
	public static void main (String[] args){
		//create object of the class
		methods methodsObject =new methods();
		methodsObject.message();
		//scanner method for the method mylove
		Scanner input=new Scanner(System.in);
		System.out.println("enter the important character trait of your crush:");
		String name=input.nextLine();//set input to be stored in var name from methods class
		
		methodsObject.mylove(name);
	}

}
