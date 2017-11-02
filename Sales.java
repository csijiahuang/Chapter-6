
/**
 * Write a description of class Sales here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many sales employees would you like to enter? ");
        int sale = scan.nextInt();
        int[] sales = new int[sale];
        int sum, max=0, maxID=0;
        for (int i=0; i < sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
            if (sales[i]>max){
                max=sales[i];
                maxID=i;
            }
            
        }
        int min=sales[0], minID=0;
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i < sales.length; i++)
        {
            System.out.println("\t " + (i+1) + "\t\t\t" + sales[i]);
            sum += sales[i];
            if (sales[i]<min){
                min=sales[i];
                minID=i;
            }
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("Average Sales: "+ (double)sum/sales.length);
        System.out.println("\nSalesperson "+(maxID+1)+" had the highest sale with $"+
                            sales[maxID]);
        System.out.println("Salesperson "+(minID+1)+" had the lowest sale with $"+
                            sales[minID]);                    
    }
}