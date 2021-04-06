package exercises;

import java.util.Scanner;

public class TrafficSignal {
	void trafficLight(String light) {
		switch (light) {
		case "red":
			System.out.println("STOP");
			break;
		case "yellow":
			System.out.println("READY");
			break;
		default:
			System.out.println("wrong input");
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		TrafficSignal ts = new TrafficSignal();
		System.out.println("select any of the light");
		String light = sc.next();
		ts.trafficLight(light);
		sc.close();

	}

}
