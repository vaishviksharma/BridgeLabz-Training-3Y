class Item{
    String itemName;
    int itemCode;
    int price;

    Item(String itemName, int itemCode, int price) {
        this.itemName = itemName;
        this.itemCode = itemCode;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Code: " + itemCode);
        System.out.println("Price: " + price);
    }

    public int total(int quantity){
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item("Laptop", 1, 75000);
        item.displayDetails();
    }
}