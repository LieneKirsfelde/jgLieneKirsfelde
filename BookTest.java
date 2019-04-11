package lv.javaguru.lesson5;

public class BookTest {

    public static void main(String[] args) {
        testBookEquals();
        testBookToString();
    }

    private static void testBookEquals() {
        Book book = new Book("Rainis", "Dzeja", 150);
        Book secondBook = new Book("Aspazija", "Dzeja", 150);
        boolean expectedEquals = true;

        System.out.println("Book comparison");
        boolean actual = book.equals(secondBook);

        if (actual) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
            System.out.println("Expected: " + book);
            System.out.println("Actual: " + secondBook);
        }
    }

    private static void testBookToString() {
        Book book = new Book("Rainis", "Dzeja", 150);
        Book secondBook = new Book("Aspazija", "Dzeja", 150);
        String expected = "Book {author: Rainis, title: Dzeja, page count: 150}";

        if (expected.equals(book.toString())) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + secondBook);
        }

    }
}
