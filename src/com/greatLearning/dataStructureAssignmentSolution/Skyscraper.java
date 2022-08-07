package com.greatLearning.dataStructureAssignmentSolution;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Skyscraper {

	public static Queue<Integer> sortstack(Queue<Integer> input) {
		Queue<Integer> tmpStack = new PriorityQueue<Integer>();
		while (!input.isEmpty()) {
			int tmp = input.remove();
			while (!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
				input.add(tmpStack.remove());
			}

			tmpStack.add(tmp);
		}
		return tmpStack;
	}

	public static void main(String args[]) {

		int no_of_Floors = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the total no of floors in the building : ");
		no_of_Floors = sc.nextInt();

		Queue<Integer> queueInt = new PriorityQueue<Integer>();

		int[] floorSize = new int[no_of_Floors];

		for (int i = 0; i < no_of_Floors; i++) {
			int count = i + 1;
			System.out.println("enter the floor size given on day : " + count);
			floorSize[i] = sc.nextInt();
			queueInt.add(floorSize[i]);
		}

		System.out.println(sortstack(queueInt));

	}

}
