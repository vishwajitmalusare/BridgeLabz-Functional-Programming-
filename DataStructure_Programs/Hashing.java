package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Hashing {
		
	public static LinkedList slot[] = new LinkedList[11];

		public static void main(String[] args) throws FileNotFoundException {
			
			String path = "/home/user/Hashing_data.txt";

			for (int i = 0; i < 11; i++) {
				slot[i] = new LinkedList();
			}

			BufferedReader br = new BufferedReader(new FileReader(path));
			try {
				String str = br.readLine();

				System.out.println(str);

				String[] strAr = str.split(" ");
				for (int i = 0; i < strAr.length; i++) {
					int slotNum = hash(strAr[i]);
					slot[slotNum].add(strAr[i]);
					// System.out.print(slot[slotNum]);
				}

				System.out.println();

				for (int i = 0; i < 11; i++) {
					System.out.print(i + "==> ");
					slot[i].displayList();

				}
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the element to search: ");
				String key = sc.nextLine();
				int slotNumber = hash(key);
				boolean value = slot[slotNumber].search(key);
				if (value) {
					System.out.println("\nElement found at slot " + slotNumber + " and deleted\n");
					slot[slotNumber].remove(key);
				} else {
					System.out.println("\nElement not found but added: " + key + " at slot " + slotNumber + "\n");
					slot[slotNumber].add(key);
				}

				System.out.println();
				for (int i = 0; i < 11; i++) {
					System.out.print(i + "==> ");
					slot[i].displayList();
				}

				String st = " ";
				for (int i = 0; i < 11; i++) {
					st = st + slot[i].toString();
				}
				System.out.println("New elements in file:\n" + st);
				BufferedWriter bw = new BufferedWriter(new FileWriter(path));
				bw.write(st);

				bw.close();
				br.close();
				sc.close();
			} catch (IOException e) {
				System.out.println("" + e.getMessage());
				e.printStackTrace();
			}
			

		}
		
		public static int hash(String str) {
			int index = Integer.parseInt(str) % 11;

			return index;
		}
	}
