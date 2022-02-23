package abstract1;

public class MainApp3 {
    public static void main(String[] args) {
        TeleGramv3 t = new TeleGramv3();
        t.sendMessage();
        t.sendImages();
        t.sendVideos();
    }
}
