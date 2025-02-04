package com.wipro.java.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedandUnchecked {
	public static void main(String a[]) {
		try {
			int ans=10/0;
			System.out.println(ans);
			}
			catch(Exception e) {
				System.out.println(e.toString());
			}
	try {
		File file=new File("Wrong_Path.txt");
		FileReader filereader=new FileReader(file);
		}
		catch(IOException e){
			System.out.println(e.toString());
		}
	
	}

}
