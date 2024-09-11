package tugas1.c;

/**
 * App
 */
public class Loop {

    // Loop Z-A dengan for
    void loopZtoAFor() {
        for (int i = 90; i >= 65; i--) {
            // menampilkan karakter ASCII
            System.out.print((char)i + " ");
        }
        System.out.println();
    }


    // Loop Z-A dengan while
    void loopZtoAWhile() {
        int i = 90;
        while (i >= 65) {
            // menampilkan karakter ASCII
            System.out.print((char)i + " ");
            i--;
        }
        System.out.println();
    }
    

    // Loop Z-A dengan do while
    void loopZtoADoWhile() {
        int i = 90;
        do {
            // menampilkan karakter ASCII
            System.out.print((char)i + " ");
            i--;
        } while (i >= 65);
        System.out.println();
    }
}