package edu.handong.csee.java.lab06;

import java.util.Scanner;
public class Buginfestation {

	final double ONE_BUG_VOLUME = 0.002;
	final double GROWTH_RATE = 0.95;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buginfestation myRochInfestation = new Buginfestation();
		
		myRochInfestation.calculateRoach();

	}
	
	public void calculateRoach() {
		
		Scanner myScanner = new Scanner(System.in);
		double houseVolume = myScanner.nextDouble();
		double startPopulation = myScanner.nextDouble();
		
		double population = startPopulation;
		double totalBugVolume = population * ONE_BUG_VOLUME;
		
		int countWeek = 0;
		
		while(totalBugVolume < houseVolume) {
			double newBugs = population * GROWTH_RATE;
			double newBugsVolume = newBugs * ONE_BUG_VOLUME;
			population = population +newBugs;
			totalBugVolume = totalBugVolume + newBugsVolume;
			countWeek = countWeek +1;
		}
		
		System.out.println("Start volume = " + startPopulation);
		System.out.println("House volume = " + houseVolume);
		System.out.println("CountWeeks = " + countWeek);
		System.out.println("Population =" + (int)population);
		System.out.println("TotalBugVolume = " + totalBugVolume);
	}

}
