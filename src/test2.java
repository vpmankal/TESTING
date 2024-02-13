public class VowelConsonantCounter {
    public static void main(String[] args) {
        String input = "ABECDIOU";
        int vowelCount = 0;

        System.out.println("Result:");

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (isVowel(currentChar)) {
                System.out.print(currentChar);
                vowelCount++;
            } else if (Character.isLetter(currentChar)) {
                System.out.print(vowelCount);
            } else {
                System.out.print(currentChar);
            }
        }
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
