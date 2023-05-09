package operations;

import book.BookList;

/**
 * @author Steven
 * @ClassName Exit.java
 * @Description 退出
 * @createTime 2023-05-09 12:01
 **/
public class ExitOperation implements IOPeration{
    public void work(BookList bookList){
        //退出系统
        System.out.println("Exit system");//测试专用
        System.exit(0);
    }
}
