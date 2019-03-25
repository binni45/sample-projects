package newproject;

import java.io.CharArrayReader;
import java.io.IOException;

class Char {
  
		    public static void main(String[] args) 
		    {
		        int i=0, j=0;
		        String obj = "abcdef";
		        int length = obj.length();
		        char c[] = new char[length];
		        obj.getChars(0, length, c, 0);
		        CharArrayReader io_1 = new CharArrayReader(c);
		        CharArrayReader io_2 = new CharArrayReader(c, 1, 4);
		    
		        try {
		            while ((i = io_1.read()) == (j = io_2.read())) {
		                System.out.print((char) i);
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }

	

}
