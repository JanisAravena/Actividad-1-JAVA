package clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ManejoDeFechas {
    public static LocalDate convertirStringALocalDate(String fecha) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaFormato = LocalDate.parse(fecha, formato);
        return fechaFormato;
    }

}
