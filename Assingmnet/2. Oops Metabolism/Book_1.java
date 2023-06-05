public class Book_1 {
    
    int book_id;
    String title,author;

    Book_1()
    {
        System.out.println("Defualt Constructor:");

    }

    Book_1(int b1,String t1,String a1)
    {
        System.out.println("Parameterized Constructor:");
        book_id = b1;
        title = t1;
        author = a1;
    }

    void display()
    {
        System.out.println("Book_id = " +b1+ "Title = " +t1+ "Author = " +a1);
    }

    public static void main(String[] args) {
        
        Book_1 b = new Book_1();
        Book_1 book = new Book_1(101, "Java Programming", "Jemas goslin");
        book.display();
    }

}
