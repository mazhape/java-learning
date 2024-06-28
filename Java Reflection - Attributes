JAVA reflection is a very powerful tool to inspect the attributes of a class in runtime. For example, we can retrieve the list of public fields of a class using getDeclaredMethods().

In this problem, you will be given a class Solution in the editor. You have to fill in the incompleted lines so that it prints all the methods of another class called Student in alphabetical order. We will append your code with the Student class before running it. The Student class looks like this:

class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
    ......
    ......
    some more methods
    ......
}
You have to print all the methods of the student class in alphabetical order like this:

anothermethod
getName
setEmail
setId
......
......
some more methods
......
There is no sample input/output for this problem. If you press "Run Code", it will compile it, but it won't show any outputs.

Hint: See the oracle docs for more details about JAVA Reflection Methods and Fields


    import java.lang.reflect.*;
    import java.util.*;

    class Student{
        private String name;
        private String id;
        private String email;

        public String getName() {
            return name;
        }
        public String getId() {
            return id;
        }
        public String getEmail() {
            return email;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setId(String id) {
            this.id = id;
        }
        public void setEmail(String email) {
            this.email = email;
        }
    }

    class Solution {

        public static void main(String[] args){
            Class student = ~~Complete this line~~;
            Method[] methods = ~~Complete this line~~;

            ArrayList<String> methodList = new ArrayList<>();
            for(~~Complete this line~~){
                methodList.add(~~Complete this line~~);
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }

    }


Explanation of the filled lines:
Class student = ~~~Complete this line~~~;

java
Copy code
Class<Student> student = Student.class;
This gets the Class object associated with the Student class.
Method[] methods = ~~~Complete this line~~~;

java
Copy code
Method[] methods = student.getDeclaredMethods();
This retrieves an array of Method objects reflecting all the methods declared by the Student class.
for (~~~Complete this line~~~):

java
Copy code
for (Method method : methods) {
This iterates over each Method object in the methods array.
methodList.add(~~~Complete this line~~~);

java
Copy code
methodList.add(method.getName());
This adds the name of each method to the methodList.
Steps to Run and Test:
Create the Student class with methods including getName, setId, setEmail, anothermethod, and potentially more methods.

Compile and run the Solution class. The Solution class will use reflection to get the method names of the Student class, sort them, and print them in alphabetical order.



public class Solution {

        public static void main(String[] args){
             Class<Student> student = Student.class; // Get the Class object for Student
        Method[] methods = student.getDeclaredMethods(); // Get all declared methods of the class

        ArrayList<String> methodList = new ArrayList<>();
        for (Method method : methods) {
            methodList.add(method.getName()); // Add the method names to the list
        }
        Collections.sort(methodList); // Sort the list of method names
        for (String name : methodList) {
            System.out.println(name); // Print the sorted method names
        }
        }

    }