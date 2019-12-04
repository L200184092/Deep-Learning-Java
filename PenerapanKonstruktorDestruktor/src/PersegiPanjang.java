public class PersegiPanjang {
    private double panjang;
    private double Lebar;

    // tambahkan bagian konstruktor ini
    public PersegiPanjang() {
        this.panjang = 0;
        this.Lebar = 0;
        System.out.println("Objek Persegi Panjang diinstansiasi");
    }

    public double getLebar() {
        return Lebar;
    }

    public void setLebar(double Lebar) {
        this.Lebar = Lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double hitungKeliling() {
        return (2 * panjang) + (2 * Lebar);
    }

    public double hitungLuas() {
        return panjang * Lebar;
    }
}
