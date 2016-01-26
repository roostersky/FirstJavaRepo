package sample;

public class Array {
	
	//Prints values stored in array to the screen
	public static void printArray(int[] anArray){
		for (int i : anArray){
			System.out.println("Value is: " + i + "\n");
			System.out.println("Testing Repository");
			System.out.println("Added new line on test repo 01/21/16");
		}
	}

	public static void main(String[] args) {
		
		//Declared new variable and assignment of values.
		int[] ramesh = {1, 2, 3, 4, 5};
		
		//Will produce the same result as the method below.
		Array.printArray(ramesh);
		
		
		for (int i = 0; i < ramesh.length; i ++) {
			
			System.out.println("value is: " + ramesh[i]+ "\n");
			System.out.println("Testing Repository");
			System.out.println("Added new line on test repo 01/21/16");
			
		}

	}

}
