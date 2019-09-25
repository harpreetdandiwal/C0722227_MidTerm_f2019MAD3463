package com.lambton;

public class LambtonStringTools
{
    public String reverse (String h)
    {
        int t1 = 0;
        char[] charString = h.toCharArray();
        char[] revString=new char[h.length()];
        for (int l=charString.length-1;l>=0;l--)
        {
            revString[t1++]=charString[l];

        }
        String lastReverse;
        lastReverse =new String(revString);
        return lastReverse;

    }
}
