package Example2;

public class Button {
    private int milan = 0, real = 0;
    private String last = "N/A";
    public String getMilan() {
        return "AC Milan";
    }
    public String getReal() {
        return "Real Madrid";
    }
    public int getGoalsMilan() {
        return milan;
    }
    public int getGoalsReal() {
        return real;
    }
    public void incMilan() {
        last = "AC Milan";
        milan++;
    }
    public void incReal() {
        last = "Real Madrid";
        real++;
    }
    public String getLast() {
        return last;
    }
    public String getWin() {
        if (milan == real) return "DRAW";
        else if (milan > real) return "AC Milan";
        else return "Real Madrid";
    }
}
