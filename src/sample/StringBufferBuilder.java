package sample;

public class StringBufferBuilder {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("welcome");
		
		sb.reverse();
		System.out.println(sb);  // emoclew
		
		System.out.println(sb.hashCode());  // 292938459
		
		sb.append("oranium");
		System.out.println(sb);

		System.out.println(sb.hashCode());   // 292938459
		
		
		sb.insert(1,"a");
		System.out.println(sb);  // eamocleworanium

		System.out.println(sb.hashCode());    // 292938459
		
		
		
		
	}
	
	

}
