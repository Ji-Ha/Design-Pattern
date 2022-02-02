package factory

class SimplePizzaFactory {
    fun createPizza(type: String): Pizza {
        lateinit var pizza: Pizza

        if(type == "cheese") {
            pizza = CheesePizza(NYPizzaIngredientFactory())
        }
//        } else if(type == "greek") {
//            pizza = GreekPizza()
//        }
//        } else if(type == "pepperoni") {
//            pizza = PepperoniPizza()
//        }

        return pizza
    }
}