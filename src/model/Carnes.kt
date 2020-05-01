package model

class Carnes (cantidad: Int) : Categorias(cantidad), ICrud{
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

    fun listCarnes(): String{
        var carnesList= ("""
            1. Res
            2. Pollo
            3. Pescado
        """.trimIndent()).trimIndent()

        return carnesList
    }
}