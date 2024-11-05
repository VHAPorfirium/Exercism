public class Lasagna {

    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutesInOven) {
        return expectedMinutesInOven() - minutesInOven;
    }

    public int preparationTimeInMinutes(int minutesInOven) {
        return 2 * minutesInOven;
    }

    public int totalTimeInMinutes(int preparationTimeInMinutes, int minutesInOven ) {
        return (preparationTimeInMinutes * 2) + minutesInOven;
    }

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        int minutes = lasagna.expectedMinutesInOven();
        System.out.println("Expected minutes in oven: " + minutes);

        int remainingMinutes = lasagna.remainingMinutesInOven(30);
        System.out.println("Remaining minutes in oven: " + remainingMinutes);

        int preparationTimeInMinutes = lasagna.preparationTimeInMinutes(2);
        System.out.println("Preparation time in oven: " + preparationTimeInMinutes);

        int totalTimeInMinutes = lasagna.totalTimeInMinutes(3, 20);
        System.out.println("Total time in oven: " + totalTimeInMinutes);

    }
}