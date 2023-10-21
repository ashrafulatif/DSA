import java.lang.*;

class stk
{
	//static  final int size=1000;
	private int stack[]; //=new int[size];
	private int top;
	private int size;

	public stk(int size)
	{
		this.size=size;
		top=-1;
		stack=new int[size];
	}

	public boolean empty()
	{
		if(top==-1)
		{
			System.out.println("The stack is empty");
			return true;
		}
		else
		{
			System.out.println("The stack is not empty");
			return false;
		}
	}

	public void push(int e)
		{
			if(top==(size-1))
			{
				System.out.println(" the stack is full");
			}
			else
			{
				stack[++top]=e;
				//top++;
				System.out.println("pushed "+e);
			}
		}
	
	public void pop()
	{
		if(empty())
		{
			System.out.println("stack is underflow");
		} 
		else
		{
			top--;
		}
	}

	public void print()
	{
		if(empty())
		{
			System.out.println("the stack is empty");
		}
		else
		{ 
			System.out.println("----------------------");
			for(int i=top;i>-1;i--)
			{
				System.out.println(" "+stack[i]); 
			}
		}
	}
	public static void main(String[] args) {
		
		stk s= new stk(3);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.print();
	}


	
}