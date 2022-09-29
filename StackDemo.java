import java.util.Scanner;
class stack{
	Scanner sc=new Scanner(System.in);
	int top=-1;
	int n=10;
	int a[]=new int[n];

	void push(){
		if(top==n-1){
			System.out.println("Stack Overflow");
		}
		else{
			System.out.println("Enter Data:");
			int i=sc.nextInt();
			top=top+1;
			a[top]=i;
			System.out.println("Inserted");
		}
	}

	void pop(){
		if(top==-1){
			System.out.println("Stack Underflow");
		}
		else{
			top=top-1;
			System.out.println("Deleted");
		}
	}

	void peep(){
		int temp=0;
		System.out.println("Enter Ith Element:");
		int i=sc.nextInt();
		if(top-i+1<=0){
			System.out.println("Stack Underflow");
		}
		else{
			temp=top-i+1;
			System.out.println("Peeped!");
			System.out.println(a[temp]);
		}
	}

	void change(){
		int temp1=0;
		System.out.println("Enter Ith Element:");
		int x=sc.nextInt();
		System.out.println("Enter Changed Value:");
		int y=sc.nextInt();

		if(top-x+1<=0){
			System.out.println("Stack Underflow");
		}
		else{
			temp1=top-x+1;
			a[temp1]=y;
			System.out.println("Changed!");
			System.out.println(a[temp1]);
		}
	}

	void display(){
		System.out.println("Items are:");
		for(int j=top;j>=0;j--){
			System.out.println(a[j]);
		}
	}
}
public class StackDemo{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		stack st=new stack();
		
		while(true){
		System.out.println("Enter 1 For Push:"+" ");
		System.out.println("Enter 2 For Pop:"+" ");
		System.out.println("Enter 3 for Peep:"+" ");
		System.out.println("Enter 4 for Change:"+" ");
		System.out.println("Enter 5 For Display:"+" ");
		int ch=sc.nextInt();

			if(ch==1){
				st.push();
			}
			else if(ch==2){
				st.pop();
			}
			else if(ch==3){
				st.peep();
			}
			else if(ch==4){
				st.change();
			}
			else if(ch==5){
				st.display();
			}
		}
	}
}