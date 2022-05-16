
public class StringReverse {

	public static void main(String[] args) {
		
		String str1="";
		String str= "Ankit is a Tester"; //declare the datatype
		String str2="Ankit is a Tester";
		String str3= "!@#$%^&*()ddddqjknx?>";
		
		System.out.println(str.length());
		int num= str.length();
		
		System.out.println(str.charAt(4));// display the value which is located on nm 4 start with 0.
		System.out.println(str.indexOf('i'));//character is located at nm 4
		System.out.println(str.indexOf('i',str.indexOf('i')+1));// how many i availble in the string that dispaly
		System.out.println(str.replace('i', 'd'));// replace character
		System.out.println(str.indexOf("have"));// display this word is valid or not in the string
		System.out.println(str.equalsIgnoreCase(str2));// string comparison
		System.out.println(str.substring(0,4));//display only first four characters
	
		
		
		for(int i=str.length()-1; i>=0; i--) {
			str1= str1 + str.charAt(i);
		}
		System.out.println(str1);

	//It is thread-safe. So, multiple threads can’t access at the same time, therefore, it is slow	heap memory
		//It is mutable. We can modify string without creating an object 
	StringBuffer sf= new StringBuffer(str);
	System.out.println(sf.reverse());
	System.out.println(sf.length());
	System.out.println(sf.append("Dipali"));
	System.out.println(sf.charAt(5));
	
	
	//It is not thread-safe hence faster than String Buffer heap memory
	//it is also mutable
	StringBuilder as= new StringBuilder(str2);
	System.out.println(as.length());
	
	
	System.out.println("********************");
	//str3=str3.replaceAll([^a-z, 0-9, A-Z], "");
	
	
	
	
	
	
	}

}
/*
*/
