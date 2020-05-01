package model

class Cereales (cantidad: Int) : Categorias(cantidad), ICrud{
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

    fun listCereales(): String{
        var cereales = """
                1. Avena
                2. Trigo
                3. Arroz
                4. Maiz

        """.trimIndent()
        return cereales
    }
}