import java.lang.*;

class Start
{
	public static void main(String[] args) 

	{

	stk s= new stk(10);

	s.empty();
	s.pop();

	s.push(10);
	s.push(20);
	s.push(30);
	s.push(40);
	s.push(50);
	s.push(60);
	s.print();

	s.pop();
	s.pop();
	s.pop();
	s.print();
	s.empty();


	}
}
