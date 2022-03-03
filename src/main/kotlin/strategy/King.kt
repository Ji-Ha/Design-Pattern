package strategy

class King(override var weapon: WeaponBehavior) : Character() {

    override fun setWeaponBehavior(weaponBehavior: WeaponBehavior) {
        this.weapon = weaponBehavior
    }
}