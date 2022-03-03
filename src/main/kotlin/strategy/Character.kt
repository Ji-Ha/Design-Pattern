package strategy

abstract class Character {
    abstract var weapon: WeaponBehavior

    fun fight() {
        weapon.useWeapon()
    }

    abstract fun setWeaponBehavior(weaponBehavior: WeaponBehavior)
}