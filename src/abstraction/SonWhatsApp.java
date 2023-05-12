package abstraction;

public class SonWhatsApp extends FatherWhatsapp {
	
	
	public void whatsApp()
	{
		
		System.out.println("Sons WhatsApp");
	}
	
	public static void main(String[] args) {
		
		
		SonWhatsApp s = new SonWhatsApp();
		s.whatsApp();//child
		s.whatsApp();//father
		
	}

}
