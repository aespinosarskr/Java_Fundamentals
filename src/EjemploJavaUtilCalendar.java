import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//Programa que implementa la Clase Calendar para mostrar la fecha y tiempo con y sin un formato establecido.
public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        //calendario.set(2023, Calendar.FEBRUARY, 25, 19, 20, 10);
        //Datos estáticos para la fecha:
        calendario.set(Calendar.YEAR, 2023);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 01);

        //calendario.set(Calendar.HOUR_OF_DAY, 21);
        //Datos estáticos para el tiempo:
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);
        Date fecha = calendario.getTime();
        System.out.println("Fecha sin formato = " + fecha);

        //Estableciendo el formato de salida de fecha y tiempo:
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha);

        //Salida:
        System.out.println("Fecha Con Formato = " + fechaConFormato);

        Calendar calActual = Calendar.getInstance();
        Date fecha2 = calActual.getTime();

        if (fecha.after(fecha2)){
            System.out.println("fecha (del Usuario) es después que fecha2 (actual)");
        } else if (fecha.before(fecha2)) {
            System.out.println("fecha es anterior que fecha2");
        } else if (fecha.equals(fecha2)) {
            System.out.println("fecha es igual a fecha2");
        }

        if (fecha.compareTo(fecha2) > 0){
            System.out.println("fecha (del Usuario) es después que fecha2 (actual)");
        } else if (fecha.compareTo(fecha2) < 0) {
            System.out.println("fecha es anterior que fecha2");
        } else if (fecha.compareTo(fecha2) == 0) {
            System.out.println("fecha es igual a fecha2");
        }
    }
}
