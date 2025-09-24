package B11221009;

public class EasyCard {
	
		private String cardNumber;
		
		public void setcardNumber (String cardNumber){
			this.cardNumber = cardNumber;
		}
		
		public String getcardNumber() {
			return cardNumber;
		}
		
	    private int balance;

	    public EasyCard() {
	        balance = 0;
	    }
	    
	    public void setbalance(int balance) {
	    	this.balance = balance;
	    }
	    
	    public int getbalance() {
	    	return balance;
	    }
	    

	    public int add (int amount){
	       
	            balance += amount;
	            return balance;
	        }
	 
	    
}
