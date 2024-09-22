package com.kleberaluizio.hash_table;

import java.util.*;

public class Pattern_290
{
	public static void main(String[] args)
	{
		String pattern = "abba";
		//String s = "dog cat cat dog";
		String s = "dog cat cat fish";

		System.out.println(wordPattern(pattern,s));
	}

	public static boolean wordPattern(String pattern, String s) {
		char[] letters = pattern.toCharArray();
		String[] words = s.split(" ");

		if (letters.length != words.length){
			return false;
		}

		HashMap<Character , String> map = new HashMap<>();
		HashSet<String> set = new HashSet<>();

		for(int i = 0; i < letters.length; i++) {
			if(!map.containsKey(letters[i])) {
				if (set.contains(words[i])){
					return false;
				}
				map.put(letters[i], words[i]);
				set.add(words[i]);
			}
			else if (!map.get(letters[i]).equals(words[i])) {
				return false;
			}
		}
		return true;
	}
}

