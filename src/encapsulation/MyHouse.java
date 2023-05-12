package encapsulation;

public class MyHouse {
	
	
public static void main(String[] args) {
	
	FriendHouse f = new FriendHouse ();
//	System.out.println(f.lockerAmt);    //get 
//	
//	f.lockerAmt=3000;                 //set 
//	
//	System.out.println(f.lockerAmt);   // 3000
	
	int lockerAmt = f.getLockerAmt();   //using getter method of friend house class 
	System.out.println(lockerAmt);   
	
	f.setLockerAmt(3000);
	
	int lockerAmt2 = f.getLockerAmt();
	System.out.println(lockerAmt2);
 
	
}
	
	

}
