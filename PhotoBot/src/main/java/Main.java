import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class Main {

	public static void main(String[] args) {
		ApiContextInitializer.init();
		
		TelegramBotsApi botsApi = new TelegramBotsApi();	
		System.out.println(Thread.currentThread().getName());
		try {
			botsApi.registerBot(new PhotoBot());
		
			
		}
		catch(TelegramApiException e) {
			e.printStackTrace();
		}
	}

}
