import java.text.SimpleDateFormat;
import java.util.Date;

//Programa que implementa la Clase Date para mostrar la fecha y tiempo con y sin un formato establecido.
public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");
        /*Date and Time Pattern	Result
        "yyyy.MM.dd G 'at' HH:mm:ss z"	2001.07.04 AD at 12:08:56 PDT
        "EEE, MMM d, ''yy"	Wed, Jul 4, '01
        "h:mm a"	12:08 PM
        "hh 'o''clock' a, zzzz"	12 o'clock PM, Pacific Daylight Time
        "K:mm a, z"	0:08 PM, PDT
        "yyyyy.MMMMM.dd GGG hh:mm aaa"	02001.July.04 AD 12:08 PM
        "EEE, d MMM yyyy HH:mm:ss Z"	Wed, 4 Jul 2001 12:08:56 -0700
        "yyMMddHHmmssZ"	010704120856-0700
        "yyyy-MM-dd'T'HH:mm:ss.SSSZ"	2001-07-04T12:08:56.235-0700
        "yyyy-MM-dd'T'HH:mm:ss.SSSXXX"	2001-07-04T12:08:56.235-07:00
        "YYYY-'W'ww-u"	2001-W27-3*/
        String fechaStr = df.format(fecha);

        long j = 0;
        for (int i = 0; i < 100000000; i++){
            j += i;
        }
        System.out.println("j = " + j);
        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurrido en el for = " + tiempoFinal);

        System.out.println("fechaStr = " + fechaStr);
    }
}
