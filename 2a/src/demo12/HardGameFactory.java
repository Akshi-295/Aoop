package demo12;
public class HardGameFactory extends GameFactory {
    @Override
    public Weapon createWeapon() {
        return new HardWeapon();
    }

    @Override
    public PowerUp createPowerUp() {
        return new HardPowerUp();
    }
}
