import java.util.Arrays;

public class Array {
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
    }
}
