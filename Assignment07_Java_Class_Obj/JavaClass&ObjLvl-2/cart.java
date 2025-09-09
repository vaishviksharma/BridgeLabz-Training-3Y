import java.util.ArrayList;

class CartItem {
    String itemName;
    int price;
    int quantity;

    CartItem(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    int getCost() {
        return price * quantity;
    }
}

class Cart {
    private ArrayList<CartItem> items = new ArrayList<>();

    public void addItem(CartItem item) {
        items.add(item);
        System.out.println(item.itemName + " added to cart.");
    }

    public void removeItem(String itemName) {
        boolean removed = false;

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).itemName.equalsIgnoreCase(itemName)) {
                items.remove(i);
                System.out.println(itemName + " removed from cart.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println(itemName + " not found in cart.");
        }
    }

    public void displayTotalCost() {
        int total = 0;
        for (CartItem item : items) {
            total += item.getCost();
        }
        System.out.println("Total Cost: " + total);
    }
}