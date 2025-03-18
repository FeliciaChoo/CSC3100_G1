package LAB2;
/*Name:Choo En Yi
 * Lab:2
 * Date:18/10/2023
 * Qustion E: Calculate denomination notes
 */
import java.util.Scanner;
public class QuestionE {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);//create a scanner object
		//read the input
		System.out.print("Enter amount of Ringgit Malaysia:RM ");
		int amount= input.nextInt();
		// formula of the denomination notes
		int notes50= amount/50;
		int notes20= (amount%=50)/20;
		int notes10= (amount%=20)/10;
		int notes5= (amount%=10)/5;
		int notes1=(amount%=5)/1;
		//print output
		System.out.println("Amount of RM50:"+notes50);
		System.out.println("Amount of RM20:"+notes20);
		System.out.println("Amount of RM10:"+notes10);
		System.out.println("Amount of RM5 :"+notes5);
		System.out.println("Amount of RM1 :"+notes1);
		input.close();
		
	}

}
