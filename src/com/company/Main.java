package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int i = in.nextInt();
        System.out.println(n14(i ,numberOfNumer(i ,0)));


    }


    static int numberOfNumer(int i, int count)
    {
        if (i>10)
        {
            i = i / 10;
            count++;
            return numberOfNumer(i, count);
        }
        count++;
        return count-1;
    }

    static int n14(int i, int j)
    {

        if (j != 0)
        {

            int delenie = (int) Math.pow(10, j);
            int number = (i / delenie);
            int next = (int) (i % Math.pow(10, j));
            j = j - 1;
            System.out.println(number);
            return n14(next,j);
        }
        return 0;
    }
}