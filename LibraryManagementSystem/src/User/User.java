package User;

import book.BookList;
import operations.IOPeration;

/**
 * @author Steven
 * @ClassName User.java
 * @Description 用户父类
 * @createTime 2023-05-09 11:10
 **/
public abstract class User {
   private String name;
   protected IOPeration[] ioPerations;//只是定义数据 但是没有初始化 内存都没有分配

    public User(String name){
        this.name = name;
    }
    public void doOperation(int choice, BookList booklist){
        ioPerations[choice].work(booklist);
    }

    public String getName() {
        return name;
    }

    public abstract int menu();
}
