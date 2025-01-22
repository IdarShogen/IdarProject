import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Idar {
    public static void main(String[] args)throws Exception {
        Scanner con = new Scanner(System.in);
        System.out.println("Введите количество книг которые будут содержаться в библиотеке");
        int j = con.nextInt();
        con.nextLine();
        Library library  = new Library();
        System.out.println("Введите Назвние, Автора и Уникальный номер книги");
        for(int i = 0; i < j; i++) {
            System.out.println(i + 1 + " книга:");
            String name  = con.nextLine();
            String au = con.nextLine();
            String number = con.nextLine();
            library.addbook(name, au, Integer.parseInt(number));
        }

        System.out.println("Мы добавили книги в библиотеку. Теперь для удаления какой-то книги введите ее индекс.");
        library.removebook(con.nextInt() - 1);
        Thread.sleep(500);
        System.out.println("Теперь введите индекс книги которой вы хотите ести.");
        Thread.sleep(300);
        library.getBookIdx(con.nextInt() - 1);
        Thread.sleep(1000);
        System.out.println("Cписок книг которые вы добавили в библиотеку.");
        Thread.sleep(500);
        library.listAllBooks();
    }
}
class Book{
    private String title;
    private String autor;
    private int isbn;

    public Book(String title, String autor, int isbn){
        setTitle(title);
        setAutor(autor);
        setIsbn(isbn);
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAutor(){
        return autor;
    }
    public void  setAutor(String autor){
        this.autor = autor;
    }
    public int getIsbn(){
        return isbn;
    }
    public void setIsbn(int isbn){
        this.isbn = isbn;
    }
    public String toString(){
        return "Название: " + title + "\nАвтор: " + autor + "\nУникальный номер: " + isbn + "\n";
    }
}
class Library{
    ArrayList<Book> s = new ArrayList<>();
    public static int size = 0;

    public void addbook(String title, String autor, int isbn){
        s.add(new Book(title, autor, isbn));
        size ++;
    }

    public void removebook(int idx){
        if(idx >= 0 && idx < s.size()){
            s.remove(idx);
        }else{
            System.out.println("Указанный индекс выходит за рамки библиотеки.");
        }
    }

    public void getBookIdx(int idx){
        if(idx >= 0 && idx < s.size()){
            System.out.println(s.get(idx));
        }else{
            System.out.println("Указанный индекс выходит за рамки библиотеки.");
        }

    }

    public void listAllBooks(){
        Iterator<Book> iterator = s.iterator();
        while(true) {
            System.out.println(iterator.next());
        }
    }
}