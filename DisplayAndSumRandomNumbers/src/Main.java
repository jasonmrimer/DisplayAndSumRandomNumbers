//CMIS141_Homework2
//Homework 2
//Programmer: Jason M. Rimer
//Date: 25FEB2012
//The purpose of this program is to display 100 random numbers in a 10 x 10 matrix and calculate the sum
//	those random numbers.

public class Main {//startClass

	public static void main(String[] args) {//startMethod
		//1. PRINT INTRODUCTION
		
		System.out.print("This program calculates and displays 100 random numbers that\n" + 
		"are bettween 100 and 999 inclusive (i.e. three digits).\n" +
		"Then, this program calculates the sum of those 100 random numbers.\n");
		
		//2. LOOP 100 times generating random integer and adding it to the total sum
		//		displaying each number in a 10 x 10 message pane
		
		int randomNumber = 0;//Initialize random number
		int i = 0;//Initialize counter i
		int sum = 0;//INitiliaze sum
		Object [][]matrix = new Object [10][10];//Initialize matrix 
		 
		do 
		{//startDoLoop
			randomNumber = (int) (Math.random() * 1000);//Get Random Number < 1000
			if (randomNumber < 100)//Break if randomNumber is not 3 digits
				continue;
			
			//Write to matrix 10 x 10 
			if (i >= 0 && i < 10)//First row 
				matrix[0][i] = randomNumber;
			else if (i > 9 && i < 20)//Second Row
				matrix[1][i - 10] = randomNumber;
			else if (i > 19 && i < 30)//Third Row
				matrix[2][i - 20] = randomNumber;
			else if (i > 29 && i < 40)//Fourth Row
				matrix[3][i - 30] = randomNumber;
			else if (i > 39 && i < 50)//Fifth Row
				matrix[4][i - 40] = randomNumber;
			else if (i > 49 && i < 60)//Sixth Row
				matrix[5][i - 50] = randomNumber;
			else if (i > 59 && i < 70)//Seventh Row
				matrix[6][i - 60] = randomNumber;
			else if (i > 69 && i < 80)//Eighth Row
				matrix[7][i - 70] = randomNumber;
			else if (i > 79 && i < 90)//Ninth Row
				matrix[8][i - 80] = randomNumber;
			else if (i > 89 && i < 100)//Tenth Row
				matrix[9][i - 90] = randomNumber;
			sum += randomNumber;//Calculate sum
			i++;//Increase counter
		}//endDoLoop
		while (i < 100);
		
		//3. PRINT NUMBERS AND SUM
		
		System.out.println();
		System.out.print("Random Numbers:");
		System.out.println();
		
		//Print matrix
		for (int row = 0 ; row < matrix.length ; row++)
		{
			for (int column = 0 ; column < matrix[row].length ; column++)
			{
				System.out.print(matrix[row][column] + " | ");
			}
			System.out.println();
		}
		
		//Print Sum
		System.out.println();
		System.out.print("The total sum is: " + sum);

	}//endMethod

}//endClass
