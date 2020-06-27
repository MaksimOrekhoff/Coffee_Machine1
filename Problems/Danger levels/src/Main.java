enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);
    int store;

    DangerLevel(int level) {
        this.store = level;

    }
    public int getLevel() {
     return this.store;
    }
}

