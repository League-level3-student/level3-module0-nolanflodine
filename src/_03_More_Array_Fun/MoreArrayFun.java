package _03_More_Array_Fun;

import java.util.Random;


public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		MoreArrayFun a = new MoreArrayFun();
		// a.print();
		// a.backwards();
		// a.skip();
		a.random();
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	void print() {
		String[] words = new String[5];
		words[0] = "a";
		words[1] = "b";
		words[2] = "c";
		words[3] = "d";
		words[4] = "e";
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	void backwards() {
		String[] words = new String[5];
		words[0] = "a";
		words[1] = "b";
		words[2] = "c";
		words[3] = "d";
		words[4] = "e";
		for (int i = 4; i > -1; i--) {
			System.out.println(words[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	void skip() {
		String[] words = new String[5];
		words[0] = "a";
		words[1] = "b";
		words[2] = "c";
		words[3] = "d";
		words[4] = "e";
		for (int i = 0; i < words.length; i++) {
			if (i % 2 == 0) {
				System.out.println(words[i]);
			}
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.

	void random() {
		String[] words = new String[5];
		Random rand = new Random();
		words[0] = "a";
		words[1] = "b";
		words[2] = "c";
		words[3] = "d";
		words[4] = "e";
		for (int i = 0; i < 999; i++) {
			System.out.println(words[rand.nextInt(5)]);
		}
	}

}