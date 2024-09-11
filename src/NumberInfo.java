public class NumberInfo {
    public static String isEvenAndHowManyThrees(int num) {
        if(isEven(num)) {
            return num + "is even.\n" + threeDivisionMessage(num);
        }
        else {
            return num + "is not even.\n" + threeDivisionMessage(num);
        }
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) return true;
        else return false;
    }

    public static String threeDivisionMessage(int num) {
        return switch (num % 3) {
            case 0 -> num + "is divisible by 3!";
            case 1 -> num + "has a remainder of 1.";
            case 2 -> num + "has a remainder of 2.";
            default -> "Error!";
        };
    }
}
