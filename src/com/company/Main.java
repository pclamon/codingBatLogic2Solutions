package com.company;

public class Main {

    public static void main(String[] args)
    {

    }

    public boolean makeBricks(int small, int big, int goal)
    {
        boolean fit = false;
        int bigNeeded = goal / 5;

        if (bigNeeded <= big)
        {
            if (goal % 5 <= small)
            {
                fit = true;
            }
        }
        else if (bigNeeded > big)
        {
            if(goal - big * 5 <= small)
            {
                fit = true;
            }
        }
        else
        {
            fit = false;
        }
        return fit;
    }

    public int loneSum(int a, int b, int c)
    {
        int sum;

        if (a == b && b == c)
        {
            sum = 0;
        }
        else if (b == c)
        {
            sum = a;
        }
        else if (a == c)
        {
            sum = b;
        }
        else if (a == b)
        {
            sum = c;
        }
        else
        {
            sum = a + b + c;
        }
        return sum;
    }

    public int luckySum(int a, int b, int c)
    {
        int sum;

        if (a == 13)
        {
            sum = 0;
        }
        else if (b == 13)
        {
            sum = a;
        }
        else if (c == 13)
        {
            sum = a + b;
        }
        else
        {
            sum = a + b + c;
        }
        return sum;
    }

    public int noTeenSum(int a, int b, int c)
    {
        a = fixTeen(a);
        b = fixTeen(b);
        c = fixTeen(c);

        int sum = a + b + c;

        return sum;
    }
    public int fixTeen(int n)
    {
        if ((n >= 13 && n < 15) || (n > 16 && n <= 19))
        {
            n = 0;
        }
        return n;
    }

    public int roundSum(int a, int b, int c)
    {
        a = round10(a);
        b = round10(b);
        c = round10(c);

        int sum = a + b + c;

        return sum;
    }

    public int round10(int num)
    {
        if (num % 10 >= 5)
        {
            num = num - (num % 10) + 10;
        }
        else
        {
            num = num - (num % 10);
        }
        return num;
    }

    public boolean closeFar(int a, int b, int c)
    {
        boolean close = false;
        boolean far = false;
        boolean success = false;

        if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(c - b) >= 2)
        {
            success = true;
        }
        else if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2)
        {
            success = true;
        }

        return success;
    }

    public int blackjack(int a, int b)
    {
        int blackjack = 0;

        if (a > 21)
        {
            blackjack = b;
        }
        else if (b > 21)
        {
            blackjack = a;
        }
        else if (a > b)
        {
            blackjack = a;
        }
        else if (b > a)
        {
            blackjack = b;
        }

        if (a > 21 && b > 21)
        {
            blackjack = 0;
        }

        return blackjack;
    }

    public boolean evenlySpaced(int a, int b, int c)
    {
        boolean even = false;
        int space1 = Math.abs(a - b);
        int space2 = Math.abs(b - c);
        int space3 = Math.abs(a - c);

        if (space1 == space2 && space3 == 2 * space1)
        {
            even = true;
        }
        else if (space2 == space3 && space1 == 2 * space2)
        {
            even = true;
        }
        else if (space3 == space1 && space2 == 2 * space3)
        {
            even = true;
        }

        return even;
    }

    public int makeChocolate(int small, int big, int goal)
    {
        int bigNeeded = goal / 5;

        if (big >= bigNeeded)
        {
            if (small >= goal % 5)
            {
                return goal % 5;
            }
        }
        else if (big < bigNeeded)
        {
            if (small >= goal - (big * 5))
            {
                return goal - (big * 5);
            }
        }

        return -1;
    }
}
