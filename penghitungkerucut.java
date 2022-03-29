package praktikum2;
import praktikum2.penghitungkerucut;

public class penghitungkerucut {

    public static void main(String[] args) {
        kerucut utama = new kerucut(10, 25, 40);

        System.out.println(
                "Luas : " + utama.getLuas() + "\n" +
                        "Volume : " + utama.getVolume() + "\n" );
    }
}

