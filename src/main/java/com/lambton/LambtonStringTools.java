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
        // string reversed
        String lastReverse;
        lastReverse =new String(revString);
        return lastReverse;

    }
    public int binaryToDecimal(String h)
    {
        int c = Integer.parseInt(h,2);
        return c;
    }
    public void initials(String h) {
        String[] divide = h.split("\\s+");
        if (divide.length == 3) {
            System.out.println(divide[0].substring(0, 1).toUpperCase() + "." + divide[1].substring(0, 1).toUpperCase() + "." + divide[2].substring(0, 1).toUpperCase() + divide[2].substring(1).toLowerCase()); // char at index 0
        } else {
            System.out.println("null");
        }
    }
        public String replaceSubString(String c,String c1,String c2)
        {
            // functions to sort all in lowercase
            c.toLowerCase();
            c1.toLowerCase();
            c2.toLowerCase();
            c.split(" ");
            String sNew = c.replaceAll(c1,c2);
            return sNew;
        }
    }



