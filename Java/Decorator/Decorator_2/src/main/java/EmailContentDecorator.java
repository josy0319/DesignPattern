
public abstract class EmailContentDecorator extends EmailContent{
	private EmailContent emailContent;
	
	public EmailContentDecorator(EmailContent emailContent) {
		this.emailContent = emailContent;
	}
	public String getContent() {
		return emailContent.getContent(); 
	}
}
