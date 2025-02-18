public class Policy
{
   private String policyNumber;
   private String providerName;
   private String policyHolderFirstName;
   private String policyHolderLastName;
   private int    policyHolderAge;
   private String policyHolderSmokingStatus;
   private double policyHolderHeight;
   private double policyHolderWeight;
   
   //Constructors
   
   /**
      no-arg constructor
   */
   public Policy()
   {
      policyNumber = "0000";
      providerName = "None";
      policyHolderFirstName = "None";
      policyHolderLastName = "None";
      policyHolderAge = 0;
      policyHolderSmokingStatus = "non-smoker";
      policyHolderHeight = 0.0;
      policyHolderWeight = 0.0;
   }
   
   /**
      Constructor with all parameters
      @param number        The policyNumber
      @param provider      The policy provider
      @param firstName     The holder's first name
      @param lastName      The holder's last name
      @param age           The holder's age
      @param smokingStatus The holder's smoking status
      @param height        The holder's height in inches
      @param weight        The holder's weight in pounds
   */
   public Policy(String number, String provider, String firstName, String lastName, 
                  int age, String smokingStatus, double height, double weight)
   {
      policyNumber = number;
      providerName = provider;
      policyHolderFirstName = firstName;
      policyHolderLastName = lastName;
      policyHolderAge = age;
      policyHolderSmokingStatus = smokingStatus;
      policyHolderHeight = height;
      policyHolderWeight = weight;
   }
   
   /**
      Mutator and accessor methods
   */
   public void setPolicyNumber(String number)
   {
      policyNumber = number;
   }
   
   public void setProviderName(String provider)
   {
      providerName = provider;
   }
   
   public void setPolicyHolderFirstName(String firstName)
   {
      policyHolderFirstName = firstName;
   }
   
   public void setPolicyHolderLastName(String lastName)
   {
      policyHolderLastName = lastName;
   }
   
   public void setPolicyHolderAge(int age)
   {
      policyHolderAge = age;
   }
   
   public void setPolicyHolderSmokingStatus(String smokingStatus)
   {
      policyHolderSmokingStatus = smokingStatus;
   }
   
   public void setPolicyHolderHeight(double height)
   {
      policyHolderHeight = height;
   }
   
   public void setPolicyHolderWeight(double weight)
   {
      policyHolderWeight = weight;
   }
   
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
   public String getPolicyHolderFirstName()
   {
      return policyHolderFirstName;
   }
   
   public String getPolicyHolderLastName()
   {
      return policyHolderLastName;
   }
   
   public int getPolicyHolderAge()
   {
      return policyHolderAge;
   }
   
   public String getPolicyHolderSmokingStatus()
   {
      return policyHolderSmokingStatus;
   }
   
   public double getPolicyHolderHeight()
   {
      return policyHolderHeight;
   }
   
   public double getPolicyHolderWeight()
   {
      return policyHolderWeight;
   }
   
   public double getBMI()
   {
      return (getPolicyHolderWeight() * 703) / (getPolicyHolderHeight() * getPolicyHolderHeight());
   }
   
   public double getInsurancePolicyPrice()
   {
      final double BASE_FEE = 600;
      double additionalFee = 0;
      
      if (getPolicyHolderAge() > 50){
         additionalFee += 75;
      }
      
      if (getPolicyHolderSmokingStatus().equalsIgnoreCase("smoker")){
         additionalFee += 100;
      }
      
      if (getBMI() > 35){
         additionalFee = additionalFee + ((getBMI() - 35) * 20);
      }
      double insurancePolicyPrice = BASE_FEE + additionalFee;
      return insurancePolicyPrice;
   }
}