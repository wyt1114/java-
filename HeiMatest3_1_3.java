/*
 * 减肥计划随机数版
 */
import java.util.Random;

public class HeiMatest3_1_3
{
    public static void main(String[] args)
    {
        Random r=new Random();
        int week=r.nextInt(7);
        week=week+1;
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
