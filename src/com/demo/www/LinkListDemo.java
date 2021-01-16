package com.demo.www;


class Node1
{
	int item;
	Node1 next;
	
	public Node1(int item)
	{
		this.item=item;
		next=null;
	}
}

public class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node1 node= new Node1(1);
		Node1 start=node;
		Node1 temp=start;
		Node1 node1= new Node1(2);
		node.next=node1;
		Node1 node2= new Node1(3);
		Node1 temp2=node2;
		temp2.next=start;
		start=temp2;
		temp=start;
		while(temp!=null)
		{
			System.out.print(temp.item +"->");
			temp=temp.next;
		}

	}

}
