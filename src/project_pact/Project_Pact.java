package project_pact;
import java.util.*;
public class Project_Pact {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int date,month,year,Total_Day,end_Day,end_Month=0,end_Year=0,temp1=0,temp2=0,flag=0;
        System.out.println("***Tast U want to Creat***");
        System.out.println("Please Enter Date / Year / Month");
        date = scan.nextInt();
        month = scan.nextInt();
        year = scan.nextInt();
        System.out.println("How much day You want to Complete Your task");
        Total_Day = scan.nextInt();
        System.out.println("Your starting day of Your Task : "+date+"/"+month+"/"+year);
        end_Day = Total_Day + date;
        if(end_Day>30)
        {    
            temp1 = end_Day / 30; //month
            temp2 = end_Day % 30;///day
            flag++;
        }
        if(month<=7 && flag!=0)
        {
            if((month + temp1)%2==0)
            {
                end_Month = month + temp1;
                end_Day = temp2 - 1;
            }else
            {
                end_Month = month + temp1;
                end_Day = temp2 - 1;
            }
        }else if(month>=8 && month%2==0 && flag!=0)
        {
            if(end_Day > 30 && month%2!=0)
            {
                end_Month = month + temp1;
                end_Day = temp2;
            }else if(month%2==0 && end_Day>31)
            {
                end_Month = month + temp1;
                end_Day = temp2 - 1;
            }
        }
        if(month > 12 && flag!=0)
        {
            end_Year = year+1;
        }
        end_Year = year;
        System.out.println("Finally Your End date is : "+end_Day+"/"+end_Month+"/"+end_Year);
        System.out.println("You need "+Total_Day+" day to complete Your task");
    }

}
