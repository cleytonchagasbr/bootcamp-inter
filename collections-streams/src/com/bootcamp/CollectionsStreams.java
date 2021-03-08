package com.bootcamp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsStreams {
	
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		
		nomes.add("Cleyton");
		nomes.add("Elon");
		nomes.add("Tesla");
		nomes.add("Airton");
		System.out.println(nomes);
		
		Collections.sort(nomes);
		System.out.println(nomes);
		
		nomes.set(3, "Aphelium");
		System.out.println(nomes);
		
		nomes.remove(3);
		System.out.println(nomes);
		
		System.out.println(nomes.contains("Cleyton"));
		System.out.println(nomes.indexOf("Cleyton"));
		
		nomes.clear();
		System.out.println(nomes);
	
		
		
	}

}
