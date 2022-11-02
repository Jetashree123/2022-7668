package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx3 {
	
	public static void main(String[] args) {
		 
        Map<String, Integer> tel_dir_map = new HashMap<String, Integer>();

        tel_dir_map.put("Mike", 4567891);

        tel_dir_map.put("Nina", 1424541);

        tel_dir_map.put("Danial", 45678977);

        tel_dir_map.put("Usman", 14712314);

        System.out.println("The Map before remove method:");

        System.out.print("\t" + tel_dir_map);

        System.out.print("\n");

        //User input for the key to be removed from Map

        System.out.println("Enter a Key from: (Mike, Nina, Danial, Usman) ");

                  Scanner scanner = new Scanner(System.in);

                  String Str_name = scanner.nextLine();

                  tel_dir_map.remove(Str_name);

                        System.out.println("The Map after remove method:");

                        System.out.print("\t" + tel_dir_map);

     }
}
