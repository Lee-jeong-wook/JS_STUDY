package thread;

import java.util.ArrayList;
import java.util.Arrays;

class Library{
    private ArrayList<String> shelf = new ArrayList<String>();

    public Library(){
        shelf.add("원피스1");
        shelf.add("원피스2");
        shelf.add("원피스3");
    }

    public ArrayList<String> getShelf() {
        return shelf;
    }

    public void setShelf(ArrayList<String> shelf) {
        this.shelf = shelf;
    }

    public synchronized String rentBook() throws InterruptedException{
        Thread th1 = Thread.currentThread();
        if (shelf.size() == 0) {
            System.out.println(th1.getName() + " waiting");
            wait();
            System.out.println(th1.getName() + " waiting ended");
        }
        if(shelf.size() > 0){
            String book = shelf.remove(0);
            return book;
        } else {
            return null;
        }
    }
    public synchronized void returnBook(String book) throws InterruptedException{
        Thread th1 = Thread.currentThread();

        shelf.add(book);
        notifyAll();
        System.out.println(th1.getName() +":"+book+ "반납 완료");
    }
}
class Student extends Thread{
    private String name;
    public Student(String name){
        this.name = name;
    }
    public void run() {
        try{
            String bookTitle = LibraryTest.library.rentBook();
            if(bookTitle == null){
                System.out.println("책 빌리지 못함");
                return;
            }
            sleep(5000);
            LibraryTest.library.returnBook(bookTitle);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class LibraryTest {
    public static Library library = new Library();
    public static void main(String[] args) {
        Student s1 = new Student("Lee");
        Student s2 = new Student("Kim");
        Student s3 = new Student("Choi");
        Student s4 = new Student("Park");
        Student s5 = new Student("곽");
        s1.start();
        s2.start();
        s3.start();
        s4.start();
        s5.start();


    }
}
