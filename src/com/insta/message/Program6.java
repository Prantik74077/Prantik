package com.insta.message;
import com.whatsapp.message.Program4;     //import
public class Program6 extends Program4    //inheritance
{
public static void main(String[]args)
{
	Program6 ref=new Program6();          //object of subclass -All three are criterias for protected access specifier accessed from another diff package
	System.out.println("Program6.a="+ref.a);
	ref.end();
}
}
