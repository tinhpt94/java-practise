import java.util.Arrays;

public class Book1 {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;
    public Book1(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        qty = 0;
    }

    public Book1(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return authors;
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

    @Override
    public String toString() {
        return "Book[name=" + name + "," + "{" + Arrays.toString(authors) + "}" + ",price=" + price + ",qty=" + qty + "]";
    }

    public String getAuthorNames() {
        StringBuilder authorNames = new StringBuilder();
        for (int i=0; i<authors.length; i++) {
            authorNames.append(authors[i].getName());
            if(i < authors.length-1) {
                authorNames.append(",");
            }
        }
        return authorNames.toString();
    }
}
