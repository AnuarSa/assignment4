public class Main {
    public static void main(String[] args) {
        // creating fighters using the factory
        FighterFactory swordsmanFactory = new SwordsmanFactory();
        Fighter swordsman = swordsmanFactory.createFighter();

        FighterFactory archerFactory = new ArcherFactory();
        Fighter archer = archerFactory.createFighter();

        // adding observers
        FightObserver consoleObserver = new ConsoleFightObserver();
        swordsman.addObserver(consoleObserver);
        archer.addObserver(consoleObserver);

        // making a fight simulation
        swordsman.executeAttack();
        archer.executeAttack();
    }
}