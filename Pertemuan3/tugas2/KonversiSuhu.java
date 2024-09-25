package tugas2;

/**
 * KonversiSuhu
 */
public class KonversiSuhu {
    // method celcius ke fahrenheit
    void celciusToFahrenheit(float celcius) {
        float fahrenheit = (celcius * 9 / 5) + 32;
        System.out.println(celcius + "°C = " + fahrenheit + "°F");
    }

    // method celcius ke reamur
    void celciusToReamur(float celcius) {
        float reamur = celcius * 4 / 5;
        System.out.println(celcius + "°C = " + reamur + "°R");
    }
    
}