package factory

interface PizzaIngredientFactory {

    fun createDough(): String
    fun createSauce(): String
    fun createCheese(): String
    fun createVeggies(): ArrayList<String>
    fun createPepperoni(): String
    fun createClam(): String
}