package firstpackage;

public class FactorialEx {

int fact = 1;
  public void calFact(int n)
{
for(int i = 1; i<=n; i++)
{
	fact = fact * i;
	System.out.println("Factorial of   " + i + "  is :" + fact);
}
}
		
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		FactorialEx f = new FactorialEx();
		f.calFact(7);

}
}
