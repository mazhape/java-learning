In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).

Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque classes. For example, deque can be declared as:

Deque deque = new LinkedList<>();
or
Deque deque = new ArrayDeque<>();
You can find more details about Deque here.

In this problem, you are given  integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size .

Note: Time limit is  second for this problem.

Input Format

The first line of input contains two integers  and : representing the total number of integers and the size of the subarray, respectively. The next line contains  space separated integers.

Constraints




The numbers in the array will range between .

Output Format

Print the maximum number of unique integers among all possible contiguous subarrays of size .


    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();

            for (int i = 0; i < n; i++) {
       a         int num = in.nextInt();
               
            }
        }
    }


To solve this problem, you can use a Deque (ArrayDeque) to keep track of the elements in the current subarray of size m. As you slide the window through the array, you can maintain a HashSet to keep track of unique elements within the current subarray.

    import java.util.*;
    public class test {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);

            if (deque.size() == m + 1) {
                int removed = deque.remove();
                if (!deque.contains(removed)) {
                    set.remove(removed);
                }
            }

            maxUnique = Math.max(maxUnique, set.size());

            if (maxUnique == m) {
                break; // Optimization: if we reach m unique integers, further sliding window won't increase the count
            }
        }

        System.out.println(maxUnique);
    }
    }






