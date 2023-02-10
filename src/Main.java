public class Main {
    public static void main(String[] args) {
        int days = 1000;
        int seconds = days * 24 * 60 * 60;
        long distance = seconds * 300000L;
        System.out.println("За 1000 дней свет пройдёт расстояние " + distance + " км");
    }
}