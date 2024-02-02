public class PetNotifications {
    public static void printMenu() {
        System.out.println("-".repeat(68));
        System.out.println("1. Покормить" + "\t2. Попоить" + "\t\t3. Уложить спать" + "\t4. Помыть");
        System.out.println("5. Полечить" + "\t\t6. Поиграть" + "\t\t7. Ждать" + "\t\t\t0. Выйти из игры");

    }

    public static void printPetNeeds(Pet pet) {
        System.out.println("ЕДА: " + pet.getFood() + "\t\t\tВОДА: " + pet.getWater() + "\t\tБОДРОСТЬ: " + pet.getSleep());
        System.out.println("ГИГИЕНА: " + pet.getHygiene() + "\t\tЗДОРОВЬЕ: " + pet.getHealth() + "\tНАСТРОЕНИЕ: " + pet.getMood());
    }

    public static void showActionsLimit(Pet pet) {
        System.out.println();
        System.out.println("Колличество доступных действий : " + pet.getActionsLimit());
    }

    public static void showNeedIncreased(Pet pet) {
        System.out.println(pet.getIncreased() + " увеличена на " + pet.getEditNeed());
        System.out.println();
    }

    public static void showNextDayNotification(Pet pet) {
        if (pet.getCountActions() == 5) {
            System.out.println("Новый день начался!");
        }
    }

    public static void showSickStatus(boolean status) {
        if (status) {
            System.out.println("Ваш питомец заболел. Здоровье уменьшено на 10 пунктов");
        }
    }

    public static void printGameOver() {
        System.out.println("\t\t\tИГРА ЗАКОНЧЕНА!");
    }

    public static void showLifeStatus(String status) {
        if (!status.equals("life")) {
            System.out.println(status);
        }
    }
}
