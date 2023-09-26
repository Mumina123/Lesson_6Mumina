public class Boss extends GameEntity {

    private Weapon weapon = new Weapon();

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
