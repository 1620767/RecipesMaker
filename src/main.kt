fun main(args: Array<String>) {

    inicio@ menu()
    var opcion:String?

    inicio@ do {
        opcion= readLine()

        if (opcion == "1"){
            println("Empecemos")
        }else if (opcion == "2"){
            println("Este es el listado de recetas")
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