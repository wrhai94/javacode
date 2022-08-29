package chapter11;

public enum Week {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三");
    private String name;
    private Week(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}