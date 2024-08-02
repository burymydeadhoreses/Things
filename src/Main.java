import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static <T> boolean compareArrays(T[] firstArray, T[] secondArray) {
        if (firstArray.length != secondArray.length)
            return false;

        for (int i = 0; i < firstArray.length; i++) {
            if (!firstArray[i].getClass().equals(secondArray[i].getClass()))
                return false;
        }

        return true;
    }
}

