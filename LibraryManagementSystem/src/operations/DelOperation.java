package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @author Steven
 * @ClassName DelOperation.java
 * @Description 删除图书
 * @createTime 2023-05-09 11:55
 **/
public class DelOperation implements IOPeration{
    public void work(BookList bookList){
        //删除图书
        //System.out.println("delete book");//测试使用
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要删除的书名");
        String name = scanner.nextLine();
        int Index  = -1;
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            if(name.equals(book.getName())){
             Index = i;
             break;
            }
        }
        if(Index == -1){
            System.out.println("没有找到你想要删除的书");
            return;
        }
        //book[Index] = boo[Index +1];
        for (int i = Index; i < currentSize -1; i++) {
            Book book = bookList.getPos(i + 1);
            bookList.setBooks(book,i);
        }

        //  每次删除，都要置空
        bookList.setBooks(null,currentSize-1);

        bookList.setUsedSize(currentSize-1);


    }

}
