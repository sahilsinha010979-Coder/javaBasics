public class data_types {
    public static void main(String[] args){
        //Data types in Java
        //1.integer type
        byte aSingleByte = 100; // -128 to 127
        short aSmallNumber = 20000; // -37,768 to 32,767
        int anInteger = 2147483647; // -21474783648 to 2147483647
        long aLargeNumber = 9223372036854775807L; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        //2.Decimal types
        float aDecimalNumber = 3.14f; // 32-bit floating point
        double aLargeDecimalNumber = 3.14159265358979323846; // 64-bit floating point
        //3.Character type
        char aSingleCharacter = 'A'; // 16-bit Unicode character
        //4.Boolean type
        boolean aTrueOrFalse = true; // true or false

        //Type conversion 
        //Implicit type conversion (widening)
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        //Explicit type conversion (narrowing)
        double myDouble2 = 9.78;
        int myInt2 = (int)myDouble2;
        System.out.println(myInt2);
    }
}
