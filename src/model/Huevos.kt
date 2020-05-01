package model

class Huevos (cantidad: Int) : Categorias(cantidad), ICrud{
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

    fun listHuevos(): String{
        return "Huevo"
    }
}