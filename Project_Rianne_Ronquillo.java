import java.util.Scanner;

public class Project_Rianne_Ronquillo
{
   public static void main(String[] args)
   {
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
      
   }
}