package gridexample;



import com.sendgrid.*;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;

import java.io.IOException;

public class SendGrid {
  public static void main(String[] args) throws IOException {
	  
    Email from = new Email("");
    String subject = "Sending with SendGrid is Fun";
    Email to = new Email("");
    Content content = new Content("text/plain", "and easy to do anywhere, even with Java");
    Mail mail = new Mail(from, subject, to, content);

    SendGrid sg = new SendGrid();
    Request request = new Request();
    try {
      request.setMethod(Method.POST);
      request.setEndpoint("mail/send");
      request.setBody(mail.build());
    
    } catch (IOException ex) {
      throw ex;
    }
  }
}
