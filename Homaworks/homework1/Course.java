package HomeWork1;

public class Course {
    private int runDist = 300;
    private int swimDist = 120;

    public Course(int runDist, int swimDist) {
        this.runDist = runDist;
        this.swimDist = swimDist;
    }
    String runResult;
    public int getRunDist() {
        return runDist;
    }

    public void setRunDist(int runDist) {
        this.runDist = runDist;
    }

    public int getSwimDist() {
        return swimDist;
    }

    public void setSwimDist(int swimDist) {
        this.swimDist = swimDist;
    }
}
