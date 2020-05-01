package model

class Verduras (cantidad: Int) : Categorias(cantidad), ICrud{
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

    fun listVerdura(): String{
        return "Verduras"
    }
}