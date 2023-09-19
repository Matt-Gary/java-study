public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    int getQuantity() {
        return quantity;
    }
    @Override
    public String toString() {
        return "Item{" +
                "nome='" + name +
                ", preco=" + price +
                ", quant=" + quantity +
                '}';
    }
}