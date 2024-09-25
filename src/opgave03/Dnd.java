package opgave03;

public class Dnd {
    public static void main(String[] args) {
        Hero hero = new Hero(60,15,50,"Garry Winthorp","his","belt");
        Monster monster = new Monster(100,10,20,"Big Ogre","Slams his club","him");
        fight(hero,monster);
    }

    public static void fight(Hero hero, Monster monster) {
        while (hero.lifePoints > 0 && monster.lifePoints > 0) {
            int roll = rollD100();
            hero.heroAttacks(roll, hero, monster);
            if (monster.lifePoints > 0) {
                roll = rollD100();
                monster.monsterAttacks(roll, hero, monster);
                System.out.println();
            }
        }
    }

//    private static void heroAttacks(int roll, Hero hero, Monster monster) {
//        System.out.print(hero.name + " attacks with " + hero.pronoun + " " + hero.weapon);
//        if (roll <= hero.chanceOfHit) {
//            System.out.println(" and hits the " + monster.description + " inflicting " + hero.damagePoints);
//            monster.lifePoints -= hero.damagePoints;
//            if (monster.lifePoints <= 0) {
//                System.out.println("killing the " + monster.description);
//            }
//        } else {
//            System.out.println(" but misses the target.");
//        }
//    }
//    private static void monsterAttacks(int roll, Hero hero, Monster monster) {
//        System.out.print("the " + monster.description + " " + monster.attackDescription);
//        if (roll <= monster.chanceOfHit) {
//            System.out.println(" inflicting " + monster.damagePoints + " damage");
//            hero.lifePoints -= monster.damagePoints;
//            if (hero.lifePoints <= 0) {
//                System.out.println("Slaying " + hero.name);
//            }
//        } else {
//            System.out.println(" but " + hero.name + " defends heroically");
//        }
//    }

    public static int rollD100() {
        return (int) (Math.random() * 100 + 1);
    }
}

