public class Student {
  String name;
  int rollno;

  Student(String name, int rollno) {
    this.name = name;
    this.rollno = rollno;
  }

  public boolean equals(Object obj) {
    try {
      String name1 = this.name;
      int rollno1 = this.rollno;
      Student s = (Student) obj; // =>RE:ClassCastException
      String name2 = s.name;// => RE: NullPointerException
      int rollno2 = s.rollno;// => RE: NullPointerException

      if (name1.equals(name2) && rollno1 == rollno2) {
        return true;
      } else {
        return false;
      }

    } catch (ClassCastException e) {
      return false;
    } catch (NullPointerException e) {
      return false;
    }
  }

  public static void main(String[] args) {
    Student s1 = new Student("Durga", 101);
    Student s2 = new Student("Ravi", 102);
    Student s3 = new Student("Durga", 101);
    Student s4 = s1;
    System.out.println(s1.equals(s2));// false
    System.out.println(s1.equals(s3));// false true
    System.out.println(s1.equals(s4));// true
    System.out.println(s1.equals("Durga"));// false
    System.out.println(s1.equals(null));// false
  }
}
// false true true true
// On line :32 Exception in thread "main" java.lang.ClassCastException: class
// java.lang.String cannot be cast to class Student (java.lang.String is in
// module java.base of loader 'bootstrap'; Student is in unnamed module of
// loader com.sun.tools.javac.launcher.Main$MemoryClassLoader @12028586)
// at Student.equals(Student.java:12)
// at Student.main(Student.java:29)