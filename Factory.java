interface FighterFactory {
    Fighter createFighter();
}

class SwordsmanFactory implements FighterFactory {
    @Override
    public Fighter createFighter() {
        Fighter fighter = new Fighter();
        fighter.setAttackStrategy(new SlashAttack());
        return fighter;
    }
}

class ArcherFactory implements FighterFactory {
    @Override
    public Fighter createFighter() {
        Fighter fighter = new Fighter();
        fighter.setAttackStrategy(new ArrowAttack());
        return fighter;
    }
}