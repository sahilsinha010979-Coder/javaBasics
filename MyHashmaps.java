import java.util.HashMap;

public class MyHashmaps{
    public static void main(String[] args){
        HashMap<String, Integer>  examScore = new HashMap<String, Integer>(); // Creating a HashMap object called examScore.


        examScore.put("Maths", 75); // Adding key-value pairs to the HashMap using the put() method.
        examScore.put("English", 95);
        examScore.put("Science", 90);
        System.out.println(examScore.toString()); // HashMap does not maintain any order of its elements.
        // The order may change when you add or remove elements from the HashMap.

        // Accessing the value associated with a specific key using the get() method.
        System.out.println("Maths score: " + examScore.get("Maths")); // Output: Maths score: 75

        // getOrDefault method
        System.out.println("History score: " + examScore.getOrDefault("History", 0)); // Output: History score: 0

        // putIfAbsent method
        examScore.putIfAbsent("Math" , 75); // checks if the key exists or not. if it does then no change in the value of the key.
        // If the key doesnot exist, then the key value pair is created.

        // replace method
        examScore.replace("English", 89); // replaces the value of the key with the new value.
        // if key not found, then no change is made.
        
        // remove method
        examScore.remove("Science"); // removes the key-value pair from the HashMap.

        // containsKey method
        System.out.println(examScore.containsKey("Maths")); // checks if the key exists in the HashMap or not. returns true or false.   

        // containsValue method
        System.out.println(examScore.containsValue(75)); // checks if the value exists in
        // the HashMap or not. returns true or false.

        // empty method
        System.out.println(examScore.isEmpty()); // checks if the HashMap is empty or not. returns true or false.

        // size method
        System.out.println(examScore.size()); // returns the number of key-value pairs in the HashMap.

        // traversing a HashMap
        for (String key : examScore.keySet()) {
            Integer value = examScore.get(key);
            System.out.println(key + ": " + value);
        }

        examScore.forEach((subject, score) -> {
            examScore.replace("subject", score + 5); // adds 5 to the value of each key-value pair in the HashMap.  
        });

        // clear method
        examScore.clear(); // removes all the key-value pairs from the HashMap.
        

    }
}