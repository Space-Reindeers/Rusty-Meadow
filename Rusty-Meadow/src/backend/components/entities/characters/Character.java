public abstract class Character extends Entity {

    protected Statistics statistics;

    public Character(Statistics statistics) {
        this.statistics = statistics;
    } 

    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }   
}