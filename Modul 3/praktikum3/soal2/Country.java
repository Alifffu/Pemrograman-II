package praktikum3.soal2;

public class Country {
    private String name;
    private String leadershipType;
    private String leaderName;
    private int independenceDay;
    private int independenceMonth;
    private int independenceYear;

    public Country(String name, String leadershipType, String leaderName, int independenceDay, int independenceMonth, int independenceYear) {
        this.name = name;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
        this.independenceDay = independenceDay;
        this.independenceMonth = independenceMonth;
        this.independenceYear = independenceYear;
    }

    public Country(String name, String leadershipType, String leaderName) {
        this.name = name;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
    }

    public String getName() {
        return name;
    }

    public String getLeadershipType() {
        return leadershipType;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public int getIndependenceDay() {
        return independenceDay;
    }

    public int getIndependenceMonth() {
        return independenceMonth;
    }

    public int getIndependenceYear() {
        return independenceYear;
    }
}