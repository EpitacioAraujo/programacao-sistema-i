class Aula {
    public static void main(String[] args) {
        System.out.println("E & - true & true :" + (true & true));
        
        System.out.println("OU | - true | true :" + (true | false));

        System.out.println("MAIOR > - 1 > 0 :" + (1 > 0));

        System.out.println("MENOR - 1 < 2 :" + (1 < 2));

        System.out.println("MAIOR IGUAL >= - 1 >= 2 :" + (1 >= 2));

        System.out.println("MENOR IGUAL <= - 1 <= 2 :" + (1 <= 2));

        System.out.println("IGUAL == - 1 == 2 :" + (1 == 2));

        System.out.println("NEGAÇÃO ! - !true :" + (!true));

        System.out.println("DIFERENTE - 1 != 2 :" + (1 != 2));

        System.out.println("E (CURTO-CIRCUITO) - false && true :" + (false && true));

        System.out.println("OU (CURSTO-CIRCUITO) - false || true :" + (false || true));

        System.out.println("OU EXCLUSIVO - true ^ true :" + (true ^ true));

        double a,b,c;

        a = 0.1;
        b = 0.2;
        c = a + b;

        System.out.println(c);
    }
}
