package com.week03;

import java.util.ArrayList;

public class Week11_Arrays_DS {

	public static void main(String args[]) {

		String[] names = new String[2];

		names[0] = "Alice";

		names[1] = "Bob";

		names[2] = "Charlie";

		System.out.println(names[2]);

	}

	public class Test {

		public void main(String[] args) {

			int[] numbers = { 1, 2, 3, 4, 5 };

			for (int i = 0; i <= numbers.length; i++) {

				System.out.println(numbers[i]);

			}

		}

	}

	public static class ArrayListQuestion {

		public static void main(String[] args) {

			ArrayList<String> colors1 = new ArrayList<>();

			colors1.add("red");

			colors1.add("green");

			colors1.add("blue");

			colors1.add("yellow");

			ArrayList<String> colors2 = new ArrayList<>(colors1);

			colors2.add("orange");

			colors2.add("purple");

			colors2.add("pink");

			System.out.println(colors2.get(5));

		}

	}

	public static class ArrayListModification {

		public static void main(String[] args) {

			ArrayList<String> fruits = new ArrayList<>();

			fruits.add("apple");

			fruits.add("banana");

			fruits.add("cherry");

			fruits.add("date");

			fruits.add(2, "elderberry");

			fruits.remove(4);

			System.out.println(fruits);
			fruits.indexOf(fruits);

		}

	}

}
