public class Monster implements IMonster {
    private String name;
    private int health;
    private int maxHealth;
    private float weight;
    private int baseAttack;
    private float attackMultiplier;

    public Monster(String name, int maxHealth, float weight, int baseAttack, float attackMultiplier) {
        this.name = name;

        // Ensure maxHealth is at least 1
        this.maxHealth = Math.max(maxHealth, 1);
        // Initialize health to maxHealth
        this.health = this.maxHealth;

        // Ensure weight is positive and not zero
        this.weight = Math.max(weight, 0.1f);

        this.baseAttack = baseAttack;

        // Cap attackMultiplier if out of bounds
        if (attackMultiplier < -2.0 || attackMultiplier > 5.0) {
            System.out.println("Invalid attack multiplier");
            if (attackMultiplier < -2.0) {
                System.out.println("Attack multiplier was set to -2.0. given: " + attackMultiplier);
                this.attackMultiplier = -2.0f; // Cap the minimum
            } else {
                System.out.println("Attack multiplier was set to 5.0. given: " + attackMultiplier);
                this.attackMultiplier = 5.0f; // Cap the maximum
            }
        } else {
            this.attackMultiplier = attackMultiplier;
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public int getMaxHealth() {
        return this.maxHealth;
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }

    @Override
    public void receiveDamage(int damage) {
        if (this.getWeight() > 13.37f) {
            damage = (int) (damage * 0.8);
        }
        this.health -= damage;
        if (this.health <= 0) {
            this.health = 0;
        }

        if (this.health > this.maxHealth) {
            this.health = this.maxHealth;
        }
    }

    @Override
    public int getBaseAttack() {
        return this.baseAttack;
    }

    @Override
    public int getAttack() {
        return (int) (this.baseAttack * this.attackMultiplier);
    }

    @Override
    public float getWeight() {
        return this.weight;
    }

    @Override
    public void setAttackMultiplier(float multiplier) {
        if (multiplier < -2.0) {
            multiplier = -2.0f; // Cap the minimum
        } else if (multiplier > 5.0) {
            multiplier = 5.0f; // Cap the maximum
        }
        this.attackMultiplier = multiplier;
    }
}
