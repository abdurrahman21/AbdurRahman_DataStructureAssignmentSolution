package com.greatLearning.dataStructureAssignmentSolution;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Skyscraper {

	public static Stack<Integer> sortstack(Queue<Integer> input) {
		Stack<Integer> tmpStack = new Stack<Integer>();
		while (!input.isEmpty()) {
			int tmp = input.remove();
			while (!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
				input.add(tmpStack.pop());
			}

			tmpStack.add(tmp);
		}
		return tmpStack;
	}
	
	public static void check(Stack<Integer> stackArr) {
		int j = 0;
		while(!stackArr.isEmpty()) {
			int count = j + 1;
			if(stackArr.get(j) > stackArr.get(j + 1)) {
				System.out.println("Day " + count + ":" + stackArr.get(j));
				j++;
			}
			stackArr.remove(j);
		}
	}

	public static void main(String args[]) {

		int no_of_Floors = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the total no of floors in the building : ");
		no_of_Floors = sc.nextInt();

		Stack<Integer> stackInt = new Stack<Integer>();

		int[] floorSize = new int[no_of_Floors];

		for (int i = 0; i < no_of_Floors; i++) {
			int count = i + 1;
			System.out.println("enter the floor size given on day : " + count);
			floorSize[i] = sc.nextInt();
			stackInt.add(floorSize[i]);
		}

		//System.out.println(sortstack(queueInt));
		for (int i = 0; i < no_of_Floors; i++) {
			check(stackInt);
		}
		
		

	}

}
