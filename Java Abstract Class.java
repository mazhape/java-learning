A Java abstract class is a class that can't be instantiated. That means you cannot create new instances of an abstract class. It works as a base for subclasses. You should learn about Java Inheritance before attempting this challenge.

Following is an example of abstract class:

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
If you try to create an instance of this class like the following line you will get an error:

Book new_novel=new Book(); 
You have to create another class that extends the abstract class. Then you can create an instance of the new class.

Notice that setTitle method is abstract too and has no body. That means you must implement the body of that method in the child class.

In the editor, we have provided the abstract Book class and a Main class. In the Main class, we created an instance of a class called MyBook. Your task is to write just the MyBook class.

Your class mustn't be public.

import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
	
}

//Write MyBook class hereååå

public class Main{
	
	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}


Abstract classes in Java are classes that cannot be instantiated, meaning you cannot create an object of an abstract class. They are meant to be extended by other classes. Abstract classes can have both abstract and non-abstract methods.

Here are some key points about abstract classes:

1. **Abstract Methods**: These are methods that are declared in an abstract class without an implementation. They are declared using the `abstract` keyword and are meant to be overridden in a subclass. If a class has even one abstract method, the class must be declared abstract.

   ```java
   abstract void setTitle(String s);
   ```

2. **Non-Abstract Methods**: Abstract classes can also have non-abstract methods (methods with an implementation). These methods can be used directly by subclasses or can be overridden.

   ```java
   String getTitle(){
       return title;
   }
   ```

3. **Abstract Class Extension**: To use an abstract class, you must create a subclass that extends the abstract class. In the subclass, you provide implementations for the abstract methods of the superclass.

   ```java
   class MyBook extends Book {
       @Override
       void setTitle(String s) {
           this.title = s;
       }
   }
   ```

4. **Instantiation**: You cannot create an instance of an abstract class. You can, however, create an instance of a subclass of an abstract class.

   ```java
   MyBook new_novel=new MyBook();
   ```

5. **Constructors**: Abstract classes can have constructors, and those constructors can be called when a subclass instance is created.

6. **Fields**: Abstract classes can have fields, which can be inherited by subclasses.

Abstract classes are a powerful feature in Java and other object-oriented languages. They allow you to define a common interface for subclasses, ensuring that all subclasses have a certain set of methods. They also allow you to provide some default behavior that subclasses can use or override.


import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
	
}

//Write MyBook  class here

class MyBook extends Book {
    // Implement the setTitle method
    @Override
    void setTitle(String s) {
        this.title = s;
    }
}
public class Main{
	
	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}