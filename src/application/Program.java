package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try{
			
			System.out.println("How many values ?");
			int values = scan.nextInt();
			
			PrintService ps = new PrintService<Integer>();
			
			for(int i = 0; i < values; i++) {
				ps.addValue(scan.nextInt());
			}
			
			ps.print();
			
			System.out.println("First: " + ps.first());
			
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}finally {
			scan.close();
		}

	}

}
