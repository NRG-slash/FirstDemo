import java.util.Scanner;

/**
 * 
 */

/**
 * @author g.laturski
 *
 */
public class FirstDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		String userName;
		double firstNum;
		double secondNum;
		
		double sum;
		double difference;
		double product;
		
		System.out.println("Hello user, my name is Java. How are you today?");
		
		System.out.print("What is your name? ");
		userName = userInput.nextLine();
		
		System.out.print("Think of a number: ");
		firstNum = userInput.nextDouble();
		
		System.out.print("Think of another number: ");
		secondNum = userInput.nextDouble();
		
		sum = firstNum + secondNum;
		difference = firstNum - secondNum;
		product = firstNum * secondNum;
		
		System.out.println("\n" + userName + "? That's a really cool name!");
		
		System.out.println(String.format("Your sum: %10f", sum) );
		System.out.println(String.format("Your difference: %10f", difference) );
		System.out.println(String.format("your product: %10f", product));
		
		System.out.println("\n" + userName + " have a nice day!");
		
		userInput.close();
		
	}

}
