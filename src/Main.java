public class Main {
    public static void main(String[] args) {
        Util.printlnMessage(" \t\tВЫ ЗАПУСТИЛИ ТАМАГОЧИ ");
        Util.printlnEnter();

        Pet pet = new Pet(50, 50, 50, 50, 50, 50);

        while (pet.isLife()) {
            PetNotifications.printPetNeeds(pet);
            PetNotifications.printMenu();

            pet.decreaseActionsLimit();
            PetNotifications.showActionsLimit(pet);

            int action = Util.inputInt("Выбирите действие: ", 0, 7);

            Util.printlnEnter();

            pet.setJustWait(false);

            switch (action) {
                case 1: {
                    pet.increaseFood();
                }
                break;
                case 2: {
                    pet.increaseWater();
                }
                break;
                case 3: {
                    pet.increaseSleep();
                }
                break;
                case 4: {
                    pet.increaseHygiene();
                }
                break;
                case 5: {
                    pet.increaseHealth();
                }
                break;
                case 6: {
                    pet.increaseMood();
                }
                break;
                case 7: {
                    pet.increaseCountActions();
                    pet.setJustWait(true);
                }
                case 0: {
                    System.exit(0);
                }
                break;
            }

            if (!pet.isJustWait()) {
                Util.screenClean();
                PetNotifications.showNeedIncreased(pet);
            }

            PetNotifications.showNextDayNotification(pet);

            boolean sickStatus = pet.getSick();
            PetNotifications.showSickStatus(sickStatus);

            pet.nextDayCheck();

            String lifeStatus = pet.checkLifeStatus();
            PetNotifications.showLifeStatus(lifeStatus);
        }
        PetNotifications.printPetNeeds(pet);

        PetNotifications.printGameOver();
    }
}