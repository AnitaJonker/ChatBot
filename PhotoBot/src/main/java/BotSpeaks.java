import java.util.ArrayList;
import java.util.List;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.methods.send.SendPhoto;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class BotSpeaks {
	
	
	
	public String speak(Object update) {
		
		System.out.println("UPDATE:");
		System.out.println(update);
		return "hello";
		
		}
			   
			 
//			   
			 
			 
			 
		
		
		
//		else if(update.hasMessage() && update.getMessage().hasPhoto()) {
//			
//			long chat_id = update.getMessage().getChatId();
//			List<PhotoSize> photos = update.getMessage().getPhoto();
//			
//			 
//			//File ID
//			String f_id = photos.stream()
//	                    .sorted(Comparator.comparing(PhotoSize::getFileSize).reversed())
//	                    .findFirst()
//	                    .orElse(null).getFileId();			//.sorted(Comparator.comparing(PhotoSize::getFileSize).reversed())
//			
//			//Width of photo
//			 int f_width = photos.stream()
//	                    .sorted(Comparator.comparing(PhotoSize::getFileSize).reversed())
//	                    .findFirst()
//	                    .orElse(null).getWidth();
//
//			 //Height of photo
//			 int f_height = photos.stream()
//	                    .sorted(Comparator.comparing(PhotoSize::getFileSize).reversed())
//	                    .findFirst()
//	                    .orElse(null).getHeight();
//		
//			 String caption = "file_id: " + f_id + "\nwidth: " + Integer.toString(f_width) + "\nheight: " + Integer.toString(f_height);
//			 System.out.println(caption);
//			 
//			 SendPhoto msg = new SendPhoto()
//					 			 .setChatId(chat_id)
//					 			 .setPhoto(f_id)
//					 			 .setCaption(caption);
//			 
//			 try {
//			        sendPhoto(msg); // Call method to send the photo with caption
//			    } catch (TelegramApiException e) {
//			        e.printStackTrace();
//			    }
//		}
	

}
