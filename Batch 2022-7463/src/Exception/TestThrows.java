package Exception;

class InvalidMarksException extends Exception
{
	/*InvalidMarksException(String str)
	{
		super(str);
	}*/
	
	InvalidMarksException()
	{
		System.out.println("Invalid Marks!!!!!");
		
	}

}

class Student
{
	int sid;
	int smarks;
	String sname;

	Student(int s,String sn, int sm)
	{
		sid=s;
		sname=sn;
		smarks=sm;
	}

	void yourMarks() throws InvalidMarksException
	{
		try{
			System.out.println("Roll No.: "+sid);
			System.out.println("Name    : "+sname);

			if(smarks<0 || smarks>100)	
			{
				throw new InvalidMarksException();
			}
			else
			System.out.println("Mark    : "+smarks);

		}catch(InvalidMarksException e)
		{
			e.printStackTrace();
	//System.out.println("Invalid Marks !!! Please enter marks between 0 to 100");			
		}

	}
}


class TestThrows
{
	public static void main(String[] args) throws InvalidMarksException
	{
		Student s1=new Student(1,"Sam Kam",90);
		s1.yourMarks();

		System.out.println();

		Student s2=new Student(2,"Kim shaw",-85);
		s2.yourMarks();
	}
}

