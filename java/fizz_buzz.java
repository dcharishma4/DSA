import java.util.Scanner;
class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner s = new Scanner(System.in);
		int N =s.nextInt();
		if (N%3 == 0 && N%5 == 0){ // if N s multipy by both 3 and 5
			System.out.println("fizzbuzz"); 
		}
		else if (N%3 == 0){ // if N is multiply by only 3
			System.out.println("fizz");
		}
		else if   (N%5 ==0){ //if N is multiply by obly 5
			System.out.println("buzz");
		}
		else{ // other than 3 and 5 print n
			System.out.println(N);
		}
	}
}
