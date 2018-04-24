package com.framework.config;

import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;


public class EmailVerification {

	public static void main(String[] args) {
		String host = "pop.gmail.com";// change accordingly
		String mailStoreType = "pop3";
		String username = "rangegowdaym.bank@gmail.com";// change accordingly
		String password = "Gowda@5273101";// change accordingly

		checkMails(host, mailStoreType, username, password);
	}

	public static void checkMails(String host, String storeType, String username, String password) {
		try {
			Properties config = new Properties();
			config.put("mail.pop.host", host);
			config.put("mail.pop.port", "995");
			config.put("mail.pop.starttls.enable", "true");

			Session emailSession = Session.getDefaultInstance(config);

			// create the POP3 store object and connect with the pop server
			Store store = emailSession.getStore("pop");

			store.connect(host, username, password);

			// create the folder object and open it
			Folder emailFolder = store.getFolder("INBOX");
			emailFolder.open(Folder.READ_ONLY);

			// retrieve the messages from the folder in an array and print it
			Message[] messages = emailFolder.getMessages();
			System.out.println("messages.length---" + messages.length);

			for (int i = 0, n = messages.length; i < n; i++) {
				Message message = messages[i];
				System.out.println("---------------------------------");
				System.out.println("Email Number " + (i + 1));
				System.out.println("Subject: " + message.getSubject());
				System.out.println("From: " + message.getFrom()[0]);
				System.out.println("Text: " + message.getContent().toString());

				// close the store and folder objects
				emailFolder.close(false);
				store.close();

			}
		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
