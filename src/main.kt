import model.Frutas

fun main(args: Array<String>) {

    menu()
    var opcion:String?
    var op: String?

    do {
        opcion= readLine()

        if (opcion == "1"){
            makeRecipe()
        }else if (opcion == "2"){
            viewRecipe()
            op= readLine()
            if (op == "5"){
                var frutas = Frutas(2)
                println(frutas.ListFrutas())
            }

        }else if (opcion=="3"){
            println("Bye")
        }else{
            println("Elije una opción valida")
        }

    }while (opcion != "3")


}

    fun menu(){
        val encabezado = """
            :: Bienvenido a Recipe Maker ::
            Selecciona la opción deseada
            
            1. Hacer una receta
            2. Ver mis recetas
            3. Salir
        """.trimIndent()

        println(encabezado);
    }

    fun makeRecipe(){
        val r ="""
            Hacer receta
            Selecciona por categoría el ingrediente que buscas
            1. Agua
            2. Leche
            3. Carne
            4. Verduras
            5. Frutas
            6. Cereal
            7. Huevos
            8. Aceites
        """.trimIndent()
        println(r)
    }

    fun viewRecipe(){
        val recetas = "Ver mis recetas"
        println(recetas)
    }