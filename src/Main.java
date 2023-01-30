import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    // Pure Function
    static List<String> fruits = new ArrayList<String>();

    public static List<String> remove(List<String> fruits){

        List<String> newFruits = new ArrayList<String>();

        for (String fruit : fruits) {
            if (!newFruits.contains(fruit)) {
                newFruits.add(fruit);
            }
        }
        return newFruits;
    }

    //Recursion
    // Euclid's algorithm. The greatest common divisor is that largest integer that divides two numbers without leaving residue.
    public static int greatestCommonDivisor(int a, int b) {
        if (b == 0) return a;
        return greatestCommonDivisor(b, a % b);
    }


    // Prime Numbers
    static List<Integer> numbers = new ArrayList<Integer>();
    static List<Integer> primeNumbers = new ArrayList<Integer>();

    static Function<Integer, Integer> convertItem = i -> i + 1;
    static Predicate<Integer> getPairs = i -> i % 2 == 0;



    public static void main(String[] args) {

        // Pure Function
        fruits.add("Apple");
        fruits.add("Coco");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");

        remove(fruits);

        // Prime Numbers
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        for (int number : numbers) {
            if (getPairs.test(number)) {
                int index = numbers.indexOf(number);
                int newNumber = convertItem.apply(number);
                numbers.set(index, newNumber);

            }
        }
        System.out.println(numbers);

    }

}