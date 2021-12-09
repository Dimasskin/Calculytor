public class Converter {
    static int toArabic(String a) throws Exception {
        if (a.equalsIgnoreCase("I")) return 1;
        if (a.equalsIgnoreCase("II")) return 2;
        if (a.equalsIgnoreCase("III")) return 3;
        if (a.equalsIgnoreCase("IV")) return 4;
        if (a.equalsIgnoreCase("V")) return 5;
        if (a.equalsIgnoreCase("VI")) return 6;
        if (a.equalsIgnoreCase("VII")) return 7;
        if (a.equalsIgnoreCase("VIII")) return 8;
        if (a.equalsIgnoreCase("IX")) return 9;
        if (a.equalsIgnoreCase("X")) return 10;
            else {
            throw new Exception("введённое число/числа не от 1 до 10");

        }
    }

    static String toRome(Integer conv){
        int[] arabDigit = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romeDigit = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();
            for (int i = 0; i<arabDigit.length; i++){
                while ((conv - arabDigit[i]) >= 0){
                conv -= arabDigit[i];
                result.append(romeDigit[i]);
            }
        }
        return result.toString();
    }
}
