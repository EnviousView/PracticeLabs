class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;


    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: $" + price + "\n");
    }
}

public class Task11 {
    public static void main(String[] args) {
        int i = 1;
        Book[] books = new Book[]{
            new Book("Java Programming", "John Smith", 2021, 39.99),
            new Book("Python Basics", "Jane Doe", 2020, 29.99),
            new Book("C++ Essentials", "Michael Johnson", 2019, 99.99)
        };
        
        for (Book b : books) {
            System.out.println("Book:" + (i++));
            b.displayInfo();
        }
    }
}
