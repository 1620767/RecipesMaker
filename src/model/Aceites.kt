package model

class Aceites(cantidad: Int) : Categorias(cantidad), ICrud {
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

    fun listAceites(): String{
        return "Aceite"
    }
}