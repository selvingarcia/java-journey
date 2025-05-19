import javax.swing.text.DateFormatter;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Prueba {

    public static void main(String[] args) {
        LocalDateTime fecha = LocalDateTime.of(2008,04,05, 16,40,30);
        System.out.println(fecha);
        LocalDateTime fecha2 = LocalDateTime.of(2008,04,05, 16,40,30);
        System.out.println(fecha2);

        if (fecha.isBefore(fecha2)) {
            System.out.println(fecha + " Is before " + fecha2);

        }
        else if(fecha.isAfter(fecha2)){
            System.out.println(fecha + " Is after " + fecha2);
        }
        else if(fecha.equals(fecha2)){
            System.out.println(fecha + " is equal to " + fecha2);
        }

    }
}
