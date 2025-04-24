package _object;

public class EBook {
    private int bookTypeId;
    private String title;
    private String author;

    public EBook(int bookTypeId, String title, String author) {
        this.bookTypeId = bookTypeId;
        this.title = title;
        this.author = author;
    }

    // toString() 메서드 재정의
    @Override
    public String toString() {
        return "title : " + title + " author : " + bookTypeId;
    }

    // equals() 메서드 재정의
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EBook) {
            if (this.bookTypeId == ((EBook) obj).bookTypeId && this.title == ((EBook) obj).title);
            return true;
        } else {
            return false;
        }
    }


    // hashcode() 메서드 재정의
    @Override
    public int hashCode() {
        return bookTypeId;
    }

    public static void main(String[] args) {
        EBook ebook1 = new EBook(1,"가나다라","세종대왕");
        EBook ebook2 = new EBook(1,"가나다라","세종대");
        EBook ebook3 = new EBook(1,"가나다","세종대왕");
        EBook ebook4 = new EBook(1,"가나","세종");
        String str1 = new String("가나다라");

        System.out.println(ebook1);
        System.out.println(ebook2);

        boolean result1 = ebook1.equals(ebook2);
        boolean result2 = ebook1.equals(str1);
        boolean result3 = ebook1.equals(ebook3);
        boolean result4 = ebook1.equals(ebook4);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
        System.out.println("result4 : " + result4);


    }
}
