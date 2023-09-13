public class Pokemon {
    // fields, 멤버 변수, 속성
    String name;
    int level;
    int hp;

    // constructor, 생성자(특수 형태의 메서드)
    // 리턴타입이 없으며 클래스의 이름과 같다
    Pokemon(){
        System.out.println("포켓몬 객체 생성!");
    }

    // methods, 멤버 함수, 행위
    void evolve(int level){
        level = level + 1;
        System.out.println("포켓몬스터의 레벨이 증가 : " + level);
    }
}
