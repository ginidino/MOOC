package test6;

public class Exercise100 {
	public static void main(String[] args) {
		NightSky NightSky = new NightSky(0.1, 40, 10);
		NightSky.printLine();
		NightSky.print();
		System.out.println("Number of stars: " + NightSky.starsInLastPrint());
		System.out.println("");

		NightSky = new NightSky(0.2, 15, 6);
		NightSky.print();
		System.out.println("Number of stars: " + NightSky.starsInLastPrint());
	}
}
