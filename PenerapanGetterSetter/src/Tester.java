public class Tester {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.setSisi(10);
        System.out.println("Sisi Persegi = " + persegi.getSisi());
        System.out.println("Keliling Persegi = " + persegi.hitungKeliling());
        System.out.println("Luas Persegi = " + persegi.hitungLuas());

        PersegiPanjang persegipanjang = new PersegiPanjang();
        persegipanjang.setPanjang(5);
        persegipanjang.setLebar(4);
        System.out.println("Panjang Persegi = " + persegipanjang.getPanjang());
        System.out.println("Lebar Persegi = " + persegipanjang.hitungKeliling());
        System.out.println("Luas Persegi Panjang = " + persegipanjang.hitungLuas());
    }
}
