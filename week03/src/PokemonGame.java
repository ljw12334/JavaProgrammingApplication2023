class Pokemon {
    // fields, 멤버 변수, 속성
    // 캡슐화
    private String name;
    private int level;
    private int hp;

    // constructor, 생성자(특수 형태의 메서드)
    // 리턴타입이 없으며 클래스의 이름과 같다
    Pokemon(){
        System.out.println("포켓몬 객체 생성!");
    }

    // alt+insert


    public String getName() {
        return name;
    }
    // 실행된다. 하지만 매개변수 n은 여러 의미를 가질 수 있으므로
    // n보다는 명확한 의미의 name을 사용해야 한다
//    public void setName(String n) {
//        this.name = n;
//    }
    public void setName(String name) {
        //name = name;
        // this는 실행시점의 객체 메모리 번지 주소를 의미한다.
        this.name = name;   // this 키워드를 사용하므로써 매개변수와 멤버변수(필드)를 구분할 수 있다.
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    // methods, 멤버 함수, 행위
    void evolve(Pokemon pokemon){
        pokemon.level = pokemon.level + 1;
        System.out.println(pokemon.name + "의 레벨이 " + pokemon.level + "으로 증가!");
    }
}


public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        Pokemon charizard = new Pokemon();

//        pikachu.name = "피카츄";
//        charizard.name = "리자몽";
        pikachu.setName("피카츄");
        charizard.setName("리자몽");

        pikachu.setLevel(3);
        pikachu.setHp(100);

        charizard.setLevel(36);
        charizard.setHp(800);

        System.out.println(charizard.getName() + "의 체력은 " + charizard.getHp() + "이고 레벨은 " + charizard.getLevel() + "입니다");
        charizard.evolve(charizard);
        pikachu.evolve(pikachu);
        pikachu.evolve(pikachu);
    }
}
