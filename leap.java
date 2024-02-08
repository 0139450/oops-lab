import java.util.Scanner;
class leap{
    public static void main(String args[])
    {
        int year;
        Scanner input=new Scanner(System.in);
        System.out.println("enetr any year");
        year=input.nextInt();
        if(year%4==0 & year%100!=0 ^ year%400==0)
        {
            System.out.println("the year " +year+ " is leap year");
        }
        else{
            System.out.println("the year "  +year+ " is  not leap year");
        }



    }
}
