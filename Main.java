import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Konsumsi> listkonsumsi = new ArrayList<>();
        Konsumsi<makanan, minuman> breakfast = new Konsumsi<>();
        Konsumsi<makanan, minuman> lunch = new Konsumsi<>();

        makanan roti = new makanan();
        roti.setNamaHidangan("Roti Tawar");
        minuman susu = new minuman();
        susu.setNamaHidangan("Susu Sapi");
        breakfast.setKonsumsi(roti, susu);
        listkonsumsi.add(breakfast);

        makanan nasi = new makanan();
    nasi.setNamaHidangan("Nasi Putih");
    minuman air = new minuman();
    air.setNamaHidangan("Air Putih");
    lunch.setKonsumsi(nasi, air);
listkonsumsi.add(lunch);

System.out.println("menu Konsumsi");
for (Konsumsi<makanan, minuman> Konsumsi:listkonsumsi)
{
    makanan makanan = Konsumsi.getM();
    minuman minuman = Konsumsi.getI();

    System.out.println(makanan.disantap());
    System.out.println(minuman.disantap());
    }
}
}