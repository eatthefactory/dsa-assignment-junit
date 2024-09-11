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
        switch (num % 3) {
            case 0:
                return num + "is divisible by 3!";
            case 1:
                return num + "has a remainder of 1.";
            case 2:
                return num + "has a remainder of 2.";
        }

        return "Error!";
    }
}
