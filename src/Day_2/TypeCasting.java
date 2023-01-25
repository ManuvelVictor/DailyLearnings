package Day_2;

public class TypeCasting {
    public static void main(String[] args) {
        /*
        Type casting can be done in this order:
        byte -> short -> char -> int -> long -> float -> double
        Also called as Widening Casting
         */
        byte b = 12;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        /*
        If the value is higher than the initialized type this can be solved using Narrowing Casting
         */
        // for Example *byte b = 450;* this will a error because the value exceed the byte limit

        byte bi = (byte) 450;
        // bi value will be -64

        int in = (int)500.500;
        // int value will be 500



    }
}
