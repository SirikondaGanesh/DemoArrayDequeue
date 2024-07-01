//implementing a program using Array Deque using String and demonstrate methods of Array Deque
package com.collections;
//import ArrayDeque package
import java.util.ArrayDeque;
//class
public class DemoArrayDequeue {
    //main-function
	public static void main(String[] args) {
	//ArrayDeque fallows stack & queue pattern [observe clearly]  <-- understanding purpose
   //creating object for ArrayDeque 
	ArrayDeque aq=new ArrayDeque<String>();
	//adding string values using add method
    aq.add("ShriKrishna");
    aq.add("Ganesh");
    aq.add("Nithish");
    aq.add("Sudheer");
    aq.add("Chandu");
    aq.add("Shankar");
    //printing string values
    System.out.println(aq);
    //adding a new value
    aq.add("Prasad");
    //duplicate value
    aq.add("Ganesh");
    System.out.println(aq);
    //remove top element
    System.out.println("pop ="+aq.pop());
    //insert element
    aq.push("RK");
    System.out.println("push "+aq);
    //adding first & last element
    aq.addFirst("Kanna");
    aq.addLast("Mintu");
    //aq.getLast();
    System.out.println(aq);
    aq.poll();
    System.out.println(aq);
	}

}
