import java.util.Scanner;

public class StudentGradeCalculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        boolean continueCalculation = true;
        while(continueCalculation)
        {
            System.out.print("Enter the number of subjects assign to the user: ");
            int number_of_Subject = sc.nextInt();
            sc.nextLine();

            double totalMarks = 0;
            boolean invalidMarks = false;
        for(int i =1; i<=number_of_Subject; i++)
        {			
			
            System.out.print("Enter the marks obtained(Out of 100) for the subjects" +i+":");
            double marks = sc.nextDouble();
            sc.nextLine();
					if(marks > 100)
					{
						System.out.println("Error!!: invalid marks enter to the subject"+i+"marks cannot be greater than 100");
					    System.out.println("Process gets Terminated!!");
					    
                        invalidMarks = true;
                        break;
					}   
                    totalMarks += marks;
                
        }
        if(invalidMarks)
        {
            System.out.print("Do you want to continue further(yes/no):");
            String continueInput = sc.nextLine();
            if(!continueInput.equalsIgnoreCase("yes"))
            {
                continueCalculation = false;
            }
            continue;
        }
        double averagePercentage = totalMarks / (number_of_Subject*100)*100;

        char grade;
        int gradeVal = (int)averagePercentage / 10;
        
        switch(gradeVal)
        {
            case 10:
            case 9:
                    grade = 'A';
                    break;
            case 8:
                    grade = 'B';
                    break;
            case 7:
                    grade = 'C';
                    break;  
            case 6:
                    grade = 'D';
                    break;  
            default :
                    grade = 'F';
                    break;    
        }
        
        System.out.println("Total Marks Obtained:"+totalMarks);
        System.out.println("Average Percentage of Student :"+averagePercentage);
        System.out.println("Grade assign to the user :" +grade);

        sc.nextLine();
        System.out.print("Do you want to continue further(yes/no):\n");

        String continueInput = sc.nextLine();
        
        if(!continueInput.equalsIgnoreCase("yes"))
        {
            continueCalculation = false;
        }
        
    }
    sc.close();
}
}
    

    