package com.qa.testing;

import java.util.ArrayList;

public class DoggoCompetition {

	public String doggoCompetition(int i) {
		ArrayList<Integer> places = new ArrayList<Integer>();
		String s = "";

		for (int j = 1; j < 101; j++) {
			if (j != i) {
				places.add(j);
			}
		}

		for (int k = 0; k < places.size(); k++) {

			if (places.get(k) % 10 == 1 & places.get(k) != 11) {
				s += places.get(k) + "st, ";
			} else if (places.get(k) % 10 == 2 & places.get(k) != 12) {
				s += places.get(k) + "nd, ";
			} else if (places.get(k) % 10 == 3 & places.get(k) != 13) {
				s += places.get(k) + "rd, ";
			} else if (places.get(k) == 100) {
				s += places.get(k) + "th";
			} else {
				s += places.get(k) + "th, ";
			}
		}

		return s;

	}
}
