import sun.security.ec.point.ProjectivePoint

fun main(args: Array<String>) {

    println(":: Bienvenio a Recipe Maker ::\n\n")

    //Raw String
    println("""
        Selecciona la opción deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent())

    //Lista de ingredientes
    val listaIngredientes: List<String> = listOf<String>(
        "1. Agua",
        "2. Leche",
        "3. Carne",
        "4. Verduras",
        "5. Frutas",
        "6. Cereal",
        "7. Huevos",
        "8. Aceite")

    var listaIngredientesFinales: MutableList<String?> = mutableListOf()

    var response: String? = readLine()

    while(response != "3"){
        when(response){
            "1" ->{

                    var addIngrediente: String?

                    do{
                        println("Agrega ingredientes\n")


                        for (ingrediente in listaIngredientes){
                            println(ingrediente)
                        }
                        println("9. Salir")

                        addIngrediente = readLine()
                            when(addIngrediente) {
                                "1" -> listaIngredientesFinales.add(listaIngredientes.get(0))
                                "2" -> listaIngredientesFinales.add(listaIngredientes.get(1))
                                "3" -> listaIngredientesFinales.add(listaIngredientes.get(2))
                                "4" -> listaIngredientesFinales.add(listaIngredientes.get(3))
                                "5" -> listaIngredientesFinales.add(listaIngredientes.get(4))
                                "6" -> listaIngredientesFinales.add(listaIngredientes.get(5))
                                "7" -> listaIngredientesFinales.add(listaIngredientes.get(6))
                                "8" -> listaIngredientesFinales.add(listaIngredientes.get(7))
                            }
                    }while(addIngrediente != "9")

                println("La lista de ingredientes finales es:")
                for (ingredienteFinal in listaIngredientesFinales){
                    println(ingredienteFinal)
                }

                    println("\n")
                }
            "2" ->{
                    for (ingrediente in listaIngredientes){
                        println(ingrediente)
                    }
                    println("\n")
                }
            else -> println("Por favor ingrese los valores adecuados!!")
        }
        println("""
            Selecciona la opción deseada
            1. Hacer una receta
            2. Ver mis recetas
            3. Salir
        """.trimIndent())

        response = readLine()
    }
}