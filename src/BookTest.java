public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book(1, "First book", 10);
        SpecialEditionBook b2 = new SpecialEditionBook(2, "Second book", 4, 60);
        b1.display();
        b2.display();
    }
}
