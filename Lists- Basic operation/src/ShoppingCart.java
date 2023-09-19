import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> shoppingList;

    public ShoppingCart() {
        this.shoppingList = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity) {
        shoppingList.add(new Item(name, price, quantity));
    }

    public void removeItem(String name) {
        List<Item> itemToRemove = new ArrayList<>();
        for (Item i : shoppingList) {
            if (i.getName().equalsIgnoreCase(name))
            {
                itemToRemove.add(i);
            }
        }
        shoppingList.removeAll(itemToRemove);
    }
    
    public double calculateTotalValue() {
        double totalValue = 0d;
        if (!shoppingList.isEmpty()) {
            for (Item item : shoppingList) {
                double itemValue = item.getPrice() * item.getQuantity();
                totalValue += itemValue; 
            }
            return totalValue;
        } else {
            throw new RuntimeException("List is empty!");
        }
    }

    

    public void showItems() {
        System.out.println(shoppingList);
    }

    public static void main(String[] args) throws Exception {
        ShoppingCart shopCart = new ShoppingCart();
        shopCart.addItem("eggs", 2.99, 3);
        shopCart.addItem("apple", 4.20, 2);
        shopCart.addItem("banana", 5.76, 1);
        shopCart.showItems();
        shopCart.removeItem("eggs");
        shopCart.showItems();
        System.out.println("Total value= " + shopCart.calculateTotalValue());
        
    }

}
