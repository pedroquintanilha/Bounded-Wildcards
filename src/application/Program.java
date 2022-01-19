package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import services.ListService;



public class Program {
	
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Object> myObj = new ArrayList<>();
		List<Integer> myInt = new ArrayList<>();
		List<Double> myDoub = new ArrayList<>();
		
		System.out.print("Enter the file path: ");
		File file = new File(sc.nextLine());
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String line = br.readLine();
			
			while(line!=null) {
				String[] str = line.split(",");
				myInt.add(Integer.parseInt(str[0]));
				myDoub.add(Double.parseDouble(str[1]));
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.print("Error reading file: "+ e.getMessage());
		}
		
		ListService.copy(myDoub, myObj);
		ListService.print(myObj);
		System.out.println();
		ListService.copy(myInt, myObj);
		ListService.print(myObj);
		
		sc.close();	}

}
