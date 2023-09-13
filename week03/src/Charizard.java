public class Charizard extends Pokemon{
    public Charizard() {
        this.level = 36;
//      this.setLevel(36);
        this.setHp(78);
        this.name = "리자몽";
    }

    @Override
    void attack() {
        //super.attack();
        System.out.println(this.name + "이(가) 광역 화염 공격을 시전합니다");
    }
}
