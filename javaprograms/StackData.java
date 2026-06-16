package Dora;

public class StackData {
	int a[]=new int[5];
	int top=-1;
public void push(int data) {
	if(top==a.length-1) {
		System.out.println("Stack overflow is occured");
	}
	else {
		top++;
		a[top]=data;
		System.out.println(a[top] +"Is added");
		
	}
}
	public void pop() {
		if(top==-1) {
			System.out.println("cannot be removed");
		}
		else {
			System.out.println(a[top] +" is removed");
			top--;
		}
	}
	public void peek() {
		if(top==-1) {
		System.out.println("cannot be seen as peek element");
		}
		else
			System.out.println(a[top]+" is a peek element");
	}
	public void display() {
		if(top==-1) {
			System.out.println("cannot be seen as display element");
			}
		else {
			for(int i=top;i>=0;i--) {
				System.out.println(a[i]);
			}
		}
	}
	
}

