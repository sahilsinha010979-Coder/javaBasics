import java.util.ArrayList;
import java.util.Comparator;

public class MyArrayList {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        System.out.println(numbers);
        // .get method
        System.out.println(numbers.get(2)); // takes an index as the argument and return the value on that index.
        // .remove method
        numbers.remove(1); // removes the element at the specified index.
        // removing the element by passing the values.
        numbers.remove(Integer.valueOf(3)); // finds 3 and removes it from the ArrayList.

        //.clear method
        numbers.clear(); // removes all the elements from the ArrayList.
        System.out.println(numbers);

        ArrayList<Integer> numbers2 = new  ArrayList<Integer>();
        for(int i=1;i<=5;i++){
            numbers2.add(i);
        }
        
        
        // replacing an element of the ArrayList
        //.set method
        // first argument is the index of the element to be replaces and second one is the value to which it will be replaces\d.
        numbers2.set(2, Integer.valueOf(30));
        System.out.println(numbers2); //[1, 2, 30, 4, 5]

        // Sorting an ArrayList
        // .sort method which actually takes a comaparator as an argument.
        // We have to import the comparator class
        numbers2.sort(Comparator.naturalOrder()); // sorts the element in their natural ascending order.
        System.out.println(numbers2);
        numbers2.sort(Comparator.reverseOrder()); // sorts the elements in their natural descending order.

        System.out.println(numbers2.size()); // gives the length of the Array
        System.out.println(numbers2.contains(Integer.valueOf(30))); // checks if the array contains the given value or not. returns true or false.
        System.out.println(numbers2.isEmpty());// checks if the array is empty or not.

        // traversing an ArrayList 
        numbers2.forEach(number -> {
            System.out.println(number);
        });
    }
}
