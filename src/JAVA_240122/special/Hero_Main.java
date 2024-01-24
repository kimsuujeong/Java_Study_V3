package JAVA_240122.special;

class Hero_Main {
    public static void main(String[] args) {
        Hero[] heroes = {new Superman("클라크"), new Spiderman("피터"), new Ironman("토니")};
        
        for (Hero hero : heroes) {
            System.out.println(hero.getName() + ":");
            hero.useSpecialAbility();
            System.out.println();
        }
    }
}