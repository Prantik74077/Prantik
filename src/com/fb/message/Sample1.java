package com.fb.message;

class Sample1               
{
	 protected void start()       //or void start() or public void start() 
	 {
		 System.out.println("executing start method");
	 }
}
class Sample2 extends Sample1
{
	 public void start()
	 {
		 System.out.println("executing start method");
	 }
}

/*while Overriding the method of super class in sub class we can increase the
visibility of the overridden method but we cannot reduce the visibility if we use access specifiers. */