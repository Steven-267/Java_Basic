package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @author Steven
 * @ClassName FindOperation.java
 * @Description 查找图书
 * @createTime 2023-05-09 11:48
 **/
public class FindOperation implements IOPeration {
    public void work (BookList bookList){
        //查找图书
        //System.out.println("select book");//测试使用
        System.out.println("查找图书");
        System.out.println("请输入你要查找的书名");
        Scanner scanner = new Scanner(System.in);
         String name = scanner.nextLine();
         int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getPos(i);
        if(name.equals(book.getName())){
            System.out.println(book);
            return;
        }

        }
        System.out.println("未能查找到本书");
    }

}
