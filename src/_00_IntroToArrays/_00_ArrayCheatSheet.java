package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
String[] thing = new String[5];
thing[0] = "a";
thing[1] = "b";
thing[2] = "c";
thing[3] = "d";
thing[4] = "e";
		//2. print the third element in the array
System.out.println(thing[2]);
		//3. set the third element to a different value
thing[2] = "A";
		//4. print the third element again
System.out.println(thing[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
for(int i = 0; i<thing.length; i++) {
	thing[i] = "String of my choice";
}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
for (int i = 0; i < thing.length; i++) {
	System.out.println(thing[i]);
}
		//7. make an array of 50 integers
int[] nums = new int[50];
		//8. use a for loop to make every value of the integer array a random number
Random rand = new Random();
for (int i = 0; i < nums.length; i++) {
	nums[i] = rand.nextInt(100);
}
		//9. without printing the entire array, print only the smallest number on the array
int small = 200;
for (int i = 0; i < nums.length; i++) {
	if(nums[i]<small) {
		small = nums[i];
	}
}
System.out.println(small);
		//10 print the entire array to see if step 8 was correct
for (int i = 0; i < nums.length; i++) {
	System.out.println(nums[i]);
}
		//11. print the largest number in the array.
int big = 0;

for (int i = 0; i < nums.length; i++) {
	if(nums[i]>big) {
		big = nums[i];
	}
}
System.out.println(big);
		//12. print only the last element in the array
System.out.println(nums[49]);
	}
}
