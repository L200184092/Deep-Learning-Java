public class Tester {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNama("Adam Mukharil Bachtiar");
        dosen.setUmur(24);
        dosen.setNip("41277006024");
        dosen.setMatakuliah("Rekayasa Perangkat Lunak");
        System.out.println("NIP Dosen : " + dosen.getNip());
        dosen.mengajarApa();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Firman Nizammudin Fakhrul");
        mahasiswa.setUmur(19);
        mahasiswa.setNim("10114413");
        mahasiswa.setKelas("IF-10");
        System.out.println("NIM Mahasiswa : " + mahasiswa.getNim());
        mahasiswa.kelasApa();
    }
}
