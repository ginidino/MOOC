package test3;

public class Exercise44 {
	public static void main(String[] args) {
		int answer =  least(2, 7);
	    System.out.println("Least: " + answer);
	}
	public static int least(int num1, int num2) {
		return Math.min(num1, num2);
	}
}
