import java.io.*;
import java.util.Scanner;


public class Stack
{

	int[] ary;
	int top;

	//constructor
	Stack(int n)
	{
		ary = new int[n];
		top = -1;
	}

	int pop()
	{
		return ary[top--];

	}

	void push(int n)
	{
		top++;
		ary[top] = n;
	}

	boolean isEmpty()
	{
		if(top < 0)
			return true;
		else 
			return false;
	}



	public static void main(String[] argv) throws FileNotFoundException 
	{
		int intItem, counter = 0;
		Scanner inFile = new Scanner(new FileReader(argv[0])); 

		System.out.println("Reading integers from the file: \n\n");

		while(inFile.hasNext())
		{
			intItem = inFile.nextInt();
			System.out.println(intItem);	
			counter++;
		}

		inFile.close();


		Scanner inFile_1 = new Scanner(new FileReader(argv[0]));
		Stack myStack = new Stack(counter);
		int intItem_1;
		System.out.println("\n\nPushing integers to the Stack: \n\n");
		while (inFile_1.hasNext())
		{
			intItem_1 = inFile_1.nextInt();
			myStack.push(intItem_1);
			System.out.println(intItem_1);
		}

		System.out.println("\n\nPopping integers out from the Stack: \n\n");
		while (!myStack.isEmpty())             
		{
			System.out.println(myStack.pop());
		}
		inFile_1.close();


	}
}

