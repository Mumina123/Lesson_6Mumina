public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        Boss boss = new Boss();
        boss.setHealth(5);
        boss.setDamage(10);
        weapon.setWeaponName("Ak");
        weapon.setWeaponType("Gan");
        boss.setWeapon(weapon);
        System.out.println(boss.getHealth());
        System.out.println(boss.getWeapon().getWeaponName());
        System.out.println(boss.getWeapon().getWeaponType());
        System.out.println(boss.getDamage());
    }
}