package sample;

import java.io.*;


public class ArrayReverse {
	
	public static void main(String[] args) throws IOException{
		
		//Can use Scanner rather than BufferedReader and InputStreamReader - ease of use in this case
		Scanner input = new Scanner(System.in);
		
		int[] num = new int[10];
		
		//Populating array
		for (int i = 0; i < num.length; i++){
			System.out.println("Enter number (integer): ");
			num[i] = input.nextInt(); //nextInt - checks if entered number is Integer or int already
		}
		
		input.close(); //closing stream
		
		//Use Arrays class features to reverse an array
		int[] copyNum = num.clone(); //Creating copy of num array - don't want to modify original
		Arrays.reverse(copyNum); //Reversing copy of num
		
		for (int i : copyNum){
			System.out.println(i + " ");
		}
	
	/**
	InputStreamReader inStream = new InputStreamReader(System.in);
	BufferedReader stdin = new BufferedReader(inStream);
	
	String inData;
	int num1;
	
	int [] num = new int[10];
	
	for(int i = 0 ; i < 10; i ++) 
	{
		
		int r = i+1;
		
		System.out.println("Enter Number " + r + " :");
		
		inData = stdin.readLine();
		num1 = Integer.parseInt(inData);
		
		num[i] = num1;
		
		
	}
	
	System.out.println( num[9]+ " "+ num[8]+ " " +num[7]+ " " +num[6]+ " "+num[5]+ " "+num[4]+ " "+num[3]+ " "+num[2]+ " "+num[1]+ " "+num[0]+ " ");
	
	*//
	
		
	
		
		
		
		
	}
	

}
