package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandlingEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			File fObj = new File("D:/JavaFile.txt");
			FileInputStream Obj = null;
			try{
				
			Obj = new FileInputStream(fObj);
			while (Obj.read()!=-1)
			{
			System.out.println(Obj.read());
			}
			}
			catch (FileNotFoundException e){
			e.printStackTrace();
			}
			catch (IOException e){
			e.printStackTrace();
			}
	}

}
