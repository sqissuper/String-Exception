import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import org.w3c.dom.ls.LSOutput;
import sun.security.util.Password;

import java.util.Arrays;
import java.util.Scanner;

class UserException extends Exception{
    public UserException(String message) {
        super(message);
    }
}
class PasswordException extends Exception{
    public PasswordException(String message) {
        super(message);
    }
}
public class Main3 {

    private static String userName = "admin";
    private static String password = "123456";

    private static void login1(String userName, String password) {
        if (!Main3.userName.equals(userName)) {
            try {
                throw new UserException("用户名错误！");
            } catch (UserException e) {
                e.printStackTrace();
                return;
            }
        }
        if (!Main3.password.equals(password)) {
            try {
                throw  new PasswordException("密码错误！");
            } catch (PasswordException e) {
                e.printStackTrace();
                return;
            }
        }
        System.out.println("登陆成功");
    }

    private static void login(String userName, String password) throws UserException,PasswordException {
        if (!Main3.userName.equals(userName)) {
            throw new UserException("用户名错误");
        }
        if (!Main3.password.equals(password)) {
            throw new PasswordException("密码错误");
        }
        System.out.println("登陆成功");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userName = sc.next();
        String passWord = sc.next();


        login1(userName,passWord);

        try{
            login(userName,passWord);
        } catch (UserException ue){
            ue.printStackTrace();
        } catch (PasswordException pe) {
            pe.printStackTrace();
        }

        //方式一
//    String str1 = "hello";
//
//    //方式二
//    String str2 = new String("hello");
//
//    //方式三
//    char[] c = {'h','e','l','l','0'};
//    String str3 = new String(c);
//        String str1 = "hello";
//        String str2 = str1;
//        System.out.println(str1);
//        System.out.println(str2);
//        str1 = "word";
//        System.out.println(str1);
//        System.out.println(str2);
//        String str1 = "hello";
//        String str2 = "hello";
//        System.out.println(str1 == str2);
//        char[] c = {'a','b','c','d','e'};
//        String str = new String(c);
//        System.out.println(str.charAt(3));
//        String str = "abcde";
//        System.out.println();

//        String str = "abcde";
//        for (int i = 0; i <str.length() ; i++) {
//            System.out.print(str.charAt(i) + " ");
//
//        }
//        char[] c = str.toCharArray();
//        for (int i = 0; i < c.length; i++) {
//            System.out.print(c[i] + " ");
//        }
//        System.out.println(Arrays.toString(c));

//        String str1 = "hello" ;
//        String str2 = "HELLO" ;
//        System.out.println(str1.equals(str2)); //区分大小写比较
//        System.out.println(str1.equalsIgnoreCase(str2)); //不区分大小写比较

//        String str1 = "hello World";
//        String str2 = "hello";
//        System.out.println(str1.compareTo(str2));

//        byte[] bytes= {65, 66, 67, 68, 69};
//        String str = new String(bytes,1,3);
//        System.out.println(str);

//        String str = "abcde";
//        byte[] bytes = str.getBytes();
//        System.out.println(Arrays.toString(bytes));

//        String str1 = "helloWorld";
//        String str2 = "hello";
//        String str3 = "hlod";
//        System.out.println(str1.contains(str2));
//        System.out.println(str1.contains(str3));
//        System.out.println(str1.contains("World"));

//        String str = "helloWorld";
//        int ret = str.indexOf("h");
//        int ret1 = str.indexOf("o");
//        int ret2 = str.indexOf("a");
//        System.out.println(ret);
//        System.out.println(ret1);
//        System.out.println(ret2);

//        String str = "hello world";
//        String str1 = "llo";
//        char ch = 'w';
//        int ret = str.indexOf(str1,1);
//        int ret1 = str.indexOf(ch,4);
//        System.out.println(ret);
//        System.out.println(ret1);

//        String str = "hello world";
//        String str1 = "w";
//        char ch = 'd';
//        System.out.println(str.lastIndexOf(str1));
//        System.out.println(str.lastIndexOf(ch));

//        String str = "hello world good world";
//        String[] ret = str.split("l",2);
//        String[] ret1 = str.split(" ",3);
//        System.out.println(Arrays.toString(ret));
//        System.out.println(Arrays.toString(ret1));
//        String str1 = "good";
//        System.out.println(str.replaceFirst(str,str1));
//        System.out.println(str.replaceFirst("hel","goo"));
////        System.out.println(str.replaceAll(str,str1));
//        System.out.println(str.);


//        String str = "helloGoodWorld";
//        System.out.println(str.substring(5));//指定位置截取到结尾
//        System.out.println(str.substring(3,8));//截取部分内容

//        String str = " hello world ";
//        System.out.println("[" + str + "]");
//        System.out.println("[" + str.trim() + "]");

//        String str1 = "HELlo";
//        String str2 = "woRLd";
//        System.out.println(str1.toUpperCase());//小写转大写
//        System.out.println(str2.toLowerCase());//大写转小写

//        String str = new String("hello world");
//        System.out.println(str.intern());

//        String str1 = "hello";
//        String str2 = "world";
//        System.out.println(str1.concat(str2));

//        int[] arr = {1, 2, 3};
//        try {
//            System.out.println("before");
//            arr = null;
//            System.out.println(arr[100]);
//            System.out.println("after");
//        } catch (ArrayIndexOutOfBoundsException  | NullPointerException e) {
//            System.out.println("越界异常");
//            System.out.println("空指针异常");
//            e.printStackTrace();
//        }
//        System.out.println("try after");
//        try {
//            System.out.println("before");
//            fun();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//        }
//        System.out.println("try after");

    }




//    public static void fun() {
//        int[] arr = {1,2,3,4};
//        System.out.println(arr[5]);
//    }
}
