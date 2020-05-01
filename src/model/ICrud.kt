package model

interface ICrud {
    fun create (): String
    fun read (): String
    fun update(): String
    fun delete(): String
}