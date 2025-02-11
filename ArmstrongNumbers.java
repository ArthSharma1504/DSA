public class ArmstrongNumbers {
    public static void main(String[] args) {
        int start = 1, end = 10000; // Define the range

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            if (isArmstrong(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num, sum = 0, digits = 0;
        
        // Count the number of digits
        int temp = num;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        // Compute the sum of digits raised to the power of the number of digits
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == originalNum;
    }
}
