package Apps;

public class App16 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Error e) {
        }
    }
}
