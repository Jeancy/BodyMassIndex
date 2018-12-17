/**
*Project: Computing Body Mass Index
*weekend project.
*
*/
package bodymassindex;
import java.util.scanner;
/**
* @ Author Jeancy Tshibemba
* @ version 1.0
*/

public class BodyMassIndex{
    
    public static void compute(){
		Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the weight in pounds please...>>");
		double we = scanner.nextDouble();// weight in pounds
		double weight = we * 0.45359237 ;// weight in kilograms
		System.out.println ("Enter the height in inches please...>>");
		scanner.nextLine();
		double h = scanner.nextDouble();//height in inches
		double height = h * 0.025; // height in meters
		double bmi = weight /( height*height); // Body Mass Index formula
		if(bmi < 18.5){
			System.out.println("You are underweight");
		}else if( (bmi >= 18.5) && (bmi < 25)){
			System.out.println("Your weight is normal");
		}else if((bmi >= 25)&&( bmi < 30)){
			System.out.println("You are overweight");
		}else{
			System.out.println("You are obese");
		}
	}
	public static void main(String [] args){
		BodyMassIndex.compute();// Calling the compute method general context
		compute(); //This an alternative way to call a static method in the same class.
	}
}
