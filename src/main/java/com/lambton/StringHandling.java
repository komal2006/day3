package com.lambton;


import java.util.StringTokenizer;

public class StringHandling
{
    public static void main(String[] args)
{
   String s1;
    s1="hello";
    String s2="hello";
    String s3=s1;
    String s4=new String( "hello");


   /* if(s1==s2)
    {
        System.out.println("s1==s2");
    }
    else

    {
        System.out.println("s1 !=s2");
    }

    if(s3==s2)
    {
        System.out.println("s3==s2");
    }
    else

    {
        System.out.println("s3 !=s2");
    }
    if(s1==s4)
    {
        System.out.println("s1==s4");
    }
    else

    {
        System.out.println("s1 !=s4");
    }*/
   /*System.out.println(s1);
   s1=s1.toLowerCase();
    System.out.println(s1);
   s1= s1.toUpperCase();
    System.out.println(s1);*/

 String collegeName =" Lambton college in toronto";
    s1=s1.concat("  world");
    System.out.println(s1);

    int s6;
    s6=collegeName.length();
    System.out.println(s6);

    s6=collegeName.indexOf(collegeName);
    System.out.println(s6);

    s6=collegeName.indexOf("Toronto");
    System.out.println(s6);

    collegeName=collegeName.toLowerCase();
    System.out.println(collegeName);

    collegeName=collegeName.toUpperCase();
    System.out.println(collegeName);

    boolean b= collegeName.contains("college");
    System.out.println(b);
    /*int a[]={1,2,3,4,5};
    int d[]= new int[]{6,7,8,9};
    int e[]=new int[10];
    e[0]=100;
    e[1]=200;
    e[2]=300;*/
   char c[] = collegeName.toCharArray();
   /*for(int i=0;i< c.length; i++)
   {
       System.out.println(c[i]);
   }*/
    char rev[] =new char[c.length];
    int count=0;
    for(int i=c.length-1;i>=0; i--)
    {
       rev[count++]=c[i];
    }
    String reverseString = new String(rev);
    System.out.println("Reverse String =" +reverseString);

    String[]strings=collegeName.split("");
    StringBuffer stringBuffer= new StringBuffer();
   for(int i=0;i< strings.length;i++)
   {
      String rev1= strings[i];
      if(i%2==1)
      {
          rev1 =reverse(rev1);
      }
       stringBuffer.append(rev1);
       stringBuffer.append("");
   }
    System.out.println("args=" + stringBuffer.toString());
   StringTokenizer stringTokenizer = new StringTokenizer(collegeName,  " ");
   while(stringTokenizer.hasMoreElements())
   {
       System.out.println("TOKEN : " + stringTokenizer.nextToken());
   }
}
 static String reverse(String str)
 {
     if(str==null)
     {
         return new String();
     }
     char c[]=str.toCharArray();
     char rev[] = new char[c.length];
     int count=0;
     for(int i=c.length-1;i>=0; i--)
     {
         rev[count++]=c[i];
     }
     return new String(rev);
 }

}
