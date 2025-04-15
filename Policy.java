public class Policy
{
   private String policyNumber;
   private String providerName;
   
   //static field, shared among all instances of the class
   public static int policyCount = 0;
   
   //Constructors
   
   /**
      no-arg constructor
   */
   public Policy()
   {
      policyNumber = "0000";
      providerName = "None";
      policyCount++;
   }
   
   /**
      Constructor with all parameters
      @param number        The policyNumber
      @param provider      The policy provider
   */
   public Policy(String number, String provider)
   {
      policyNumber = number;
      providerName = provider;
      policyCount++;
   }
   
   /**
      Mutator and accessor methods
   */
   
      //Setters
      
   /**
      The setPolicyNumber method sets the policy number
      @param number  The policy number
   */
   public void setPolicyNumber(String number)
   {
      policyNumber = number;
   }
   
   /**
      The setProviderName method sets the provider name
      @param provider   The provider name
   */
   public void setProviderName(String provider)
   {
      providerName = provider;
   }
   
      //Getters
   
   /**
      The getPolicyNumber method gets the policy number
      @return The policy number
   */
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   /**
      The getProviderName method gets the provider's name
      @return The provider's name
   */
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
      The getPolicyCount method gets the number of policy objects created
      @return The policy objects count
   */
   public static int getPolicyCount()
   {
      return policyCount;
   }
   
   public String toString()
   {
      return "Policy Number" + policyNumber + "\n" +
             "Provider Name: " + providerName + "\n";
   }
   
   
}