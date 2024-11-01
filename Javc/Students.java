public class Students {
    String name;
    int rollno;

    Students(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Students) {
            Students s = (Students) obj;
            if (name.equals(s.name) && rollno == s.rollno) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Students s1 = new Students("Durga", 101);
        Students s2 = new Students("Ravi", 102);
        Students s3 = new Students("Durga", 101);
        Students s4 = s1;
        System.out.println(s1.equals(s2));// false
        System.out.println(s1.equals(s3));// true
        System.out.println(s1.equals(s4));// true
        System.out.println(s1.equals("Durga"));// false
        System.out.println(s1.equals(null));// false
    }
}
// false
// true
// true
// false
// false