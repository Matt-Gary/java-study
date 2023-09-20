import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberSorting{
    private List<Integer> numberList;

    public NumberSorting() {
        this.numberList = new ArrayList<>();
    }


    
    public void addNumber(int number) {
        numberList.add(number);
    }

    public List<Integer> sortAscending() {
        List<Integer> numbersAscending = new ArrayList<>(this.numberList);
        if (!numberList.isEmpty()) {
            Collections.sort(numbersAscending);
        } else {
            throw new RuntimeException("Empty list.");
        }
        return numbersAscending;
        
    } 

    public List<Integer> sortDescending() {
        List<Integer> numbersAscending = new ArrayList<>(this.numberList);
        if (!numberList.isEmpty()) {
            numbersAscending.sort(Collections.reverseOrder());
        } else {
            throw new RuntimeException("Empty list.");
        }
        return numbersAscending;
    }

    public void showNumbers() {
        if (!numberList.isEmpty()) {
            System.out.println(this.numberList);
        } else {
            System.out.println("Empty list.");
        }
    }
    public static void main(String[] args) {
        NumberSorting sortNumber = new NumberSorting();

        sortNumber.addNumber(2);
        sortNumber.addNumber(3);
        sortNumber.addNumber(6);
        sortNumber.addNumber(12);
        sortNumber.addNumber(4);

        sortNumber.showNumbers();
        System.out.println(sortNumber.sortAscending());
        System.out.println(sortNumber.sortDescending());
    }
}
