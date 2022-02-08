package Apps;

public class App21 {
    public static void main(String[] args) throws Exception {
        try {
            Throwable t = new Exception();
            throw t;
        } catch (Exception e) {
            System.out.println("Перехвачено!");
        }
    }
}
