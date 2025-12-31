package com.fls;

import java.io.BufferedReader;
import java.io.FileReader;

public class CharRead {

	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("src/chartest.txt");
				BufferedReader bw = new BufferedReader(fr))
		{
			System.out.println(bw.readLine());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
