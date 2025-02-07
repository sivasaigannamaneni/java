package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(9,99,999);
		List<Integer> stream = list.stream().collect(Collectors.toList());
		System.out.println(stream);
	}

}
