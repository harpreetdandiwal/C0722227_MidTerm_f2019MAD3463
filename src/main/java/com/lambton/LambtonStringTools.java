package com.lambton;

public class LambtonStringTools
{
public String reverse (String h)
{
   int t1 = 0;
   char[] charString = h.toCharArray();
   char[] revString=new char[h.length()];
   for (t1=charString.length-1;t1>=0;t1--)
   {
       revString[t1++]=charString[t1];

   }
   String lastReverse;
    lastReverse =new String(revString);
    return lastReverse;
}
}
