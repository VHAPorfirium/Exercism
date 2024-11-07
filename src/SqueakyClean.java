public class SqueakyClean {

    public static String clean(String input) {

        String result = input.replace(" ", "_");

        result = convertKebabToCamelCase(result);

        result = replaceLeetSpeak(result);

        result = removeNonLetterCharacters(result);

        return result;
    }

    private static String convertKebabToCamelCase(String input) {
        StringBuilder sb = new StringBuilder();
        boolean toUpperCase = false;
        for (char c : input.toCharArray()) {
            if (c == '-') {
                toUpperCase = true;
            } else {
                sb.append(toUpperCase ? Character.toUpperCase(c) : c);
                toUpperCase = false;
            }
        }
        return sb.toString();
    }

    private static String replaceLeetSpeak(String input) {
        return input.replace("4", "a")
                .replace("3", "e")
                .replace("0", "o")
                .replace("1", "l")
                .replace("7", "t");
    }

    // Método auxiliar para remover caracteres que não são letras
    private static String removeNonLetterCharacters(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c) || c == '_') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
         System.out.println(SqueakyClean.clean("my   Id"));
        System.out.println(SqueakyClean.clean("a-bc"));
        System.out.println(SqueakyClean.clean("H3ll0 W0rld"));
        System.out.println(SqueakyClean.clean("4 73s7"));
        System.out.println(SqueakyClean.clean("a$#.b"));
    }
}
