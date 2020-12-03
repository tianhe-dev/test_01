import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class testTest {


    public int oMethond(){


        int i=0;
        i++;
        return i;
    }

    public String str(){

        String str=this.getClass().getName();
        String str1=str.substring(str.lastIndexOf(".")+1,str.length());
        return str1;
    }

    public static int getDaysOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public double query(int i,int date){
        double sum=0;
           for(int j=1;j<date;j++){
               if (sum <= 100.0) {//当你花了小于等于100元
                   sum += i;
               }
               if(sum>100.0&&sum<=150.0){//当你花了大于100且小于等于150
                      sum += (i * 0.8);
                  }
               if(sum>150.0){//当你花了大于100且小于等于150
                       sum += (i * 0.5);
                }
              }
           return sum;
    }


    public static void main(String[] args) {
        testTest t=new testTest();
        System.out.println( "票价=" +t.query(6,60));

        testTest  t1= new testTest();
        t1.oMethond();
        int j=t1.oMethond();
        System.out.println(j);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n3=n1+n;
       System.out.println("和为"+n3);

        testTest T1=new testTest();
        System.out.println(T1.str());

        int i=10;
        String str=String.valueOf(i);
        System.out.println(i);
        System.out.println(str);
        System.out.println(str.getClass());
        int data[] = new int[3]; /*开辟了一个长度为3的数组*/
        int [] data1= null;
        data[0] = 10; // 第一个元素
        data[1] = 20; // 第二个元素
        data[2] = 30; // 第三个元素
        for(int x = 0; x < data.length; x++) {
            System.out.println(data[x]); //通过循环控制索引
        }
        int data2[][] = new int[][] {
                {1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        System.out.println("------: "+data2[0][1]);
        //如果在进行输出的时候一定要使用双重循环，
//        //外部的循环控制输出的行数，而内部的循环控制输出列数
//        for(int i = 0; i < data2.length; i++) {
//            for(int j = 0; j < data2[i].length; j++) {
//                System.out.print("data2[" + i + "][" + j + "]=" + data2[i][j] + "、");
//            }
            System.out.println();
        }

    }