import java.util.Scanner;

public class PokemonGame {
    public static void main(String[] args) {
        System.out.println("포켓몬 게임 시작!");
        Scanner scanner = new Scanner(System.in);
        int menu;
        Pokemon pokemon = null;

        while(true){
            System.out.println("메뉴");
            System.out.println("1. 포켓몬 생성");
            System.out.println("2. 내 포켓몬 정보 확인");
            System.out.println("3. 내 포켓몬 진화");
            System.out.println("4. 다른 포켓몬 공격");
            System.out.println("5. 종료");
            System.out.print("번호 선택 : ");
            menu = scanner.nextInt();

            switch (menu){
                case 1:
                    System.out.print("포켓몬 이름 입력 : ");
                    String name = scanner.next();
                    System.out.print("포켓몬 레벨 입력 : ");
                    int level = scanner.nextInt();
                    pokemon = new Pokemon(name, level);
                    System.out.println(pokemon.getName() + " 포켓몬 생성!");
                    break;
                case 2:
                    if(pokemon == null){
                        System.out.println("포켓몬을 가지고 있지 않습니다!");
                    }else{
                        System.out.println("이름: " + pokemon.getName());
                        System.out.println("레벨: " + pokemon.getLevel());
                        System.out.println("체력: " + pokemon.getHp());
                    }
                    break;
                case 3:
                    if(pokemon == null){
                        System.out.println("포켓몬을 가지고 있지 않습니다!");
                    }else{
                        pokemon.evolve(pokemon);
                        System.out.println(pokemon.getName() + " 진화함!");
                    }
                    break;
                case 4:
                    if(pokemon == null){
                        System.out.println("포켓몬을 가지고 있지 않습니다!");
                    }else{
                        Pokemon target = new Pokemon("파이리", 5);
                        pokemon.attack(target);
                        System.out.println(pokemon.getName()+"이(가) "+ target.getName() +"를 공격했습니다!");
                    }
                    break;
                case 5:
                    System.out.println("게임 종료!");
                    //break;
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
                    break;
            }
        }
    }
}
