package model

class Frutas (cantidad: Int) : Categorias(cantidad), ICrud{

    override fun create(): String {
        return "Create"
    }

    override fun delete(): String {
        return "Delete"
    }

    override fun read(): String {
        return "Read"
    }

    override fun update(): String {
        return "Update"
    }

    fun ListFrutas(): String{
        var frutasList = """
               1. Fresa
               2. Plátano
               3. Uvas
               4. Manzana
               5. Naranja
               6. Pera
               7. Cereza

        """.trimIndent()
        return frutasList
    }
}