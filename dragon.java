package com.chainsys.mario;

public class Dragon extends Enemy {

	String enemyType;
	

	public String getEnemyType() {
		return enemyType;
	}

	public void setEnemyType(String enemyType) {
		this.enemyType = enemyType;
	}
	
	
	public void move() {
        System.out.println(this.getEnemyName() + " is attacking the player from the Air!");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Enemy enemy = new Enemy();
        Dragon dragon = new Dragon();  
        
        enemy.setHealth(100);
        dragon.setEnemyName("Dragon");
        enemy.setEnemyType("Hard");
        dragon.setEnemyType("Air");
        enemy.setPositionLevel(3);  
        
//        System.out.println("\nDragon Details:");
//        System.out.println(dragon);
        
        
        System.out.println("Enemy Details:");
        System.out.println("Health: " + enemy.getHealth());
        System.out.println("Name: " + dragon.getEnemyName());
        System.out.println("Type: " + enemy.getEnemyType());
        System.out.println("Type: " + dragon.getEnemyType());
        System.out.println("Enemy Level: " + enemy.getPositionLevel());
        
        dragon.move();

	}

}
