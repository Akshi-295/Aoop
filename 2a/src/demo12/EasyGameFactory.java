package demo12;
public class EasyGameFactory extends GameFactory {
    @Override
    public Weapon createWeapon() {
        return new EasyWeapon();
    }

    @Override
    public PowerUp createPowerUp() {
        return new EasyPowerUp();
    }
}
