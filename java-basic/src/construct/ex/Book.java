package construct.ex;

public class Book {

    String title;
    String author;
    int page;

    Book(){
        this("","",0);
    }

    Book(String title, String author){
        // 초기화이지 객체가 또 생성되는게 아니다!!
        this(title, author,0);
    }

    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo(){
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}
