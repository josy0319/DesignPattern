
public class Main {
	public static void main(String[] args) {
		EmailContent ec = new BasicEmailContent("this is a email");
		EmailContent ecd = new ExternalEmailContent(ec);
		EmailContent ecde = new SecureEmailContent(ec);
		
		System.out.println(ecd.getContent());
		System.out.println(ecde.getContent()); 
	}
}
