public class Main {
    public static void  main (String [] args) {

        String A1 = "tRue";
        String A2 = "120";
        String A3 = "32000";
        String A4 = "147895632";
        String A5 = "987654321987654321";
        String A6 = "4444.5d";
        String A7 = "2354.56f";
        Boolean tru = Boolean.parseBoolean(A1.toLowerCase());
        byte tru1 = Byte.parseByte(A2);
        short tru2 = Short.parseShort(A3);
        int tru3 = Integer.parseInt(A4);
        long tru4 = Long.parseLong(A5);
        double tru5 = Double.parseDouble(A6);
        float tru6 = Float.parseFloat(A7);



        System.out.println(tru);
        System.out.println(tru1);
        System.out.println(tru2);
        System.out.println(tru3);
        System.out.println(tru4);
        System.out.println(tru5);

    }
}