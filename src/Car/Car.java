package Car;

public class Car {
    String name;
    int year;
    int timeRun;

    Car(String name, int year, int timeRun){
        this.name = name;
        this.year = year;
        this.timeRun = timeRun;
    }

    public String getName(){
        return name;
    }

    public int getYear(){
        return year;
    }

    public  int getTimeRun(){
        return timeRun;
    }
}