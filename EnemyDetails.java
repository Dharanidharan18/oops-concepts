package com.chainsys.mario;

public class EnemyDetails {

    public static void main(String[] args) {
        
        Dragon dragon = new Dragon();
        Monkey monkey = new Monkey();
        Octopus octopus = new Octopus();

        monkey.setHealth(100);
        monkey.setEnemyName("Spider Mokey");
        monkey.setEnemyType("Easy");
        monkey.setEnemyType("Ground");
        monkey.setPositionLevel(1);

        octopus.setHealth(100);
        octopus.setEnemyName("Doc Occ");
        octopus.setEnemyType("Medium");
        octopus.setEnemyType("Water");
        octopus.setPositionLevel(2);
        
        dragon.setHealth(100);
        dragon.setEnemyName("Sting Fly");
        dragon.setEnemyType("Hard");
        dragon.setEnemyType("Air");
        dragon.setPositionLevel(3);


        System.out.println("\nMonkey Details:");
        System.out.println("Health: " + monkey.getHealth());
        System.out.println("Name: " + monkey.getEnemyName());
        System.out.println("Type: " + monkey.getEnemyType());
        System.out.println("Enemy Level: " + monkey.getPositionLevel());
        monkey.move();

        System.out.println("\nOctopus Details:");
        System.out.println("Health: " + octopus.getHealth());
        System.out.println("Name: " + octopus.getEnemyName());
        System.out.println("Type: " + octopus.getEnemyType());
        System.out.println("Enemy Level: " + octopus.getPositionLevel());
        octopus.move();
        
        System.out.println("\nDragon Details:");
        System.out.println("Health: " + dragon.getHealth());
        System.out.println("Name: " + dragon.getEnemyName());
        System.out.println("Type: " + dragon.getEnemyType());
        System.out.println("Enemy Level: " + dragon.getPositionLevel());
        dragon.move();
    }
}
