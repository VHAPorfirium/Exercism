public class Annalyn {

    public class AnnalynsInfiltration {

        public static boolean canFastAttack(boolean knightIsAwake) {
            return !knightIsAwake;
        }

        public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
            // O espião pode observar se qualquer uma das pessoas está acordada
            return knightIsAwake || archerIsAwake || prisonerIsAwake;
        }

        public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
            // Só pode sinalizar para o prisioneiro se o arqueiro estiver dormindo e o prisioneiro acordado
            return !archerIsAwake && prisonerIsAwake;
        }

        public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
            // O prisioneiro pode ser libertado se o cachorro estiver presente e o arqueiro estiver dormindo,
            // ou se o prisioneiro estiver acordado e ambos o cavaleiro e o arqueiro estiverem dormindo.
            return (petDogIsPresent && !archerIsAwake) || (prisonerIsAwake && !knightIsAwake && !archerIsAwake);
        }

        public static void main(String[] args) {
            boolean knightIsAwake = true;
            System.out.println(AnnalynsInfiltration.canFastAttack(knightIsAwake)); // Esperado: false

            knightIsAwake = false;
            boolean archerIsAwake = true;
            boolean prisonerIsAwake = false;
            System.out.println(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake)); // Esperado: true

            archerIsAwake = false;
            prisonerIsAwake = true;
            System.out.println(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake)); // Esperado: true

            knightIsAwake = false;
            archerIsAwake = true;
            prisonerIsAwake = false;
            boolean petDogIsPresent = false;
            System.out.println(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent)); // Esperado: false
        }
    }


}
