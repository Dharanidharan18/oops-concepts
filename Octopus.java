package com.chainsys.mario;

public class Octopus extends Enemy {

    String enemyType;

    public String getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
    }

    @Override
    public void move() {
        System.out.println(this.getEnemyName() + " is attacking the player from the Water!");
    }

    public static void main(String[] args) {
        
        Octopus octopus = new Octopus();

        
        octopus.setHealth(100);
        octopus.setEnemyName("Octopus");
        octopus.setEnemyType("Medium");
        octopus.setEnemyType("Water");
        octopus.setPositionLevel(2);

        
        System.out.println("Enemy Details:");
        System.out.println("Health: " + octopus.getHealth());
        System.out.println("Name: " + octopus.getEnemyName());
        System.out.println("Type: " + octopus.getEnemyType());
        System.out.println("Enemy Level: " + octopus.getPositionLevel());

        octopus.move();
    }
}
