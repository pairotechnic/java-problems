package StreamAPI;

import java.util.Scanner;

public class test2 {
 
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
//                String s1=sc.nextLine();
//                
//                
//                Scanner line = new Scanner( s1);
//                line=line.useDelimiter(" ");
//               
//                String language = line.next();
//                int mark = line.nextInt();;
//                
//                System.out.printf("%s%03d\n",String.format("%0$-15s", language),mark);
            	
            	String s1=sc.nextLine();
                
                
                Scanner line = new Scanner( s1);
                line=line.useDelimiter(" ");
               
                String language = line.next();
                int mark = line.nextInt();;
                
                System.out.printf("%s%03d\n",String.format("%0$-15s", language),mark);
                
            }
            System.out.println("================================");
 
    }
}
