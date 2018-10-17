package org.java.variables;

public class String_Comparision_Commands 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * String is a not only Datatype also called as class.
		 * String contains set of events to verify behavaiour
		 * of characters while we stored in String.
		 */
		
		
		/*
		 * Equals:-->
		 * 		Method verify equal comparision between two strings
		 * 		and return boolean value true/false.
		 */
		
		String Act_result="Account Created";
		String Exp_result="account created";
		
		boolean flag=Act_result.equals(Exp_result);
		System.out.println("Equal Comparision status is --> "+flag);
		
		
		/*
		 * EqualIngorecase:-->	
		 * 	 Method verify equalignorecase comparision between two
		 * 	 string and return true/false.
		 */
		boolean flag1=Act_result.equalsIgnoreCase(Exp_result);
		System.out.println("Equalingore case comparision is  --> "+flag1);
		

		/*
		 * contains:-->
		 * 	Method verify sub String available at main String. and 
		 * 	return true/false
		 */
		String Result="Accout 100 created successfull";
		boolean flag2=Result.contains("100");
		System.out.println("Sub String contains status is  --> "+flag2);
		
		
		/*
		 * length:-->
		 * 		Method get length of characters available at String
		 */
		String AccountNum="9874512457845427";
		int len=AccountNum.length();
		System.out.println("Account number in characters --> "+len);
		
		
		/*
		 * SubString:-->
		 * 		Method get subString from main String
		 */
		String sub=AccountNum.substring(12);
		System.out.println("Last 4 digit Account number is --> "+sub);
		
		String sub1=AccountNum.substring(6, 10);
		System.out.println("Account Number 4 digits --> "+sub1);
		
		
		/*
		 * trim:-->
		 * 		Method trim extra space with in String
		 */
		String Mobilenum="    9030248855   ";
		System.out.println("before trim --> "+Mobilenum.length());
		
		String Mtrim=Mobilenum.trim();
		System.out.println("After trim ---> "+Mtrim.length());
		
		
		
		
		/*
		 * isEmpty:-->
		 * 		method verify String emtpy status and return true/false
		 */
		String var="";
		String var1="Hello";
		
		System.out.println("var Empty status is  --> "+var.isEmpty());
		System.out.println("var1 Empty status is  --> "+var1.isEmpty());
		
		
	}

}
