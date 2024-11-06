public class CarsAssemble {

    public static double productionRatePerHour(int speed) {
        double production = 0;

        if (speed <= 4) {
            production = speed * 221;
        } else if (speed <= 8) {
            production = speed * 221 * 0.9;
        } else if (speed == 9) {
            production = speed * 221 * 0.8;
        } else if (speed == 10) {
            production = speed * 221 * 0.77;
        } else {
            System.out.println("Valor fora do máximo.");
        }
        return production;
    }

    public static int workingItemsPerMinute(int speed) {
        int production = 0;

        if (speed <= 4) {
            production = speed * 221 / 60;
        } else if (speed <= 8) {
            production = (int) (speed * 221 * 0.9) / 60;
        } else if (speed == 9) {
            production = (int) (speed * 221 * 0.8) / 60;
        } else if (speed == 10) {
            production = (int) (speed * 221 * 0.77) / 60;
        } else {
            System.out.println("Valor fora do máximo.");
        }
        return production;
    }

    public static void main(String[] args) {
        System.out.println(CarsAssemble.productionRatePerHour(6));
        System.out.println(CarsAssemble.workingItemsPerMinute(6));
    }
}
