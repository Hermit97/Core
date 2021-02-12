import java.util.Scanner;
public class Fraction{
	private int num;
	private int denom;

	//default constructor 
	public Fraction(){
		num = 0;
		denom = 1;
	}

	//alternate constructor: 1 param
	public Fraction(int n){
		num = n;
		denom = 1;
	}

	//alternate constructor: 2 param
	public Fraction(int n, int d){
		num = n;
		denom = (d != 0)? d : 1;
	}

	public void setNum(int n){
		num = n;
	}

	public void setDenom(int n){
		denom = (n != 0)? n : 1;
	}

	public int getNum(){
		return num;
	}

	public int getDenom(){
		return denom;
	}

	public void read(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter fraction(numerator demoninator): ");
		num = input.nextInt();
		denom = input.nextInt();
	}

	public void write(){
		System.out.print(num + " / " + denom);
		System.out.println();
	}

	public String toString(){
		return num + " / " + denom;
	}

	private int greatestCommonDivisor(int n, int d){
		int temp = n % d;
		while(temp > 0){
			n = d;
			d = temp;
			temp = n % d;
		}
		return d;
	}

	public void simpilify(){
		int gcd;
		int absNum = Math.abs(num);
		if(num != 0 && absNum != 1 && denom != 1){
			gcd = greatestCommonDivisor(absNum, denom);
			if(gcd > 1){
				num = num / gcd;
				denom = denom / gcd;
			}
		}
	}

	public double transform(){
		return (double)num/ denom;
	}

	public boolean equals(Fraction someFraction){
		return (num == someFraction.num && denom == someFraction.denom);
	}
	
	public Fraction add(Fraction someFraction){
		Fraction result = new Fraction();
		result.num = num * someFraction.denom + denom * someFraction.num;
		result.num = num * someFraction.denom;
		result.simpilify();
		return result;
	}

	public Fraction subtract(Fraction someFraction){
		Fraction result = new Fraction();
		result.num = num * someFraction.denom - denom * someFraction.num;
		result.denom = denom * someFraction.denom;
		result.simpilify();
		return result;
	}

	public Fraction multiply(Fraction someFraction){
		Fraction result = new Fraction();
		result.num = num * someFraction.num;
		result.denom = denom * someFraction.denom;
		result.simpilify();
		return result;
	}

	public Fraction divide(Fraction someFraction){
		Fraction result = new Fraction();
		result.num = num * someFraction.denom;
		result.denom = denom * someFraction.denom;
		result.simpilify();
		return result;
	}

	public Fraction getCopy(){
		return new Fraction(num, denom);
	}	

	public void copy(Fraction someFraction){
		num = someFraction.num;
		denom = someFraction.denom;
	}
}
