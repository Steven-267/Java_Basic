package User;

import operations.*;

import java.util.Scanner;

/**
 * @author Steven
 * @ClassName NormalUser.java
 * @Description 普通用户
 * @createTime 2023-05-09 11:12
 **/
public class NormalUser extends User {
    public NormalUser(String name){
        super(name);
        this.ioPerations = new IOPeration[] {
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()

        };
    }
    public int menu(){
        System.out.println("***************************************");
        String name = getName();
        System.out.println("hello "+name+"欢迎来到图书小练习");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("***************************************");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}