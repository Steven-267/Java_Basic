package operations;

import book.Book;
import book.BookList;

/**
 * @author Steven
 * @ClassName DISplayOperation.java
 * @Description 显示图书
 * @createTime 2023-05-09 11:59
 **/
public class DisplayOperation implements IOPeration {
    public void work(BookList bookList){
        //显示图书
        int currentSize = bookList.getUsedSize();
        System.out.println("Display book");//测试专用
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            System.out.println(book);

        }

    }
}
