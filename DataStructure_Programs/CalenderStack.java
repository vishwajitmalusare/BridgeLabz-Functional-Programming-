package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.datastructure.UtilityDataStructure.Stack;;
public class CalenderStack {

	static int arr[][] = new int[6][7];
	public static void main(String[] args) {
		UtilityDataStructure util=new UtilityDataStructure();
		Stack<Integer> stack=util.new Stack<Integer>();
		Stack<Integer> stack1=util.new Stack<Integer>();
		int dayinmonth = 1;

		System.out.println("Enter the Month : ");
		int month = Utility.scan.nextInt();
		System.out.println("Enter the Year : ");
		int year = Utility.scan.nextInt();

		int days = Utility.dayOfWeek(1, month, year);

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			dayinmonth = 31;

		} else if (month == 4 || month == 6 || month == 9 || month == 12) {
			dayinmonth = 30;
		} else if (month == 2) {
			if (isLeapyear(year) == true) {
				dayinmonth = 28;
			} else {
				dayinmonth = 29;
			}
		}
		int count = 1;
		for (int i = 0; i < 6; i++) {
			for (int j = days; j < 7; j++) {
				if (count <= dayinmonth) {
					arr[i][j] = count;
					// System.out.println(arr[i][j]);
					stack.push(arr[i][j]);
					count++;

				} else {
					break;
				}

				// System.out.println(arr[i][j]);
			}
			days = 0;

		}

		for (int i = 1; i <= dayinmonth; i++) {
			stack1.push(stack.pop());
		}
		System.out.println("sun\tMon\tTue\twed\tThu\tFri\tSat");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (arr[i][j] == 0) {
					System.out.print("\t");
				} else if (arr[i][j] > 9) {
					int val = (int) stack1.pop();
					System.out.print(+val + "\t");
				} else {
					int val = (int) stack1.pop();
					System.out.print(+val + "\t");
				}
			}
			System.out.println();
		}

	}

	/**
	 * Method for finding leap year
	 * 
	 * @param year:- Leap year
	 * @return:-boolean condition
	 */
	public static boolean isLeapyear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0))
			return true;
		if (year % 400 == 0)
			return true;
		return true;
		}
	}
