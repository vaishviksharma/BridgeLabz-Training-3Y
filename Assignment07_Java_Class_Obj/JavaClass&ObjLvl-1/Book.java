class Book{
    String title;
    String author;
    int price;

    Book(String title, String author, int pricve){
        this.title= title;
        this.author= author;
        this.price= price;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book book = new Book("George Orwell", "Animal Farm", 250);
        book.displayInfo();
    }
}