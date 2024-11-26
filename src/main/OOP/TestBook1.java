public class TestBook1 {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);   // Sách toString() của tác giả

        Book1 dummyBook = new Book1("Java for dummy", ahTeck, 19.95, 99);   // Hàm tạo của Sách kiểm tra
        System.out.println(dummyBook);   // toString() của Sách kiểm tra

        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("tên là: " + dummyBook.getName());
        System.out.println("giá là: " + dummyBook.getPrice());
        System.out.println("số lượng là: " + dummyBook.getQty());
        System.out.println("Tác giả là: " + dummyBook.getAuthor());   // Author's toString()
        System.out.println("Tên tác giả là: " + dummyBook.getAuthor().getName());
        System.out.println("Email của tác giả là: " + dummyBook.getAuthor().getEmail()); // Sử dụng một thể hiện ẩn danh của Author để xây dựng một thể hiện Book
        Book1 anotherBook = new Book1("more Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);   // toString()
    }
}
