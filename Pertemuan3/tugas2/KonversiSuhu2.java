package tugas2;

// Melakukan inheritance dari class KonversiSuhu
public class KonversiSuhu2 extends KonversiSuhu {

    // method fahrenheit ke reamur
    void fahrenheitToReamur(float fahrenheit) {
        float reamur = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + "°F = " + reamur + "°R");
    }
}
