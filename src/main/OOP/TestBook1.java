public class TestBook1 {
    public static void main(String[] args) {
        Author author1 = new Author("Author1", "author1@example.com", 'm');
        Author author2 = new Author("Author2", "author2@example.com", 'f');
        System.out.println(author1);
        System.out.println(author2);

        Author[] authors = {author1, author2};

        Book1 book = new Book1("Java for dummy", authors, 19.95, 99);
        System.out.println(book);

        book.setPrice(29.95);
        book.setQty(28);
        System.out.println("Name is: " + book.getName());
        System.out.println("Price is: " + book.getPrice());
        System.out.println("Qty is: " + book.getQty());
        System.out.println("Names of authors is: " + book.getAuthorNames());
    }
}
