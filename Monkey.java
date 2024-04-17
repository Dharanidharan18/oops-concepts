package com.chainsys.mario;

public class Monkey extends Enemy {
	
	String enemyType;
	

	public String getEnemyType() {
		return enemyType;
	}

	public void setEnemyType(String enemyType) {
		this.enemyType = enemyType;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Enemy enemy = new Enemy();
        Monkey monkey = new Monkey();  
        
        enemy.setHealth(100);
        enemy.setEnemyName("Monkey");
        enemy.setEnemyType("Easy");
        monkey.setEnemyType("Ground");
        enemy.setPositionLevel(1);
        
        
        System.out.println("Enemy Details:");
        System.out.println("Health: " + enemy.getHealth());
        System.out.println("Name: " + enemy.getEnemyName());
        System.out.println("Type: " + enemy.getEnemyType());
        System.out.println("Type: " + monkey.getEnemyType());
        System.out.println("Enemy Level: " + enemy.getPositionLevel());
        
        enemy.setEnemyName("Monkey");
        enemy.move();
	}

}
