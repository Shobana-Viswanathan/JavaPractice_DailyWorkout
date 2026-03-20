package com.hands_on_collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Collections_Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		Map<Character, Integer> map = new HashMap<>();
		char[] chars = {'a','c','o','s'};
		for(char ch : chars) {
			map.put(ch, 0);
		}
		for(int i = 0; i < text.length(); i++) {
			char ch = Character.toLowerCase(text.charAt(i));
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			}
		}
		System.out.println("Character counts:");
		for(char ch : chars) {
			System.out.println(ch + ": " + map.get(ch));
		}
	}
}
			







