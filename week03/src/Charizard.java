public class Charizard extends Pokemon{
    public Charizard() {
        System.out.println("자식 클래스(리자몽)의 기본 생성자");
        this.level = 36;
//      this.setLevel(36);
        this.setHp(78);
        this.name = "리자몽";
    }

    public Charizard(int level, int hp, String name) {
        super(level, hp, name);  // 부모 클래스의 매개변수 생성자를 호출
        System.out.println("자식 클래스(리자몽)의 매개변수 생성자");
    }


    @Override
    public void attack() {
        //super.attack();
        System.out.println(this.name + "이(가) 광역 화염 공격을 시전합니다");
    }
}
