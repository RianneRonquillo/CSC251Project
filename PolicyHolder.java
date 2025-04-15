public class PolicyHolder
{
   private String policyHolderFirstName;
   private String policyHolderLastName;
   private int    policyHolderAge;
   private String policyHolderSmokingStatus;
   private double policyHolderHeight;
   private double policyHolderWeight;
   
   /**
      No-arg constructor
   */
   public PolicyHolder()
   {
      policyHolderFirstName = "None";
      policyHolderLastName = "None";
      policyHolderAge = 0;
      policyHolderSmokingStatus = "non-smoker";
      policyHolderHeight = 0.0;
      policyHolderWeight = 0.0;
   }
   
   /**
      Constructor with all parameters
      @param firstName     The holder's first name
      @param lastName      The holder's last name
      @param age           The holder's age
      @param smokingStatus The holder's smoking status
      @param height        The holder's height in inches
      @param weight        The holder's weight in pounds
   */
   public PolicyHolder(String firstName, String lastName,int age,
                       String smokingStatus, double height, double weight)
   {
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
   
      //Setters
      
   /**
      The setPolicyHolderFirstName method sets the policy holder's first name
      @param firstName  The policy holder's first name
   */
   public void setPolicyHolderFirstName(String firstName)
   {
      policyHolderFirstName = firstName;
   }
   
   /**
      The setPolicyHolderLastName method sets the policy holder's last name
      @param lastName   The policy holder's last name
   */
   public void setPolicyHolderLastName(String lastName)
   {
      policyHolderLastName = lastName;
   }
   
   /**
      The setPolicyHolderAge method sets the policy holder's age
      @param age  The policy holder's age
   */
   public void setPolicyHolderAge(int age)
   {
      policyHolderAge = age;
   }
   
   /**
      The setPolicyHolderSmokingStatus method sets the policy holder's smoking status
      @param smokingStatus    The policy holder's smoking status
   */
   public void setPolicyHolderSmokingStatus(String smokingStatus)
   {
      policyHolderSmokingStatus = smokingStatus;
   }
   
   /**
      The setPolicyHolderHeight method sets the policy holder's height
      @param height  The policy holder's height
   */
   public void setPolicyHolderHeight(double height)
   {
      policyHolderHeight = height;
   }
   
   /**
      The setPolicyHolderWeight method sets the policy holder's weight
      @param weight  The policy holder's weight
   */
   public void setPolicyHolderWeight(double weight)
   {
      policyHolderWeight = weight;
   }
   
      //Getters
   
   /**
      The getPolicyHolderFirstName method gets the policy holder's first name
      @return The policy holder's first name
   */
   public String getPolicyHolderFirstName()
   {
      return policyHolderFirstName;
   }
   
   /**
      The getPolicyHolderLastName method gets the policy holder's last name
      @return The policy holder's last name
   */
   public String getPolicyHolderLastName()
   {
      return policyHolderLastName;
   }
   
   /**
      The getPolicyHolderAge method gets the policy holder's age
      @return The policy holder's age
   */
   public int getPolicyHolderAge()
   {
      return policyHolderAge;
   }
   
   /**
      The getPolicyHolderSmokingStatus method gets the policy holder's smoking status
      @return The policy holder's smoking status
   */
   public String getPolicyHolderSmokingStatus()
   {
      return policyHolderSmokingStatus;
   }
   
   /**
      The getPolicyHolderHeight method gets the policy holder's height
      @return The policy holder's height
   */
   public double getPolicyHolderHeight()
   {
      return policyHolderHeight;
   }
   
   /**
      The getPolicyHolderWeight method gets the policy holder's weight
      @return The policy holder's weight
   */
   public double getPolicyHolderWeight()
   {
      return policyHolderWeight;
   }
   
   /**
      The getBMI method gets the policy holder's BMI
      @return The policy holder's BMI
   */
   public double getBMI()
   {
      return (getPolicyHolderWeight() * 703) / (getPolicyHolderHeight() * getPolicyHolderHeight());
   }
   
   /**
      The getInsurancePolicyPrice method gets the insurance policy price
      @return the insurance policy price
   */
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