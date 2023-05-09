package book;

/**
 * @author Steven
 * @ClassName BookList.java
 * @Description 书架
 * @createTime 2023-05-09 11:17
 **/
public class BookList {
     public Book[] books = new Book[10];
     public int usedSize;//存储当前书的个数

    /**
     *事先通过构造方法 初始化的时候 给数组里面预存三本书 usedSize= 3;
     */
    public BookList(){
          books[0] =new Book("三国演义","罗贯中",89,"novel");
          books[1] = new Book("西游记","吴承恩",78,"novel");
          books[2] = new Book("红楼梦","曹雪芹",49,"nobel");
          this.usedSize = 3;
      }
      //这里应该去写一些操作这个数组的方法 但是我们这里不这么做 换一种做法 通过接口的方式实现对数组的CURD

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
    public Book getPos(int pos){
        return books[pos];
    }

    public void setBooks(Book book,int pos){
        books[pos]=book;
    }

}
