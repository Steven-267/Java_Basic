package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @author Steven
 * @ClassName ReturnOperation.java
 * @Description 归还图书
 * @createTime 2023-05-09 13:51
 **/
public class ReturnOperation implements IOPeration {
    public void work(BookList bookList){
        //归还图书
       // System.out.println("归还图书");//  测试专用
        System.out.println("请输入你要归还的书名");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            if(name.equals(book.getName())){
               book.setBorrowed(false);
                System.out.println("归还成功");
                return;
            }
        }
        System.out.println("没有找到你想归还的书");

    }
}
