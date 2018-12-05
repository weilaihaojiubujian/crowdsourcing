package com.Util;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 18:11 2018/12/3
 */
public class Money {



    public static double calculatebyweight(double weight)
    {

        if(weight<=5)
        {
            double price=2*weight;
            return price;
        }
        else if(weight<=10)
        {
            double price=2*5+(weight-5)*3;
            return price;
        }
        else
        {
            double price=2*5+5*3+(weight-10)*3.5;
            return price;
        }

    }

    public static double calculatebydistance(double distance)
    {

        if(distance<1)
        {
            return 2;
        }
        else if(distance<5)
        {
            double price=distance*2;
            return price;
        }
        else if(distance<=10)
        {
            double price=2.5*(distance-5)+10;
            return price;
        }
        else {
            double price=3*(distance-10)+22.5;
            return price;
        }

    }

    public static double calculatebytime(double distance)
    {

        double time=distance/10;

        double price=time*30;
        return price;

    }



}
