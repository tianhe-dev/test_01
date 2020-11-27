import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ddd {


   public  int   pr(){
       Scanner scan = new Scanner(System.in);
       int i;
       String str=scan.nextLine();
       char[] ar=str.toCharArray();

       for  (i=0; i<str.length(); ++i){

             System.out.println(i);
             System.out.println(ar[i]);


       }
       while (i!=0) {

       }
        return  i;

   }

    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("刘备");    //索引为0
        names.add("关羽");    //索引为1
        names.add("张飞");    //索引为2
        names.add("刘备");    //索引为3
        names.add("张飞");    //索引为4
        System.out.println(names.indexOf("刘备"));
        System.out.println(names.lastIndexOf("刘备"));
        System.out.println(names.indexOf("张飞"));
        System.out.println(names.lastIndexOf("张飞"));

        //根据元素索引位置进行的判断
        if (names.indexOf("刘备")==0) {
            System.out.println("刘备在这里");
        }else if (names.lastIndexOf("刘备")==3) {
            System.out.println("刘备在那里");
        }else {
            System.out.println("刘备到底在哪里？");
        }
    }
}
