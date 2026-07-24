public class Strings {
    public static void main(String[] args){
        // char name = "Sahil";
        // System.out.println(name); //Incompatible type error
        String name = "Sahil";
        System.out.println(name);
        //Another way of defining a string
        String objectString = new String("Sahil"); 

        System.out.println(objectString);
        // The string literal method keeps the memory location same if the value of the string is same
        // this doesnot apply to the objec stringg method, it always generate a memory location for every string.
        String name2 = "Sahil";
        String objectString2 = new String("Sahil");
        System.out.println(name==name2); //true
        System.out.println(objectString==objectString2); // false

        // Formatted string
        String formattedString = String.format("My name is %s and I belong to %s. I am %d years old.", "Sahil", "India", 19);
        System.out.println(formattedString);
        //format specifier
        // %s => string
        // %d => integer
        // %f => Double
        // %b => boolean
        // %c => Char

        // String methods
        System.out.println(formattedString.length());
        System.out.println(name==objectString); // false b'coz it compares if bothe the objects are same or not. 
        System.out.println(name.equals(objectString)); // true b'coz it only checks if the value is same.
        System.out.println("abc".equalsIgnoreCase("ABC")); // True b'coz it ignores the cases of both the strings.
        
        // Replace method
        String sentence = "The sky is blue";
        System.out.println(sentence.replace("blue","red"));

        // Contains method
        System.out.println(sentence.contains("sky")); // true b'coz sky is there in the sentence
        
    }
}
