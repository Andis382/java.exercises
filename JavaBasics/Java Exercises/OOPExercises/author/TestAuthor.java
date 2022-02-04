public class TestAuthor {

    public static void main(String[] args) throws Exception {
        try {

            //Making three new objects of type Author
            Author a = new Author("Andis", "andisramja@gmail.com", 'm');
            Author b = new Author("Jonida", "jonidashtegu@gmail.com", 'f');
    
            //Description of each object
            System.out.println(a.toString());
            System.out.println(b.toString());
    
            //Making two new objects of type Book
            Book book1 = new Book("firstBook", a, 50);
            Book book2 = new Book("secondBook", b, 40, 3);
    
            //Description for each object
            System.out.println(book1.toString());
            System.out.println(book2.toString());
        } catch (Exception e) {
            System.out.println("Exited with exception: " + e.getMessage());
        }
    }
}