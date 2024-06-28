Java annotation can be used to define the metadata of a Java class or class element. We can use Java annotation at the compile time to instruct the compiler about the build process. Annotation is also used at runtime to get insight into the properties of class elements.

Java annotation can be added to an element in the following way:

@Entity
Class DemoClass{

}
We can also set a value to the annotation member. For example:

@Entity(EntityName="DemoClass")
Class DemoClass{

}
In Java, there are several built-in annotations. You can also define your own annotations in the following way:

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
   String userRole() default "GUEST";
}
Here, we define an annotation , where  is the only member in that custom annotation. The  takes only  type values, and the default is "GUEST". If we do not define the value for this annotation member, then it takes the default. By using @Target, we can specify where our annotation can be used. For example, the  annotation can only be used with the method in a class. @Retention defines whether the annotation is available at runtime. To learn more about Java annotation, you can read the tutorial and oracle docs.

Take a look at the following code segment:

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
    String userRole() default "GUEST";
}

class FamilyMember {

    public void seniorMember(int budget, int moneySpend) {
        System.out.println("Senior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }

    public void juniorUser(int budget, int moneySpend) {
        System.out.println("Junior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String role = in.next();
            int spend = in.nextInt();
            try {
                Class annotatedClass = FamilyMember.class;
                Method[] methods = annotatedClass.getMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(FamilyBudget.class)) {
                        FamilyBudget family = method
                                .getAnnotation(FamilyBudget.class);
                        String userRole = family.userRole();
                        int budgetLimit = family.budgetLimit();
                        if (userRole.equals(role)) {
                            if(spend<=budgetLimit){
                                method.invoke(FamilyMember.class.newInstance(),
                                        budgetLimit, spend);
                            }else{
                                System.out.println("Budget Limit Over");
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            testCases--;
        }
    }
}
Here, we partially define an annotation,  and a class, . In this problem, we give the user role and the amount of money that a user spends as inputs. Based on the user role, you have to call the appropriate method in the  class. If the amount of money spent is over the budget limit for that user role, it prints Budget Limit Over.

Your task is to complete the  annotation and the  class so that the  class works perfectly with the defined constraints.

Note: You must complete the  incomplete lines in the editor. You are not allowed to change, delete or modify any other lines. To restore the original code, click on the top-left button on the editor and create a new buffer.

Input Format

The first line of input contains an integer  representing the total number of test cases. Each test case contains a string and an integer separated by a space on a single line in the following format:

UserRole MoneySpend
Constraints




Name contains only lowercase English letters.

Output Format

Based on the user role and budget outputs, output the contents of the certain method. If the amount of money spent is over the budget limit, then output Budget Limit Over.

Sample Input



import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
	String userRole() default "GUEST";
	~~Complete the interface~~
}

class FamilyMember {
	~~Complete this line~~
	public void seniorMember(int budget, int moneySpend) {
		System.out.println("Senior Member");
		System.out.println("Spend: " + moneySpend);
		System.out.println("Budget Left: " + (budget - moneySpend));
	}

	~~Complete this line~~
	public void juniorUser(int budget, int moneySpend) {
		System.out.println("Junior Member");
		System.out.println("Spend: " + moneySpend);
		System.out.println("Budget Left: " + (budget - moneySpend));
	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String role = in.next();
			int spend = in.nextInt();
			try {
				Class annotatedClass = FamilyMember.class;
				Method[] methods = annotatedClass.getMethods();
				for (Method method : methods) {
					if (method.isAnnotationPresent(FamilyBudget.class)) {
						FamilyBudget family = method
								.getAnnotation(FamilyBudget.class);
						String userRole = family.userRole();
						int budgetLimit = ~~Complete this line~~;
						if (userRole.equals(role)) {
							if(~~Complete this line~~){
								method.invoke(FamilyMember.class.newInstance(),
										budgetLimit, spend);
							}else{
								System.out.println("Budget Limit Over");
							}
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			testCases--;
		}
	}
}

Explanation:
Annotation Definition:

The FamilyBudget annotation is defined with @Target(ElementType.METHOD) indicating it can only be applied to methods.
It has two members: userRole (default is "GUEST") and budgetLimit (default is 0).
Annotation Usage:

In the FamilyMember class, the seniorMember method is annotated with @FamilyBudget(userRole = "SENIOR", budgetLimit = 100).
The juniorUser method is annotated with @FamilyBudget(userRole = "JUNIOR", budgetLimit = 50).
Solution Class:

It reads the input and processes each test case.
It checks for the FamilyBudget annotation on each method.
It retrieves the userRole and budgetLimit from the annotation.
If the userRole matches the given role and the spend is within the budget limit, it invokes the corresponding method.
If the spend exceeds the budget limit, it prints "Budget Limit Over".
This solution ensures the correct methods are invoked based on the user s role and the spending limit.




import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
	String userRole() default "GUEST";
	int budgetLimit();
}

class FamilyMember {
@FamilyBudget(userRole="SENIOR", budgetLimit=100)
	public void seniorMember(int budget, int moneySpend) {
		System.out.println("Senior Member");
		System.out.println("Spend: " + moneySpend);
		System.out.println("Budget Left: " + (budget - moneySpend));
	}

	@FamilyBudget(userRole="JUNIOR", budgetLimit=50)
	public void juniorUser(int budget, int moneySpend) {
		System.out.println("Junior Member");
		System.out.println("Spend: " + moneySpend);
		System.out.println("Budget Left: " + (budget - moneySpend));
	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String role = in.next();
			int spend = in.nextInt();
			try {
				Class annotatedClass = FamilyMember.class;
				Method[] methods = annotatedClass.getMethods();
				for (Method method : methods) {
					if (method.isAnnotationPresent(FamilyBudget.class)) {
						FamilyBudget family = method
								.getAnnotation(FamilyBudget.class);
						String userRole = family.userRole();
						int budgetLimit = family.budgetLimit();
						if (userRole.equals(role)) {
							if(spend <= budgetLimit){
								method.invoke(FamilyMember.class.newInstance(),
										budgetLimit, spend);
							}else{
								System.out.println("Budget Limit Over");
							}
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			testCases--;
		}
	}
}



