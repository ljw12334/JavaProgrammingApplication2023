package version14;

public class NoFly implements Flyable{
    @Override
    public void fly() {
        System.out.println("날 수 없습니다");
    }
}
