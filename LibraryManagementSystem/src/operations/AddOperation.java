package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @author Steven
 * @ClassName AddOperation.java
 * @Description 添加图书
 * @createTime 2023-05-09 11:45
 **/
public class AddOperation implements IOPeration{
    public void work(BookList bookList){
        //增加图书
        System.out.println("Add book");//测试使用
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你要新增的书名");
        String name = scanner.nextLine();

        System.out.println("请输入你要新增的作者");
        String author = scanner.nextLine();

        System.out.println("请输入你要新增的价格");
        int price = scanner.nextInt();

        scanner.nextLine();

        System.out.println("请输入这本书的类型");
        String type = scanner.nextLine();

        Book book = new Book(name, author, price, type);

        //1.获取当前可以存放书的位置
        int currentSize = bookList.getUsedSize();
        //2.把书放入指定位置
        bookList.setBooks(book,currentSize);
        //3.书的有效个数加1
        bookList.setUsedSize(currentSize+1);

        //System.out.println("断点");
    }
}
