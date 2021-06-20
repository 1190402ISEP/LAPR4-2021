package eapli.base.utils.email;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * The type Envio email.
 */
public class EnvioEmail {
    /**
     * The constant EMAIL.
     */
    protected static final String EMAIL="no-reply_connectsoft@outlook.pt";
    /**
     * The constant PWD.
     */
    protected static final String PWD="2DK_03.connectSoft";

    /**
     * Enviar mail
     *
     * @param assunto      the assunto
     * @param mensagem     the mensagem
     * @param emailDestino the email destino
     * @return the boolean
     */
    public static boolean enviarMail(String assunto, String mensagem, String emailDestino) {

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp-mail.outlook.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(EMAIL, PWD);
                    }
                });
        //session.setDebug(true);

        try {
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(EMAIL));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailDestino));
            msg.setSubject(assunto);
            msg.setText(mensagem);
            Transport.send(msg);
            return true;
        } catch (MessagingException e) {
            //e.printStackTrace();
            return false;
        }

    }
}
