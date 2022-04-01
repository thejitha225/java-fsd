package com.simplilearn.demo;

import java.io.FileWriter;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileReader;

public class FileHandling {
	
	public static void main(String[] args) {
		char ch;
		try {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("enter a word to write w to read rand to append a");
				ch=sc.next().charAt(0);
				switch(ch) {
				case 'w':
				{
						System.out.println("enter a text to be written toa file");
						sc.nextLine();
						String text=sc.nextLine();
						FileWriter fwriter=new
						FileWriter("C:\\readwriteappend\\filehandling");
						fwriter.write(text);
						fwriter.close();
						System.out.println("File with data given has beenwritten successfully");
						break;
				}
				
				case 'r':
				{
						FileReader fr=new
						FileReader("C:\\readwriteappend\\filehandling");
						int i;
						while((i=fr.read())!=-1)
						System.out.println((char)i);
						fr.close();
						break;
				}
				
				case 'a':
				{
						PrintWriter pw=new
						PrintWriter("C:\\readwriteappend\\filehandling");
						pw.append('s');
						System.out.println("File after append");
						pw.flush();
						break;
				}
				
				default:
					System.out.println("Invalid character");
					break;
				}
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
	
	 