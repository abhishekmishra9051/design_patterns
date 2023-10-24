package singeton;

public class Demo
{
    public static  class Book{
        private static Book book;
        private Book(){}
        public static Book getBook(){
            if(book == null){
                synchronized(Book.class){
                    if(book == null){
                        book = new Book();
                    }
                }
            }
            return book;
        }
    }

    public static class Copy{
        private static Copy copy = new Copy();
        public static Copy getCopy(){
            return copy;
        }
    }
    public static void main(String[] args){
        Book book = Book.getBook();
        System.out.println(book.hashCode());
        Book book1 = Book.getBook();
        System.out.println(book1.hashCode());
        Copy copy = Copy.getCopy();
        System.out.println(copy.hashCode());
        Copy copy1 = Copy.getCopy();
        System.out.println(copy1.hashCode());
    }
}
