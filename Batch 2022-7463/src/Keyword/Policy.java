package Keyword;

class OfficeData 
{ 
    void policy()
    {
        System.out.println("There are three policies");
    }
    final void financial()
    {
        System.out.println("Offic financial data");
    }
}
class Record extends OfficeData
{
    public void mainRecord()
    {
        System.out.println("All data record of office");
    }
    @Override
    void policy()
    {
        System.out.println("Adding one more policy");
    }
    
    void financial()
    {
    	System.out.println("Office's financial data tampered by the other employees !!");
    }
}
  public class Policy
  {
    public static void main(String arg[])
    {
        Record record = new Record();
        record.mainRecord();
        record.policy();
    }
}