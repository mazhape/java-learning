public class SwitchCaseExercise {
    public static void main(String[] args){

        byte number = 100;
        
        switch (number) {
          case '7':
            System.out.println("A");
            break;
           
           case 100:
             System.out.println("B");
             break;
             
           case 200:
             System.out.println("C");
             break;
        }
   }
 
}
// B.java:16: error: incompatible types: possible lossy conversion from int to byte
 //         case 200:
 //1 error
 //error: compilation failed