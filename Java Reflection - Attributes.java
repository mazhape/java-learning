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

Class is used to get the Student class object. getDeclaredMethods is used to get all methods of the Student class. The method names are added to an ArrayList, which is then sorted in alphabetical order using Collections.sort. The sorted method names are printed to the console.


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
        // Get the Student class object
        Class student = Student.class;
        // Get all methods of the Student class
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        // Add each method name to the list
        for(Method method : methods){
            methodList.add(method.getName());
        }
        // Sort the list in alphabetical order
        Collections.sort(methodList);
        // Print the method names
        for(String name: methodList){
            System.out.println(name);
        }
    }

}