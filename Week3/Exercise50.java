package test3;

import java.util.Scanner;

public class Exercise50 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        if (name.length() < 3) {
        	return;
        } else {
        	for (int i = 0; i < 3; i++) {
            	System.out.println((i + 1) + ". character: " + name.charAt(i));
            }
        }  
	}
}
