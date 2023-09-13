package version14;
public class PokemonGame {
    public static void main(String[] args) {
//        Pokemon p0 = new Pokemon();
//        p0.attack();
//        p0.evolve();

        Squirtle s1 = new Squirtle();
        Pikachu p1 = new Pikachu();
        Pokemon c1 = new Charizard();  // upcast

        s1.setFlyable(new NoFly());
        p1.setFlyable(new NoFly());
        c1.setFlyable(new Wings());

        p1.performFly();
        c1.performFly();
        s1.performFly();

        JetPack jetPack = new JetPack();
        p1.setFlyable(jetPack);  // NoFly 객체 -> JetPack 객체로
        p1.performFly();

        Balloon balloon = new Balloon();
        s1.setFlyable(balloon);
        s1.performFly();

//        c1.attack();
//        c1.evolve();
//        //c1.type();  // 부모 클래스의 변수로는 자식 클래스의 전용 메서드를 볼 수 없다.
//        // 리자몽 객체이지만 참조하는 변수가 포켓몬 추상클래스의 c1 변수로 자식 클래스 전용 메서드는 사용 불가
//
//        Charizard c2 = (Charizard)c1;  // downcast
//        c2.type();
//        c2.evolve();
//
//        //s1.evolve();
//        p1.attack();
//        s1.attack();
    }
}
