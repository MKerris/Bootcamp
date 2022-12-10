package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class week4Lists {

	public static void main(String[] args) {
		char userLetter = 'c';
		List<Character> alphabet = new ArrayList<>();
		for (int i = 97; i < (97+26); i++) {
		    alphabet.add((char) i);
		}
		
		alphabet.remove(0);
		System.out.println(alphabet);
	}
}

