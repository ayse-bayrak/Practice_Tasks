package day14_for_loop;

class SumOfDigits {
    public static void main(String[] args) {
        String input = "A1B2C3";
        int sum = calculateSumOfDigits(input);
        System.out.println("Output: " + sum);
    }

    private static int calculateSumOfDigits(String input) {
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);

            // Check if the character is a digit
            if (Character.isDigit(character)) {
                // Convert char to int by subtracting the ASCII value of '0'
                int digit = character - '0';
                sum += digit;
            }
        }

        return sum;
    }
}
