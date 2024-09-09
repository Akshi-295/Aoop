package demo12;
public class Main {
    public static void main(String[] args) {
        GameState gameState = GameState.getInstance();
        gameState.setLevel(1);
        gameState.setDifficulty("Easy");

        EnemyFactory enemyFactory;
        GameFactory gameFactory;

        if (gameState.getDifficulty().equals("Easy")) {
            enemyFactory = new EasyEnemyFactory();
            gameFactory = new EasyGameFactory();
        } else {
            enemyFactory = new HardEnemyFactory();
            gameFactory = new HardGameFactory();
        }

        Enemy enemy = enemyFactory.createEnemy();
        Weapon weapon = gameFactory.createWeapon();
        PowerUp powerUp = gameFactory.createPowerUp();

        enemy.attack();
        weapon.use();
        powerUp.activate();
    }
}

