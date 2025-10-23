package DSA.statement;

public class leep_year {
    public static void main(String[]args)
    {
        int a = 2021;
        if((a % 4 == 0 && a%100 !=0)||(a%400 ==0))
        //if((a%4 == 0 && a%100 !=0 )||(a %400 ==0))
        {
System.out.println("leap");
        }
        else {System.out.println("non-leap year");}


    }}
