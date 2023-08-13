public class Calculadora {

    public static void main (String args []) {

        Raices testUno = new Raices(1.0, -2.0, -3.0);
        Double discriminanteTestUno = testUno.getDiscriminante();
        System.out.println(String.format("El discriminante es: %s", discriminanteTestUno));
        System.out.println(String.format("%s", testUno.getRaices(discriminanteTestUno)));

        Raices testDos = new Raices(1.0, -12.0, 36.0);
        Double discriminanteTestDos = testDos.getDiscriminante();
        System.out.println(String.format("El discriminante es: %s", discriminanteTestDos));
        System.out.println(String.format("%s", testDos.getRaices(discriminanteTestDos)));

        Raices testTres = new Raices(1.0, -6.0, 25.0);
        Double discriminanteTestTres = testTres.getDiscriminante();
        System.out.println(String.format("El discriminante es: %s", discriminanteTestTres));
        System.out.println(String.format("%s", testTres.getRaices(discriminanteTestTres)));

    }
}
