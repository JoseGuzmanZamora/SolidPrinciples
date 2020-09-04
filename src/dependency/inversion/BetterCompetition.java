package dependency.inversion;

public class BetterCompetition implements BaseCompetition {
    public int totalScore = 0;
    public boolean status = true;

    @Override
    public void addToScore() {
        if(this.status) {
            this.totalScore ++;
        }else{
            System.out.println("Sorry, you are disqualified...");
        }
    }

    @Override
    public void subtractFromScore() {
        if(this.totalScore > 0){
            this.totalScore --;
        }else{
            this.status = false;
            System.out.println("Sorry, you are disqualified...");
        }
    }

    @Override
    public void calculateTotalScore() {
        if(status){
            System.out.println("Congratulations, your score is: " + this.totalScore);
        }else{
            System.out.println("Sorry, you are disqualified...");
        }
    }
}
