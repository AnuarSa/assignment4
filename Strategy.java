interface AttackStrategy {
    void performAttack();
}

class PunchAttack implements AttackStrategy {
    @Override
    public void performAttack() {
        System.out.println("Performing Punch Attack!");
    }
}

class KickAttack implements AttackStrategy {
    @Override
    public void performAttack() {
        System.out.println("Performing Kick Attack!");
    }
}

class Fighter {
    private AttackStrategy attackStrategy;

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void executeAttack() {
        attackStrategy.performAttack();
    }
}
