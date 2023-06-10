//Narrowing Casting
//manually
//double -> float -> long -> int -> char -> short -> byte

public class TypeCastingDoubleToInteger {
    public static void main(String[] args) {

        double a = 123.56;
        int b = (int) a; // manual type casting

        System.out.println(a);
        System.out.println(b);
    }
}