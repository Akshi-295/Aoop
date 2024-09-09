package demo;
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

        Member member1 = new Member("Alice", 1);
        Member member2 = new Member("Bob", 2);

        BorrowingManager borrowingManager = new BorrowingManager();
        borrowingManager.borrowBook(member1, book1);
        borrowingManager.borrowBook(member2, book2);

        System.out.println(member1);
        System.out.println(member2);

        borrowingManager.returnBook(member1, book1);
        System.out.println(member1);
    }
}
