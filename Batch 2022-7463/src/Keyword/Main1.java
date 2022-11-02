package Keyword;

final class Company
{
      void comment(){
      System.out.println("Only Company admin can access this class!");
   }  
}  
class Intern1 extends Company
{
   public static void main(String args[]){  
      Intern1 i1= new Intern1();  
      i1.comment();  
   } 
}

