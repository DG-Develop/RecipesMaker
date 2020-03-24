import sun.security.ec.point.ProjectivePoint

fun main(args: Array<String>) {

    println(":: Bienvenio a Recipe Maker ::\n\n")

    var response: String?
    do{
        menu()
        response = readLine()

        when (response) {
            "1" ->  makeRecipe()
            "2" -> viewRecipe()
            "3" -> println("Saliendo!...")
            else -> println("Por favor ingrese los valores adecuados!!")
        }
    }while(response != "3")
}

fun menu(){
//Raw String
    println("""
        Selecciona la opción deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent())
}
fun makeRecipe(){
    println("""
        Hacer receta 
        Selecciona por categoría el ingrediente que buscas
        1. Agua
        2. Leche
        3. Carne
        4. Verduras
        5. Futas
        6. Cereal
        7. Huevos 
        8. Aceite
    """.trimIndent())
}

fun viewRecipe(){
    println("Ver mis recetas")
}