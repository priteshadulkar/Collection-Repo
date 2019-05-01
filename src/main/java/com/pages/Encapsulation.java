package com.pages;

public class Encapsulation {
	// binding a data with mathods 
		private int  accnum ;// This are a datas 
		private int balance ;
		private String mobilenum ;
		private String email ;
		
		public int getaccnum()// which is binding with mathods
		{
			return accnum;
			
			
		}
		public int getbalance()
		{
			return balance;
			
			
		}
		public String getmobilenum()
		{
			return mobilenum;
			
	     }
		public void setmobilenum(String mobile)
		{
			
			this.mobilenum=   mobile ;
		}
		
		
		public String getemail() {
			return email;
		
			
			
		}
		
		public void setaccnum(int a)
		{
			this.accnum= a ;
		}
		public void setemailid(String emailid)
		{
			
			this.email =  emailid ; 
		}
		public void setbalance(int balance)
		{
			
			this.balance = balance ;
		}
		
		public static void main(String[] args)
		{
			
			Encapsulation e = new Encapsulation();
			e.setaccnum(794623);
			e.setbalance(37000);
			e.setemailid("mayuradulkar.01@gmail.com");
			e.setmobilenum("9028462080");
			System.out.println(e.getaccnum() +" " +e.getbalance()+" "+ e.getemail()+" " +e.getmobilenum());
		}
		
		
		
}
