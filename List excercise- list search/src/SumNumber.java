import java.util.ArrayList;
import java.util.List;

public class SumNumber {
    private List<Integer> numberList;


    public SumNumber() {
        this.numberList = new ArrayList<>();
    }

    public void addNumber(int number) {
        this.numberList.add(number);
    }

    public int calculateTotal() {
        int total = 0;
        for (Integer number : numberList) {
            total += number;
        }
        return total;
    }

    public int findHighestNumber() {
        int highestNumber = Integer.MIN_VALUE;
        if (!numberList.isEmpty()) {
            for (Integer number : numberList) {
                if (number >= highestNumber) {
                    highestNumber = number;
                }
            }
            return highestNumber;
        } else {
            throw new RuntimeException("A list is empty");
        }
    }
    
    public int findLowestNumber() {
        int lowestNumber = Integer.MAX_VALUE;
        if (!numberList.isEmpty()) {
            for (Integer number : numberList) {
                if (number <= lowestNumber) {
                    lowestNumber = number;
                }
            }
            return lowestNumber;
        } else {
            throw new RuntimeException("A list is empty");
        }
    }

    public void showNumbers() {
        if (!numberList.isEmpty()) {
            System.out.println(this.numberList);
        }
    }
    public static void main(String[] args) throws Exception {
        SumNumber numbers = new SumNumber();
        numbers.addNumber(1);
        numbers.addNumber(5);
        numbers.addNumber(7);
        numbers.addNumber(4);
        numbers.addNumber(2);
        numbers.showNumbers();
        System.out.println("Sum of numbers: " + numbers.calculateTotal());
        System.out.println("Highest number: " + numbers.findHighestNumber());
        System.out.println("Lowest number: " + numbers.findLowestNumber());
    }

}
