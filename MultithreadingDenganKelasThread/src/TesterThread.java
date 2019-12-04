public class TesterThread {
    public static void main(String[] args) {
        ThreadSaya thread1 = new ThreadSaya("Satu");
        ThreadSaya thread2 = new ThreadSaya("Dua");

        // menjalankan method start tanpa parameter
        thread1.start();
        thread1.run();
        thread2.start();
        thread2.run();

        // menjalankan method start berparameter
        thread1.start(Thread.MAX_PRIORITY);
        thread1.run();
        thread2.start(Thread.NORM_PRIORITY);
        thread2.run();
    }
}
