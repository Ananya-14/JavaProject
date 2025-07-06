package com.ananya.firstproject;

import java.io.*;

public class multiplicationRunner {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(reader.readLine());

		multiplicationTable obj= new multiplicationTable();
		
        obj.multiply(n);
	}

}
