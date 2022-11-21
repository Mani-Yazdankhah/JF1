public class SpecialEditionBook extends Book {
    private int discount;

    public SpecialEditionBook(int number, String name, int price, int discount) {
        super(number, name, price);
        this.discount = discount;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Discount percentage: " + this.discount);
    }
}
