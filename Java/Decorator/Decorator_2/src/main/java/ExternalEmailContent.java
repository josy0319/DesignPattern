
public class ExternalEmailContent extends EmailContentDecorator{
	public ExternalEmailContent(EmailContent emailContent) {
		super(emailContent);
	}
	public String getContent() {
		String content = super.getContent();
		String externalContent = addDisclaimer(content);
		return externalContent;
	}
	public String addDisclaimer(String content) {
		return content+ "company disclaimer";
	}
}
