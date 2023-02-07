public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(32768);//boxing, toma un valor entero primitivo y lo convierte a un entero, forma explicita
        Integer intObjeto2 = intPrimitivo;//autoboxing, de forma automática va a tomar de la literal un valor primitivo entero y automáticamente lo convierte a un objeto, forma implicita
        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto; //manera automática implicita, toma el objeto Integer y se convierte en int primitivo
        System.out.println("num = " + num);
        int num2 = intObjeto2.intValue();
        System.out.println("num2 = " + num2);

        //Convertir de un String a un valor entero
        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);

    }
}
