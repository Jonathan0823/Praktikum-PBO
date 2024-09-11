package tugas3.loopandarrayversion;

public class Text {
    String Text;
    // Array
    String[] Bingo = new String[5];

    // Constructor
    public Text(String Text) {
        this.Text = Text;
        Bingo[0] = "B";
        Bingo[1] = "I";
        Bingo[2] = "N";
        Bingo[3] = "G";
        Bingo[4] = "O";
    }

    // Method untuk menampilkan bingo
    public void getBingo() {

        // Loop pertama untuk mengubah Huruf bingo menjadi huruf (clap)
        for (int i = 0; i <= 5; i++) {

            // Mengubah huruf yang terdapat dalam array Bingo menjadi (clap)
            if (i >= 1) {
                Bingo[i-1] = Text;
                }
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o.");
            
            // Loop kedua untuk menduplikasikan Bingo sebanyak 5 kali
            for (int y = 0; y < 5; y++) {

                // Loop ketiga untuk mencetak array Bingo 
                for (int j = 0; j < 5; j++) {
                    System.out.print(Bingo[j]+"  ");
                }
                System.out.println();
            }
            System.out.println("And Bingo was his name-o.");
            System.out.println();
        }
    }

}
