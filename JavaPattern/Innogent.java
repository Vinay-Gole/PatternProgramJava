import java.util.ArrayList;

/**
 * Innogent Interview Question
 */
public class Innogent {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(7);
        list.add(8);
        list.add(9);

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                evenSum += list.get(i);
            } else {
                oddSum += list.get(i);
            }
        }

        int difference = evenSum - oddSum;

        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);
        System.out.println("Difference: " + difference);
    }
}
