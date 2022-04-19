import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");
//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");
        System.out.println(scottishIslands);
//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(scottishIslands.indexOf("Jura")+1, "Islay");
        System.out.println(scottishIslands);
//        4. Print out the index position of "Skye"
        System.out.println(scottishIslands.indexOf("Skye"));
//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);
//        7. Print the number of islands in your arraylist
        scottishIslands.size();
//        8. Sort the list alphabetically
        java.util.Collections.sort(scottishIslands);
//        9. Print out all the islands using a for loop
        for (String island : scottishIslands) {
            System.out.println(island);
        }

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        // adds all specified elements to the specified collection
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);
        int max = numbers.get(0);
        int min = numbers.get(0);

//        1. Print out a list of the even integers
        for (int value : numbers) {
            if (value%2 == 0) {
                System.out.println(value);
            }
        }
//        2. Print the difference between the largest and smallest value
        for (int value : numbers) {
            if (min>value) {
                min = value;
            }
        }
        for (int value : numbers) {
            if (max<value) {
                max = value;
            }
        }
        System.out.println(max-min);
//        3. Print true if the list contains a 1 next to a 1 somewhere
//        numbers.clear();
//        Collections.addAll(numbers, 1,0,2,13,5,6,1,1,0,2);
        boolean nowOne = false;

        for (int value : numbers) {
            if (nowOne && value == 1) {
                System.out.println(true);
                break;
            } else if (!nowOne && value == 1) {
                nowOne = true;
            } else {
                nowOne = false;
            }
        }
//        4. Print the sum of the numbers
        int total=0 ;

        for (int value : numbers) {
            total += value;
        }

        System.out.println(total);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count
//          HINT - You will need to track the index throughout the loop
//
//          So [7, 13, 2] would have sum of 9.

//        numbers.clear();
//        Collections.addAll(numbers, 13,13,2,5,6,7,12,13,2,0,9);

        boolean was13 = false;
        int newTotal = 0;

        for (int value : numbers) {
            if (value == 13) {
                was13 = true;
            } else if (was13) {
                was13 = false;
            } else {
                newTotal += value;
            }
        }

        System.out.println(newTotal);

    }

}
