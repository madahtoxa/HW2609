package Task2;

public class main {
    public static void main(String[] args) {
        Flower[] all = new Flower[4];
        Flower roza = new Flower("Роза обыкновенная", "", "Голандия", 35.59, 0);
        Flower hri = new Flower("Хризантема", "", "", 15.0, 5);
        Flower pion = new Flower("Пион", "", "Англия", 69.9, 1);
        Flower gipso = new Flower("Гипсофила", "", "Турция", 19.5, 10);
        all[0] = roza;
        all[1] = hri;
        all[2] = pion;
        all[3] = gipso;
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i].toString());
        }
    }

}
