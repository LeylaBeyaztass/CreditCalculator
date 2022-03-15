public class OfficerCredit implements Credit{

    @Override
    public void calculate(int year, double price) {
        double total = 0;

        if (year == 1) {
            total = price * 1.20;
        } else if (year == 2) {
            total = price * 1.40;
        }else {
            System.out.println("Kredi sadece 1 veya 2 yıl olarak girilebilir.");
            return;
        }
        System.out.println("Memur kredisi :" +year + "yıl için toplam ödeme: " +total + "bin TL");
    }

}
