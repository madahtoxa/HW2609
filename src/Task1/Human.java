package Task1;

public class Human {


    private Integer yearOfBirth;
    private String name;
    private String town;
    private String job;

    public int getYearOfBirth() {
       return yearOfBirth;
    }
public Human(int yearOfBirth,String name, String town, String job){
        this.yearOfBirth=yearOfBirth;
        this.setName(name);
        this.setJob(job);
        this.setTown(town);
}
    public void setYearOfBirth(Integer yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        }else {
            this.yearOfBirth=yearOfBirth;
        }
        this.yearOfBirth=yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            this.name="no data";
        }else {
            this.name=name;
        }
    }

    public void setTown(String town) {
        if (town==null){
            this.town="no data";
        }else {
            this.town=town;
        }
    }

    public void setJob(String job) {
        if (job==null){
            this.job="no data";
        }else {
            this.job=job;
        }
    }

    @Override
    public String toString() {
        return "Привет! " +
                "Меня зовут " + name +
                ". Я из города " + town  +
                ". Я родился в " + yearOfBirth +
                " году. Я работаю на должности " + job +
                '}';
    }
}
