
package com.mycompany.part8_02_nicknames;

import java.util.HashMap;
import java.util.Scanner;

public class Templates {
public static void main(String[]args) {
        Scanner lectura= new Scanner(System.in);
 HashMap <String,String> names = new HashMap<>();
 names.put("mattew", "matt");
 names.put("michael", "mix");
 names.put("arthur", "artie");
    System.out.println(names.get("mattew"));    
        
        
    }
    
}
