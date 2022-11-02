package Keyword;

public class FinalVariableEx {
 final int a = 20;
 final float pi = 3.14f;
  
 void change()
 {
	 a = 40; //compile time error 
	 final int i;
	 pi = 6.14f;
	 for(i = 0 ; i<5 ; i++)
	 {
		 System.out.println("value of i is  : " +i);
	 }
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		FinalVariableEx fv = new FinalVariableEx();
		fv.change();
	}

}
