public class Squirtle extends Pokemon{
    public Squirtle() {
        //this.setLevel(1);
        this.level = 1;
        this.setHp(44);
        this.name = "꼬부기";
    }

    @Override
    void attack() {
        System.out.println(this.name + "이(가) 광역 물대포 공격을 시전합니다");
    }
}
