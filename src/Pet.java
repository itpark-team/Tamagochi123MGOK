import java.util.Random;

public class Pet {


    //region PetParams
    private int food;
    private int water;
    private int sleep;
    private int mood;
    private int health;
    private int hygiene;
    private boolean isLife;
    private int editNeed;
    private int sickRandomNumb;
    //endregion

    //region ActionsParams
    private int countActions;
    private int actionsLimit;
    private final Random random;
    private String increased;
    private boolean justWait;
    //endregion

    public Pet(int food, int water, int sleep, int mood, int health, int hygiene) {
        this.food = food;
        this.water = water;
        this.sleep = sleep;
        this.mood = mood;
        this.health = health;
        this.hygiene = hygiene;

        this.isLife = true;
        this.actionsLimit = 6;
        this.random = new Random();
        this.increased = "";
        this.justWait = false;
    }

    public void increaseCountActions() {
        countActions++;
    }

    public void decreaseActionsLimit() {
        actionsLimit--;
    }

    public void nextDayCheck() {
        if (countActions == 5) {

            countActions = 0;

            food -= random.nextInt(35);
            water -= random.nextInt(35);
            sleep -= random.nextInt(35);
            mood -= random.nextInt(35);
            health -= random.nextInt(35);
            hygiene -= random.nextInt(35);

            sickRandomNumb = random.nextInt(101);
            actionsLimit = 6;
        }
    }

    public boolean isLife() {
        return isLife;
    }

    public void increaseFood() {
        editNeed = random.nextInt(26);
        food += editNeed;
        countActions++;

        increased = "Еда";
    }

    public void increaseWater() {
        editNeed = random.nextInt(26);
        water += editNeed;
        countActions++;

        increased = "Вода";
    }

    public void increaseSleep() {
        editNeed = random.nextInt(26);
        sleep += editNeed;
        countActions++;

        increased = "Бодрость";

    }

    public boolean getSick() {
        sickRandomNumb = random.nextInt(101);
        if (countActions > 1 && sickRandomNumb > 80) {
            health -= 10;
            return true;
        }
        return false;
    }

    public void increaseHealth() {
        editNeed = random.nextInt(26);
        health += editNeed;
        countActions++;

        increased = "Здоровье";

    }

    public void increaseMood() {
        editNeed = random.nextInt(26);
        mood += editNeed;
        countActions++;

        increased = "Настроение";
    }

    public void increaseHygiene() {
        editNeed = random.nextInt(26);
        hygiene += editNeed;
        countActions++;

        increased = "Гигиена";
    }

    public String checkLifeStatus() {

        String status = "life";

        if (food > 100) {
            isLife = false;
            status = "Поздравляю! Ваш питомец умер от переедания.";
        } else if (food < 0) {
            isLife = false;
            status = "Поздравляю! Ваш питомец умер от голода.";
        }

        if (water > 100) {
            isLife = false;
            status = "Поздравляю! Ваш питомец умер от гипергидратации.";

        } else if (water < 0) {
            isLife = false;
            status = "Поздравляю! Ваш питомец умер от жажды.";
        }

        if (sleep > 100) {
            status = "Ваш питомец не хочет спать.";
            sleep = 100;
            countActions--;
            actionsLimit++;
        } else if (sleep < 0) {
            isLife = false;
            status = "Поздравляю! Ваш питомец умер от недосыпа.";
        }

        if (health > 100) {
            isLife = false;
            status = "Поздравляю! Ваш питомец стал бодибилдером и покинул дом.";
        } else if (health < 0) {
            isLife = false;
            status = "Поздравляю! Вы очень внимательный хозяин! Ваш питомец умер от белзни.";
        }

        if (hygiene > 100) {
            status = "Ваш питомец чист.";
            hygiene = 100;
            countActions--;
            actionsLimit++;
        } else if (hygiene < 0) {
            isLife = false;
            status = "Ваш питомец был слишком грязным, понимая это, при виде дождя он решил выпрыгнуть в окно и разбился.";
        }

        if (mood > 100) {
            status = "Ваш питомец не хочет играть.";
            mood = 100;
            countActions--;
            actionsLimit++;
        } else if (mood < 0) {
            isLife = false;
            status = "Ващ питомец был недоволен тем, что вы с ним не играли и покинул дом.";
        }

        return status;
    }

    public int getFood() {
        return food;
    }

    public int getWater() {
        return water;
    }

    public int getSleep() {
        return sleep;
    }

    public int getMood() {
        return mood;
    }

    public int getHealth() {
        return health;
    }

    public int getHygiene() {
        return hygiene;
    }

    public int getEditNeed() {
        return editNeed;
    }

    public int getActionsLimit() {
        return actionsLimit;
    }

    public String getIncreased() {
        return increased;
    }

    public boolean isJustWait() {
        return justWait;
    }

    public void setJustWait(boolean justWait) {
        this.justWait = justWait;
    }

    public int getCountActions() {
        return countActions;
    }
}

