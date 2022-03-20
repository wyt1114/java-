/*
* 减肥计划if版
*/
import java.util.Scanner;
public class HeiMatest3_1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个星期数：");
        int week = sc.nextInt();
        if(week==1)
        {
            System.out.println("去跑步");
        }
        else  if(week==2)
        {
            System.out.println("去游泳");
        }
        else  if(week==3)
        {
            System.out.println("去慢走");
        }
        else  if(week==4)
        {
            System.out.println("去骑动感单车");
        }  else  if(week==5)
        {
            System.out.println("去拳击");
        }
        else  if(week==6)
        {
            System.out.println("去爬山");
        }
        else  if(week==7)
        {
            System.out.println("去好好吃一顿");
        }
        else if(week<1||week>7)
        {
            System.out.println("输入的星期数有误");
        }
    }

}
