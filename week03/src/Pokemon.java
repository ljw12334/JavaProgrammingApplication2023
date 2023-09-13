public class Pokemon {
    //private int level;
    protected int level;
    private int hp;
    protected String name;

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

    void attack(){
        System.out.println(this.name + "이(가) 광역 도발 공격을 시전합니다");
    }
    void evolve(){  // 매개변수 제거
        this.level = this.level + 1;  // 매개변수 pokemon 대신에 this 사용
        this.hp = this.hp + 100;  // 레벨 업시 체력 +100
        String texts = """
                    name의 레벨이
                    level으로 증가!
                """.replace("level", this.level + "")  // pokemon 대신 this
                .replace("name", this.name);
        System.out.println(texts);
    }
}