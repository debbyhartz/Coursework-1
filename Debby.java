import java.util.Scanner;

public class Debby{
    public static void main(String args[]){
        //Declaration and reinitialization
        int marks[] = new int[6];
        //int i;
        float total=0, average;
        Scanner deb = new Scanner(System.in);
        
        
        for(int i=0; i<6; i++) { 
           System.out.print(" Enter Marks of Courses"+(i+1)+":");
           marks[i] = deb.nextInt();
           total = total + marks[i];
        }
        deb.close();
        //Calculating average here
        
    
         System.out.println("Total " + ": " + total);
        average = total/6;
        System.out.println("Average " +": "  + average);

        System.out.println("You're in class ");

        if(average>=80)
        {
            System.out.println(" A");
        }
        else if(average>=60 && average<80)
        {
           System.out.println(" B");
        } 
        else if(average>=40 && average<60)
        {
            System.out.println(" C");
        }
        else
        {
            System.out.println(" D");
        }
    }
}