package assignments1;

import java.util.Scanner;

public class Emailvalidation {
	
public static void main(String[] args) {
		
		// search specific String 
		String[] emails={"abc@gmail.com","bc@gmail.com","ac@gmail.com"};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Search here");
		String word = sc.next();
		for(String email:emails) {
		
		if(email.equals(word))
		{
			System.out.println(word+" is Found");
			break;
		}
		else
		{
			System.out.println(word+" is not Found ");
			break;
		}
	}

	}


}




