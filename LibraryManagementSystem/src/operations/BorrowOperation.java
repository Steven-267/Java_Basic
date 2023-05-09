package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @author Steven
 * @ClassName BorrowOperation.java
 * @Description 借阅书籍
 * @createTime 2023-05-09 13:49
 **/
public class BorrowOperation implements IOPeration{
    public void work(BookList bookList){
        //借阅书籍
        System.out.println("借阅书籍");//测试专用
        System.out.println("请输入你要借阅的书名");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            if(name.equals(book.getName())){
               if(book.isBorrowed() == true){
                   System.out.println("此书已经借阅");
                   return;
               }else{
                   book.setBorrowed(true);
                   System.out.println("借阅成功");
                   return;
               }
            }
        }
        System.out.println("未找到此书");

    }
}
