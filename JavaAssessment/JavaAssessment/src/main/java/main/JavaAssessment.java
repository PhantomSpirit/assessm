package main;

import java.util.Random;
import java.util.Scanner;

import javax.print.attribute.standard.RequestingUserName;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class JavaAssessment {
	public static void main(String[] args) {
		int n = 1;
		int w = 2;
		int e = 3;
		int s = 4;
		int c = 5;
		int a = 0;
		int r = 6;
		int i = 7;
		int st = 8;

		int playAgain = 1;

		Character john = new Bob();
		Direction dir = new Direction();
		/*
		 * needs to be adjusted to give whole numbers withing 1-4
		 */
		Dice dice = new Dice();
		/*
		 * a position needs to be implented to streamline the code
		 */
		Position pos = new Position();

		double b;

		// b = Math.random() * 10;

		Scanner scan = new Scanner(System.in);

		while (playAgain == 1) {
			System.out.println(
					"Welcome to o adventurer, a great disaster is upon us. \nYou have been summoned to save our world. \nBefore you start your adventure please take this magic compass it will point you in the right direction.");
			System.out.println(
					"Please choose a direction (input a number), \n1 - North, 2 - West. \n3 - East, 4 - South. \n5 - Compass, 6 - Random Direction \n7 - Inventory, 8 - Stats \nBest follow the compass Adventurer if you want to Survive!");

			a = scan.nextInt();

			if (a == 1) {
				System.out.println("You turn North and you see a mountain range, you need to turn back");
				System.out.println("Please choose an action");
				System.out.println(
						"1 - North. 2 - West. \n3 - East. 4 - South. \n5 -  Compass. 6 Random Direction. \n7 Inventory, 8 Stats");
				a = scan.nextInt();

			} else if (a == 2) {
				System.out
						.println("You go West and find a lake bordering a forest to the south and plains to the West");
				System.out.println("Please choose an action");
				System.out.println(
						"1 - North. 2 - West. \n3 - East. 4 - South. \n5 -  Compass. 6 Random Direction. \n7 Inventory. 8 Stats");
				a = scan.nextInt();
			} else if (a == 3) {
				System.out.println("you turn East to find out you can't go any further due to a steep cliff.");
				System.out.println("Please choose an action");
				System.out.println(
						"1 - North. 2 - West. \n3 - East. 4 - South. \n5 -  Compass. 6 Random Direction. \n7 Inventory. 8 Stats");
				a = scan.nextInt();
			} else if (a == 4) {
				System.out.println(
						"You go South, and you see a lake to the East and a Cave entrance to the South and clear plains to the West.");
				System.out.println("Please choose an action");
				System.out.println(
						"1 - North. 2 - West. \n3 - East. 4 - South. \n5 -  Compass. 6 Random Direction. \n7 Inventory. 8 Stats");
				a = scan.nextInt();
			} else if (a == 5) {
				System.out.println("You look at the compass on your hand and it points towards South.");
				System.out.println("Please choose an action");
				System.out.println(
						"1 - North. 2 - West. \n3 - East. 4 - South. \n5 -  Compass. 6 Random Direction. \n7 Inventory. 8 Stats");
				a = scan.nextInt();
			} else if (a == 6) {
				// System.out.println(b);
				dice.calcula();
				System.out.println("Please choose an action");
				System.out.println(
						"1 - North. 2 - West. \n3 - East. 4 - South. \n5 -  Compass. 6 Random Direction. \n7 Inventory. 8 Stats");
				a = scan.nextInt();
			} else if (a == 7) {
				john.jacket();
				john.belt();
				john.jeans();
				john.boots();
				System.out.println("Please choose an action");
				System.out.println(
						"1 - North. 2 - West. \n3 - East. 4 - South. \n5 -  Compass. 6 Random Direction. \n7 Inventory. 8 Stats");
				a = scan.nextInt();
			} else if (a == 8) {
				john.hp();
				john.power();
				System.out.println("Please choose an action");
				System.out.println(
						"1 - North. 2 - West. \n3 - East. 4 - South. \n5 -  Compass. 6 Random Direction. \n7 Inventory. 8 Stats");
				a = scan.nextInt();
			}
			if (a == 1) {
				System.out.println("Turn around you can't go any further");
				System.out.println("Please choose an action");
				System.out.println(
						"1 - North. 2 - West. \\n3 - East. 4 - South. \\n5 -  Compass. 6 Random Direction. \\n7 Inventory. 8 Stats");
				a = scan.nextInt();
			}
			if (a == 2 || a == 4) {
				System.out.println("You go West  and see a thick forest to the north and west, you can only go South");
				System.out.println("Please choose an action");
				System.out.println(
						"1 - North. 2 - West. \n3 - East. 4 - South. \n5 -  Compass. 6 Random Direction. \n7 Inventory. 8 Stats");
				a = scan.nextInt();
			}
			if (a == 3) {
				System.out.println("Choose another direction");
				System.out.println("Please choose an action");
				System.out.println(
						"1 - North. 2 - West. \n3 - East. 4 - South. \n5 -  Compass. 6 Random Direction. \n7 Inventory. 8 Stats");
				a = scan.nextInt();
			} else if (a == 4) {
				System.out.println(
						"You enter a cave system, you can either go back, go further(South) or go East into another tunnel.");
				System.out.println("Please choose an action");
				System.out.println(
						"1 - North. 2 - West. \n3 - East. 4 - South. \n5 -  Compass. 6 Random Direction. \n7 Inventory. 8 Stats");
				a = scan.nextInt();
			}
			if (a == 5) {
				System.out.println("You look at the compass on your hand and it points West. \nYou head West.");
				System.out.println("Please choose an action");
				System.out.println(
						"1 - North. 2 - West. \n3 - East. 4 - South. \n5 -  Compass. 6 Random Direction. \n7 Inventory. 8 Stats");
				a = scan.nextInt();
			}
			if (a == 6) {
				dice.calcula();
				;
				System.out.println("Please choose an action");
				System.out.println(
						"1 - North. 2 - West. \n3 - East. 4 - South. \n5 -  Compass. 6 Random Direction. \n7 Inventory. 8 Stats");
				;
			}
			if (a == 7) {
				john.jacket();
				john.belt();
				john.jeans();
				john.boots();
				System.out.println("Please choose an action");
				System.out.println(
						"1 - North. 2 - West. \n3 - East. 4 - South. \n5 -  Compass. 6 Random Direction. \n7 Inventory. 8 Stats");
				a = scan.nextInt();
			}
			if (a == 8) {
				john.hp();
				john.power();
				System.out.println("Please choose an action");
				System.out.println(
						"1 - North. 2 - West. \n3 - East. 4 - South. \n5 -  Compass. 6 Random Direction. \n7 Inventory. 8 Stats");
				a = scan.nextInt();
			}
			if (a == 5) {
				System.out.println("You look at the compass on your hand and it points West. \nYou proceed West again!");
				System.out.println("Please choose an action");
				System.out.println(
						"1 - North. 2 - West. \n3 - East. 4 - South. \n5 -  Compass. 6 Random Direction. \n7 Inventory. 8 Stats");
				a = scan.nextInt();
			}
			if (a == 2) {
				System.out.println("You are in a plain, you can only go back or Westards");
				System.out.println("Please choose an action");
				System.out.println(
						"1 - North. 2 - West. \n3 - East. 4 - South. \n5 -  Compass. 6 Random Direction. \n7 Inventory. 8 Stats");
				a = scan.nextInt();
			}
			if (a == 5) {
				System.out.println("You look at the compass on your hand and it points West. \nYou start to wonder if this thing is broken but yougo West.");
				System.out.println("Please choose an action");
				System.out.println(
						"1 - North. 2 - West. \n3 - East. 4 - South. \n5 -  Compass. 6 Random Direction. \n7 Inventory. 8 Stats");
				a = scan.nextInt();
			}
			if (a == 5) {
				System.out.println("You look at the compass on your hand and it points South. \nSouth? That is an improved. You go South.");
				System.out.println("Please choose an action");
				System.out.println(
						"1 - North. 2 - West. \n3 - East. 4 - South. \n5 -  Compass. 6 Random Direction. \n7 Inventory. 8 Stats");
				a = scan.nextInt();
			}
			if (a == 5) {
				System.out.println("You look at the compass on your hand and it points South. \nSouth we go again.");
				System.out.println("Please choose an action");
				System.out.println(
						"1 - North. 2 - West. \n3 - East. 4 - South. \n5 -  Compass. 6 Random Direction. \n7 Inventory. 8 Stats");
				a = scan.nextInt();
			}
			if (a == 5) {
				System.out.println("You look at the compass on your hand and it points East. \nHmm we are getting somewhere think we are close");
				System.out.println("Please choose an action");
				System.out.println(
						"1 - North. 2 - West. \n3 - East. 4 - South. \n5 -  Compass. 6 Random Direction. \n7 Inventory. 8 Stats");
				a = scan.nextInt();
			}
			if (a == 5) {
				System.out.println("The compass spins uncontrollably,it seems you have reached your destination congratulations.");
				System.out.println("Please choose an action");
				System.out.println("Game Over! \nPlease press 1 to restart the game.");
				a = scan.nextInt();
			}
			if (a == 3) {
				System.out.println("You head East, you have reached your destination congratulations.");
				System.out.println("Game Over! \nPlease press 1 to restart the game.");

				a = scan.nextInt();
			}
			System.out.println("Game Over! \nPlease press 1 to restart the game.");
			playAgain = scan.nextInt();

		}

	}

}
// }
