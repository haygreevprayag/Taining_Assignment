//2)	Write a java program to read a file line by line and store it into a variable.
package com.oops.project;
import java.io.*;  
public class Two  {
	public static void main(String args[])  {  
		try {  
				File file=new File("Demo.txt");    
				FileReader fr=new FileReader(file);  
				BufferedReader br=new BufferedReader(fr);  
				String line;  
				while((line=br.readLine())!=null)  {  
						sb.append(line);      
						sb.append("\n");      
				}  
				fr.close();    
				System.out.println("Contents of File: "); 
				System.out.println(sb.toString());  
			}  
		catch(IOException e)  {  
			e.printStackTrace();  
		}  
	}  
}  

