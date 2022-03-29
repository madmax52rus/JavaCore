package HomeWork1;

import java.util.Objects;
import java.lang.Object;

public class Main {
    public static void main(String[] args) {

        Team[] team = {
                new Team("Max", 500, 200),
                new Team("Michael", 300, 100),
                new Team("Mary", 230, 120),
                new Team("Eugen", 400, 300),
        };

        for (Team teams : team) {
            System.out.println(teams + "член команды " + Team.teamName);
        }

        for (Team teams : team) {
            if (teams.getRun() > 300 || teams.getSwim() > 100) {
                System.out.println(teams + " успешное преодоление полосы препятствий!");
            }
        }
        /** for (Team teams : team) {
            if(teams.getSwim() > 100) {
                System.out.println(teams + " успешно проплыл дистанцию!");
            }
        } **/
    }
}


