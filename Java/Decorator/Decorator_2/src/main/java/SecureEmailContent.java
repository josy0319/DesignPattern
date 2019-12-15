
public class SecureEmailContent extends EmailContentDecorator{
	public SecureEmailContent(EmailContent emailContent) {
		super(emailContent);
	}
	public String getContent() {
		String content = super.getContent();
		String externalContent = encrypt(content);
		return externalContent;
	}
	public String encrypt(String content) {
		return content+ "encrypted";
	}
}
