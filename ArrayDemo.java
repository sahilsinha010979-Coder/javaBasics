import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args){
        char vowels[] = new char[5]; // An array of length 5.
        char alphas[] = {'a','b','c','d','e'};

        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';
        System.out.println(Arrays.toString(vowels)); // [a, e, i, o, u]
        System.out.println(alphas); // abcde
        System.out.println(vowels); 
        System.out.println(alphas.length);
        // Sorting methods
        int[] numbers = {5, 3, 1, 4, 2};
        Arrays.sort(numbers); 
        System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 4, 5]
        int[] numbers2 = {5, 2, 8, 4, 9, 1};
        int startingIndex = 1;
        int endingIndex = 4;
        Arrays.sort(numbers2, startingIndex, endingIndex); // Applies sorting only from the startingIndex and endingINdex(excluded).
        System.out.println(Arrays.toString(numbers2));

        //Searching
        int foundItemIndex = Arrays.binarySearch(vowels, 'o'); // returns the index of the key 
        System.out.printf("Character 'o' found at index %d\n", foundItemIndex );
        int foundItemIndex2 = Arrays.binarySearch(vowels, startingIndex, endingIndex, 'u');// Searches the item only in the given range excluding the ending index.
        System.out.println(foundItemIndex2);
        // Returns a negative number if the searching fails.
        // filling an array
        
        // Filling an array with a specific value
        int[] numbers3 = new int[5];
        Arrays.fill(numbers3, 5);
        System.out.println(Arrays.toString(numbers3));
        Arrays.fill(numbers3, startingIndex, endingIndex, 3);
        // Fills the array with the value excluding the stating and ending index.
        System.out.println(Arrays.toString(numbers3));

        // Copying an array
        int copyOfNumbers[] = numbers;
        System.out.println(Arrays.toString(copyOfNumbers));
        // The above line does not create a new array, it just creates a new reference to the same array.
        // any changes made to the copyOfNumbers array will also affect the numbers array and vice versa.
        // To create a new array, we can use the copyOf method.
        int copyOfNumbers2[] = Arrays.copyOf(numbers, numbers.length);
        // the first argument is the name of the original array, the second is the length of the copied array.
        // the length of the copied array can be more or less than the original array.
        // If the length is more than the original array, the all the remaining values are set to zero.
        System.out.println(Arrays.toString(copyOfNumbers2));
        int copyOfNumbers3[] = Arrays.copyOfRange(numbers, startingIndex, endingIndex);
        // if the ending index is more than the length of the original array, the new array will be filled with zeros for the remaining values.
        System.out.println(Arrays.toString(copyOfNumbers3));
        // equals method
        System.out.println(Arrays.equals(numbers, copyOfNumbers2)); // true
        System.out.println(numbers == copyOfNumbers2); // false, because they are different objects in memory.
    }   
}
