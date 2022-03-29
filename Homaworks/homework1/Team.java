package HomeWork1;

public class Team {

    private String name;
    private int swim;
    private int run;

    String runResult;
    String swimResult;

    public Team(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;

    }

    static String teamName = "Olympia";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    @Override
    public String toString() {
        return "Team {" +
                " name= '" + name + '\'' +
                '}';
    }
}
