import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;


public class Project_Rianne_Ronquillo
{
   public static void main(String[] args) throws IOException
   {
      try 
      {
         File file = new File("PolicyInformation.txt");
            
         if(!file.exists())
         {
            System.out.println("Unable to open file.");
            System.exit(0);
         }
      
         Scanner inputFile = new Scanner(file);//"open"
      
         String policyNumber, providerName, policyHolderFirstName, 
               policyHolderLastName, policyHolderSmokingStatus;
         int policyHolderAge;
         double policyHolderHeight, policyHolderWeight;
         int totalSmokers = 0, totalNonSmokers = 0;
      
         ArrayList<Policy> policies = new ArrayList<Policy>();
      
         while (inputFile.hasNext())
         {
            policyNumber = inputFile.nextLine();
            providerName = inputFile.nextLine();
            policyHolderFirstName = inputFile.nextLine();
            policyHolderLastName = inputFile.nextLine();
            policyHolderAge = inputFile.nextInt();
            inputFile.nextLine();
            policyHolderSmokingStatus = inputFile.nextLine();
            policyHolderHeight = inputFile.nextDouble();
            policyHolderWeight = inputFile.nextDouble();
         
            if(inputFile.hasNext())
            {
               inputFile.nextLine();//clear the newline
               inputFile.nextLine();//skip the blank line in the file
            }
         
            PolicyHolder holder = new PolicyHolder(policyHolderFirstName, policyHolderLastName, policyHolderAge,
                                                   policyHolderSmokingStatus, policyHolderHeight, policyHolderWeight);
                                                   
            Policy insurance = new Policy(policyNumber, providerName, holder);
         
            policies.add(insurance); //add policy objects to ArrayList
         }//close while loop
      
         inputFile.close();//close the file
      
         for(int i = 0; i < policies.size(); i++)
         {
            //System.out.println("Policy Number: " + policies.get(i).getPolicyNumber());
            //System.out.println("Provider Name: " + policies.get(i).getProviderName());
            //System.out.println("Policyholder's First Name: " + policies.get(i).getPolicyHolderFirstName());
            //System.out.println("Policyholder's Last Name: " + policies.get(i).getPolicyHolderLastName());
            //System.out.println("Policyholder's Age: " + policies.get(i).getPolicyHolderAge());
            //System.out.println("Policyholder's Smoking Status: " + policies.get(i).getPolicyHolderSmokingStatus());
            //System.out.println("Policyholder's Height: " + policies.get(i).getPolicyHolderHeight() + " inches");
            //System.out.println("Policyholder's Weight: " + policies.get(i).getPolicyHolderWeight() + " pounds");
            //System.out.printf("Policyholder's BMI: %,.2f\n", policies.get(i).getBMI());
            //System.out.printf("Policy Price: $%,.2f", policies.get(i).getInsurancePolicyPrice());
            //System.out.println();
            //System.out.println();
            
            System.out.println(policies.get(i));
            
            if (policies.get(i).getPolicyHolder().getPolicyHolderSmokingStatus().equalsIgnoreCase("smoker")){
               totalSmokers += 1;
            }
            else if(policies.get(i).getPolicyHolder().getPolicyHolderSmokingStatus().equalsIgnoreCase("non-smoker")){
               totalNonSmokers += 1;
            }
         }//end for loop
         System.out.println("There were " + Policy.getPolicyCount() + " Policy objects created.");
         System.out.println("");
         System.out.println("The number of policies with a smoker is: " + totalSmokers);
         System.out.println("The number of policies with a non-smoker is: " + totalNonSmokers);
      }//close try
      
      catch(IOException ex)
      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
      
      /*
      String policyNumber, providerName, policyHolderFirstName, 
               policyHolderLastName, policyHolderSmokingStatus;
      int policyHolderAge;
      double policyHolderHeight, policyHolderWeight;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Please enter the Policy Number: ");
      policyNumber = keyboard.nextLine();
      
      System.out.println("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      
      System.out.println("Please enter the Policyholder's First Name: ");
      policyHolderFirstName = keyboard.nextLine();
      
      System.out.println("Please enter the Policyholder's Last Name: ");
      policyHolderLastName = keyboard.nextLine();
      
      System.out.println("Please enter the Policyholder's Age: ");
      policyHolderAge = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      policyHolderSmokingStatus = keyboard.nextLine();
      
      System.out.println("Please enter the Policyholder's Height (in inches): ");
      policyHolderHeight = keyboard.nextDouble();
      
      System.out.println("Please enter the Policyholder's Weight (in pounds): ");
      policyHolderWeight = keyboard.nextDouble();
      
      Policy insurance = new Policy(policyNumber, providerName,policyHolderFirstName, policyHolderLastName,
                                    policyHolderAge, policyHolderSmokingStatus, policyHolderHeight, policyHolderWeight);
      
      System.out.println("Policy Number: " + insurance.getPolicyNumber());
      System.out.println("Provider Name: " + insurance.getProviderName());
      System.out.println("Policyholder's First Name: " + insurance.getPolicyHolderFirstName());
      System.out.println("Policyholder's Last Name: " + insurance.getPolicyHolderLastName());
      System.out.println("Policyholder's Age: " + insurance.getPolicyHolderAge());
      System.out.println("Policyholder's Smoking Status: " + insurance.getPolicyHolderSmokingStatus());
      System.out.println("Policyholder's Height: " + insurance.getPolicyHolderHeight());
      System.out.println("Policyholder's Weight: " + insurance.getPolicyHolderWeight());
      System.out.printf("Policyholder's BMI: %,.2f\n", insurance.getBMI());
      System.out.printf("Policy Price: $%,.2f", insurance.getInsurancePolicyPrice());
      */
   }
}