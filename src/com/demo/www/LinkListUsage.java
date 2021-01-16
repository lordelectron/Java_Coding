package com.demo.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkListUsage {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String args[]) throws NumberFormatException, IOException {
		Node start = null;
		Node temp = null;
		Node pos = null;
		Node x = null;
		Node y = null;
		while (true) {

			System.out.println();
			System.out.println("enter 1 for insertion from begning");
			System.out.println("enter 2 for insertion from any position");
			System.out.println("enter 3 for insertion from end");
			System.out.println("enter 4 for display");
			System.out.println("enter 5 for exiting");
			System.out.println("enter the choices");
			int k = Integer.parseInt(in.readLine());
			switch (k) {
			case 1:
				System.out.println("INSERTION FROM BEGNING");
				System.out.println("enter the number");
				int n = Integer.parseInt(in.readLine());

				if (start == null) {
					Node node1 = new Node(n);
					start = node1;
					temp = start;
					pos = start;
					x = start;
				} else {
					Node node2 = new Node(n);
					node2.next = temp;
					temp = node2;
					start = temp;
					pos = start;
				}
				break;
			case 2:
				System.out.println("INSERTION FROM THE REAR END");
				System.out.println("enter the number");
				int n1 = Integer.parseInt(in.readLine());
				if (start == null) {
					Node node1 = new Node(n1);
					start = node1;
					temp = start;
					pos = start;
				} else {
					Node node2 = new Node(n1);
					temp.next = node2;
					pos = start;
					temp = temp.next;

				}
				break;
			case 3:
				System.out.println("INSERTION FROM ANY POSITION");
				System.out.println("enter the number");
				int n2 = Integer.parseInt(in.readLine());
				System.out.println("enter the position");
				int position = Integer.parseInt(in.readLine());
				if (start == null) {
					System.out.println("there is no node in the link list");
					System.out.println("please create the nodes using options 1 or 2");
				} else {
					int count = 0;
					Node node = new Node(n2);
					if (temp.next != null)
					{
						while (x != null) 
						{
							count++;
							x = x.next;
							if (count == position) 
							{
								break;
							} 
							else 
							{
								y = x;
							}
						}
						y.next=node;
						node.next=x;
					}

				}
				break;
			case 4:
				while (temp != null) {
					System.out.print(temp.item + "->");

					temp = temp.next;

				}
				break;

			}
		}
	}
}

class Node {
	Node next;
	int item;

	public Node(int item) {
		this.item = item;
		next = null;
	}
}
