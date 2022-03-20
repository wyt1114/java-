/*
 * 减肥计划switch版
 */
import java.util.Scanner;
public class HeiMatest3_1_2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入星期数为；");
        int week=sc.nextInt();
        if (week<1||week>7)
        {
            System.out.println("你输入的星期数有误，请重新输入！");
            while (true)
            {

                Scanner sc2=new Scanner(System.in);

                System.out.println("请输入重新输入的星期数为；");

                int week2=sc.nextInt();
                week=week2;
                if(week<7&&week>1)
                {
                    break;
                }
                else
                {
                    System.out.println("你输入的星期数有误，请重新输入！");
                }
                continue;
            }
        }

        switch (week)
        {
            case 1:
                System.out.println("去跑步");break;
            case 2:
                System.out.println("去游泳");break;
            case 3:
                System.out.println("去慢走");break;
            case 4:
                System.out.println("去骑动感单车");break;
            case 5:
                System.out.println("去拳击");break;
            case 6:
                System.out.println("去爬山");break;
            case 7:
                System.out.println("去好好吃一顿");break;

        }

    }
}
