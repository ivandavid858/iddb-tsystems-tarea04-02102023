
public class Exercise5 {

	public static void main(String[] args) {

		int A = 4;
		int B = 5;
		int C = 6;
		int D = 7;
		
		B = C;
		C = A;
		A = D;
		D = B;
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);

	}

}
