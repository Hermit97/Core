import java.util.Scanner;
public class FractionClient1{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		int x, y;
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction();
		int choice;
		choice = menu();
		while(choice != 0){
			f1.read();
			System.out.println("tCall to toString --> Fraction 1 = " + f1);
			System.out.print("\tFraction 1 simplified = ");
			f1.write();
			f1.read();
			System.out.println("\tCall to toString --> Fraction 2 = " + f2);
			System.out.print("\tCall to write --> Fraction 2 = ");
			f2.write();
			f2.simpilify();
			System.out.print("\tFraction 2 simplified = ");
			f2.write();

		}
	}

	public static int menu(){
		int choice;
		do{
			System.out.println("\nYour options for fraction operations are: ");
			System.out.println("--------------------------------------------");
			System.out.println("\t1) Add 2 fractions");
            System.out.println("\t2) Subtract 2 fractions");
            System.out.println("\t3) Multiply 2 fractions");
            System.out.println("\t4) Divide 2 fractions");
            System.out.println("\t5) Compare fractions");
            System.out.println("\t0) EXIT");
            System.out.print("Please enter your option: ");
            choice = input.nextInt(); //VALID TYPE??? Find solutions. getInt()???
            System.out.println();
		}while(choice < 0 || choice > 5);
		return choice;
	}
	
}
