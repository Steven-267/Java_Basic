import User.*;

import book.BookList;

import java.util.Scanner;

/**
 * @author Steven
 * @ClassName Main.java
 * @Description 主类函数
 * @createTime 2023-05-09 13:56
 **/
public class Main {

    public static User Login(){
        System.out.println("请输入你的姓名");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("请输入你的身份：1 -》管理员，0-》普通用户");
        int choice = scanner.nextInt();
        if(choice == 1){
            return new AdminUser(userName);
        }else{
            return new NormalUser(userName);
        }
    }
    public static void main(String[] args) {
        //0.准备数据-三本书的数据
        BookList bookList = new BookList();
        //1.登录（使用到了向上转型）
        User user = Login();
        while (true) {
            int choice = user.menu();
            user.doOperation(choice, bookList);
        }
    }
}
