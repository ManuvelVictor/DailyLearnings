package Day_2;

public class DataTypes {
    public static void main(String[] args) {
        /* Data type specify the specific size and values that can be stored in the Variable
           There are two types of data types in Java
           1.Primitive Data Types
           2.Non-Primitive Data Types

           1.Primitive Data Types:
             In Java primitive data types are the building blocks of data manipulation.
             These are the most basic data types available in Java language.

             There are 8 types of Primitive data types:
                                          Default Value              Default Size
             * boolean data type          : true                     : 1 bit
             * byte data type             : 'u\0000'                 : 2 bytes
             * char data type             : 0                        : 1 byte
             * short data type            : 0                        : 2 bytes
             * int data type              : 0                        : 4 bytes
             * long data type             : 0l/0L                    : 8 bytes
             * float data type            : 0.0f/0.0F                : 4 bytes
             * double data type           : 0.0d/0.0D                : 8 bytes
         */

        boolean one = false;
        // you can also put the value as true in the false
        byte b = 127;
        // byte can only store values from -128 to +127, 0 is included
        short s = 32767;
        // like byte short can only store values form -32768 to +32767 0 is included
        int i = 2147483647;
        // int can store value from -2147483648 to +2147483647 0 is included
        long l =  9223372036854775807l;
        // long can store value from -9223372036854775808 to 9223372036854775807 0 is included
        float f = 234.5f;
        // float can store unlimited numbers with floating point. float is recommended to use over double if memory is a concern
        double d = 22.22;
        // double can also store unlimited number with floating point without a last variable added in the value
        char ch = 'a';
        // The char data type is a single 16-bit Unicode character. Its value-range lies between '\u0000' (or 0) to '\uffff'
        // The char data type is used to store characters.
    }
}
