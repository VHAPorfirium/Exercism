public class BirdWatcher {
    private int[] birdsPerDay;
    private static final int[] LAST_WEEK_COUNTS = {0, 2, 5, 3, 7, 8, 4};

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    public int[] getLastWeek() {
        return LAST_WEEK_COUNTS;
    }

    public int getToday() {
        if (birdsPerDay.length == 0) {
            return 0;
        }
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        if (birdsPerDay.length > 0) {
            birdsPerDay[birdsPerDay.length - 1]++;
        }
    }

    public boolean hasDayWithoutBirds() {
        for (int count : birdsPerDay) {
            if (count == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for (int i = 0; i < Math.min(numberOfDays, birdsPerDay.length); i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int count : birdsPerDay) {
            if (count >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }

    public static void main(String[] args) {
        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);

        System.out.println(java.util.Arrays.toString(birdCount.getLastWeek()));
        System.out.println(birdCount.getToday());
        birdCount.incrementTodaysCount();
        System.out.println(birdCount.getToday());
        System.out.println(birdCount.hasDayWithoutBirds());
        System.out.println(birdCount.getCountForFirstDays(4));
        System.out.println(birdCount.getBusyDays());
    }
}
