import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LemparException {
    public static void main(String[] args) {
        // Pemanggilan try catch secara Langsung
        panggilFileBinatang();

        // Method dengan kata kunci throws harus dipanggil dalam try catch
        try {
            panggilFileTumbuhan();
        } catch (FileNotFoundException e) {
            System.out.println("File data tumbuhan tidak ditemukan");
        }
    }

    public static void panggilFileBinatang() {
        File dataBinatang = new File("C://databinatang.txt");
        try {
            FileReader baca = new FileReader(dataBinatang);
        } catch (FileNotFoundException e) {
            System.out.println("File data binatang tidak ditemukan");
        }
    }

    // Penggunaan throws
    public static void panggilFileTumbuhan() throws FileNotFoundException {
        File dataTumbuhan = new File("C://datatumbuhan.txt");
        FileReader baca = new FileReader(dataTumbuhan);
        // Kita coba Lempar secara sengaja exception FileNotFoundException
        // (walaupun data ditemukan)
        throw new FileNotFoundException();
    }
}
