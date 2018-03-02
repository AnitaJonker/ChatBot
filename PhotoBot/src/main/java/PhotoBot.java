import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.methods.send.SendPhoto;
import org.telegram.telegrambots.api.objects.PhotoSize;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.User;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.logging.BotLogger;

import com.vdurmont.emoji.Emoji;
import com.vdurmont.emoji.EmojiLoader;
import com.vdurmont.emoji.EmojiParser;
import com.vdurmont.emoji.EmojiParser.EmojiTransformer;
import com.vdurmont.emoji.EmojiParser.FitzpatrickAction;
import com.vdurmont.emoji.EmojiParser.UnicodeCandidate;
import java.awt.Container;


public class PhotoBot extends TelegramLongPollingBot {

	private EmojiParser emoji;
	
	
	public String getBotUsername() {
		// TODO Auto-generated method stub
		return "*";
	}

	public void onUpdateReceived(Update update) {
	
		if(update.hasMessage() && update.getMessage().hasText())
		{
			Object updateObj = update;
			ThreadMaker threadMaker = new ThreadMaker(updateObj);
			new Thread(threadMaker).start();
			//threadMaker.start();
			
		//	System.out.println("Is working");
			String message_text = update.getMessage().getText();
			String emoji_text = emoji.parseToAliases(message_text);
			System.out.println(emoji_text);
			//String emojiText = 
			long chat_id = update.getMessage().getChatId();
//			SendMessage message = new SendMessage()
//					.setChatId(chat_id)
//					.setText(message_text);
			
			String photo = "AgADBAADlasxGzcPaFBDYiQ7NgUzcrdo4xkABBqt66zjHhfgskIAAgI";		
				 SendMessage message = new SendMessage();
				 switch (message_text)
				 {
		
				 case "/start":
					   message = new SendMessage() // Create a message object object
                      .setChatId(chat_id)
                      .setText("Hello! Let's get started.");
						 try {
							 execute(message); // Call method to send the photo
						} catch (TelegramApiException e) {
							e.printStackTrace();
						}
					 break;
					 
				 case "/pic":
			    	  	       
			    	  SendPhoto msg = new SendPhoto()
                      .setChatId(chat_id)
                      .setPhoto(photo)
                      .setCaption("Photo");
			    	  
                try {
                    sendPhoto(msg); // Call method to send the photo
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
					 break;
					 
				 case "/markup":
				  message = new SendMessage() // Create a message object object
                 .setChatId(chat_id)
                 .setText("Here is your keyboard");
	    	 
		    	 //Create keyboard object
		    	 ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
		    	 
		    	 //Create keyboard rows
		    	 List<KeyboardRow> keyboard = new ArrayList<>();
		    	 
		    	 //Keyboard row
		    	 KeyboardRow row = new KeyboardRow();
		    	 
		    	 row.add("/start");
		    	 row.add("Send picture");
		    	 row.add("How are you?");
		    	 
		    	 keyboard.add(row);
		    	 
		    	  // Set the keyboard to the markup
	    	    keyboardMarkup.setKeyboard(keyboard);
	    	    message.setReplyMarkup(keyboardMarkup);
	    	    try {
	    	        execute(message); // Sending our message object to user
	    	    } catch (TelegramApiException e) {
	    	        e.printStackTrace();
	    	    }
					 break;
				 
					 
				 case "Send picture":
					  SendPhoto photoObj = new SendPhoto()
                      .setChatId(chat_id)
                      .setPhoto(photo)
                      .setCaption("Photo");

                try {
                    sendPhoto(photoObj); // Call method to send the photo
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
					 break;
					 
				 case "How are you?":
					 message = new SendMessage() // Create a message object object
                     .setChatId(chat_id)
                     .setText("I'm good thank you :)");
					 try {
						 execute(message); // Call method to send the photo
					} catch (TelegramApiException e) {
						e.printStackTrace();
					}
					 
					 
			
					 
					 
				default:
					   // Create a message object object
				 message = new SendMessage() // Create a message object object
	             .setChatId(chat_id)
	             .setText(":)");
				 try {
					 execute(message); // Call method to send the photo
				} catch (TelegramApiException e) {
					e.printStackTrace();
				}
					break;
 
					 
				 }
		}
	}
	
	@Override
	public String getBotToken() {
		// TODO Auto-generated method stub
		return "*";
	}

	

}
