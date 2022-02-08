package Apps;

public class App19 {
    public static void main(String[] args) throws Exception {
        Object ref = "Hello!";  // ref указывает на строку
        char c = ref.charAt(0); // тут ошибка компиляции
    }
}
