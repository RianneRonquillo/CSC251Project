public class Policy
{
   private String policyNumber;
   private String providerName;
   
   //Constructors
   
   /**
      no-arg constructor
   */
   public Policy()
   {
      policyNumber = "0000";
      providerName = "None";
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
}