package com.example.examen.models

data class Transaccion(
    val negocio: String,
    val categoria: String,
    val cantidad: Double,
    val hora: String,
    val urlImagen: String
)

val listaTransacciones = listOf(
    Transaccion("Walmart", "Despensa", -850.0, "10:30 AM", "https://picsum.photos/id/1/100/100"),
    Transaccion("Shell", "Gasolina", -1200.0, "11:15 AM", "https://picsum.photos/id/2/100/100"),
    Transaccion("Apple Store", "Electrónica", -25000.0, "12:00 PM", "https://picsum.photos/id/3/100/100"),
    Transaccion("Amazon", "Libros", -450.0, "02:30 PM", "https://picsum.photos/id/4/100/100"),
    Transaccion("Starbucks", "Restaurantes", -120.0, "04:45 PM", "https://picsum.photos/id/5/100/100"),
    Transaccion("Devolución", "Comida", 500.0, "06:00 PM", "https://picsum.photos/id/6/100/100")
)