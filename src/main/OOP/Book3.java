

public class Book3 {
    private String isbn;
    private String name;
    private Author3 author;
    private double price;
    private int qty;
    public Book3(String isbn, String name, Author3 author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        qty = 0;
    }

    public Book3(String isbn, String name, Author3 author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author3 getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public String getAuthorName() {
        StringBuilder authorNames = new StringBuilder();
        authorNames.append(author.getName());
        return authorNames.toString();
    }

    @Override
    public String toString() {
        return "Book[isbn="+isbn+",name="+name+","+author+",price="+price+",qty="+qty+"]";
    }
}
