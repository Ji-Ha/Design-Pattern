package factory

class NYPizzaIngredientFactory: PizzaIngredientFactory {
    override fun createDough(): String {
        return "ThinCrustDough"
    }

    override fun createSauce(): String {
        return "MarinaraSauce"
    }

    override fun createCheese(): String {
        return "ReggianoCheese"
    }

    override fun createVeggies(): ArrayList<String> {
        return mutableListOf("Garlic", "Onion") as ArrayList<String>
    }

    override fun createPepperoni(): String {
        return "SlicedPepperoni"
    }

    override fun createClam(): String {
        return "FreshClam"
    }
}