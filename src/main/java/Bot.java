import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendAudio;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "overone_musical_bot";
    }


    @Override
    public String getBotToken() {
        return "6347384357:AAG9A9pYHMV2ZSHVVF0CJ8o3yWW7NFgifuM";
    }

    // Instasamka CQACAgIAAxkBAAMJZV-TyuZvMlW9NDGabks570Kh5jcAAnI6AAKzmflKhHpN6bXLYBUzBA
    // Корж CQACAgIAAxkBAAMLZV-UQhcTxGLUhkdTcxDgzSxPIFsAAnY6AAKzmflK5S6ESAOWXU4zBA
    // Нурминский CQACAgIAAxkBAAMNZV-UhT0pX5-sX_1tag6vmLb1aZ8AAns6AAKzmflKHidnzO03jKIzBA
    // Серега CQACAgIAAxkBAAMPZV-VSDPmRp9q-PIDfnrSEj7Vhs0AApM6AAKzmflK3Wi8LCCgC1ozBA
    // Dabro CQACAgIAAxkBAAMRZV-VnvamLblFyXynWt12m_q-mJcAApU6AAKzmflKhlepR0uSYEkzBA
    @Override
    public void onUpdateReceived(Update update) {
        // 1
        SendAudio sendAudio = new SendAudio();
        sendAudio.setChatId(update.getMessage().getChatId().toString());
        sendAudio.setAudio(new InputFile("CQACAgIAAxkBAAMJZV-TyuZvMlW9NDGabks570Kh5jcAAnI6AAKzmflKhHpN6bXLYBUzBA"));
        sendAudio.setCaption("Лучшая песня тысячалетия!");
        try {
            execute(sendAudio);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        // 2
        SendAudio sendAudio2 = new SendAudio();
        sendAudio2.setChatId(update.getMessage().getChatId().toString());
        sendAudio2.setAudio(new InputFile("CQACAgIAAxkBAAMJZV-TyuZvMlW9NDGabks570Kh5jcAAnI6AAKzmflKhHpN6bXLYBUzBA"));
        sendAudio2.setCaption("Лучшая песня тысячалетия!");
        try {
            execute(sendAudio2);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        // 3
        SendAudio sendAudio3 = new SendAudio();
        sendAudio3.setChatId(update.getMessage().getChatId().toString());
        sendAudio3.setAudio(new InputFile("CQACAgIAAxkBAAMJZV-TyuZvMlW9NDGabks570Kh5jcAAnI6AAKzmflKhHpN6bXLYBUzBA"));
        sendAudio3.setCaption("Лучшая песня тысячалетия!");
        try {
            execute(sendAudio3);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }


    }
}
