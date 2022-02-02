package factory

class CheesePizza(
    private val pizzaIngredientFactory: PizzaIngredientFactory
    ): Pizza() {

    override var name: String = "1KG 치즈 피자"
    override lateinit var dough: String
    override lateinit var sauce: String
    override lateinit var toppings: ArrayList<String>

    override fun prepare() {
        println("맛있는 " + name + "준비 중")
        dough = pizzaIngredientFactory.createDough()
        sauce = pizzaIngredientFactory.createSauce()
        toppings = pizzaIngredientFactory.createVeggies()
    }

    override fun cut() {
        println("치즈 피자 맛있겠다.")
    }
}