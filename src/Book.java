public class Book {
    protected int bno;
    protected String bname;
    protected int price;

    public Book(int number, String name, int price) {
        this.bno = number;
        this.bname = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Book number: " + this.bno);
        System.out.println("Book name: " + this.bname);
        System.out.println("Price: " + this.price);
    }
}
