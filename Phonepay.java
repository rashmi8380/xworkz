class phonePay{
	public static void payment(long PhoneNo){
	System.out.println(" Recharge successfully");
	}
	public static void payment(String DTH){
	System.out.println(" Your DTH recharge successfull " + DTH);
	}
	public static void payment(String billId,String Name,int amount){
	System.out.println(" Paid Electricity bill of " + billId + " Name:" + Name+ " amount of "+amount);
	}
	public static void payment(int creditCardNo,int amount){
	System.out.println(" credit card bill paid successfully " );
	}
	public static void main(String args[]){
	phonePay.payment( 56823175 );
	phonePay.payment("785Xh");
	phonePay.payment( "vb78lk5","Monika",566);
	phonePay.payment( 24851589 , 57682);
	}
	}
