package tuhina.dey;

import java.util.Scanner;

public class Stack {
	public static void main(String args[])
	{
		int[] stackFrame= new int[5];
		int top=-1;
		int item;
		while(true)
		{
			System.out.println("1 Push");
			System.out.println("2 Pop");
			System.out.println("3 Traverse");
			System.out.println("4 Exit");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice--");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				if(top==stackFrame.length-1)
				{
					System.out.println("Stack is full");
				}
				else {
					System.out.println("Push item into stack");
					Scanner sc1 = new Scanner(System.in);
					int value=sc1.nextInt();
					item=value;
					 stackFrame[++top]=item;
				}
				break;
			case 2:
				if(top==-1)
				{
					System.out.println("Stack is empty");
				}
				else {
				item=stackFrame[top];
				top=top-1;
				}
				break;
				
			case 3:
				System.out.println("Stack");
				for(int i=top;i>=0;i--)
				{
					System.out.println("-------");
					System.out.println(stackFrame[i]);
					System.out.println("-------");
				}
				break;
			case 4:
				System.exit(1);
				
		}
	}
	}
}


