package com.example.examen.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

data class Transaccion(
    val negocio: String,
    val categoria: String,
    val cantidad: Double,
    val hora: String,
    val icono: ImageVector
)

val listaTransacciones = listOf(
    Transaccion("Walmart", "Despensa", -850.0, "10:30 AM", Icons.Default.ShoppingCart),
    Transaccion("Shell", "Gasolina", -1200.0, "11:15 AM", Icons.Default.LocalGasStation),
    Transaccion("Apple Store", "Electrónica", -25000.0, "12:00 PM", Icons.Default.Tv),
    Transaccion("Amazon", "Libros", -450.0, "02:30 PM", Icons.Default.MenuBook),
    Transaccion("Starbucks", "Restaurantes", -120.0, "04:45 PM", Icons.Default.LocalCafe),
    Transaccion("Devolución", "Comida", 500.0, "06:00 PM", Icons.Default.Restaurant),
    Transaccion("Walmart", "Despensa", -320.0, "Ayer", Icons.Default.ShoppingCart),
    Transaccion("Uber", "Transporte", -80.0, "Ayer", Icons.Default.LocalTaxi),
    Transaccion("Oxxo", "Despensa", -45.0, "Ayer", Icons.Default.ShoppingCart),
    Transaccion("Nomina", "Ingreso", 15000.0, "Hace 2 días", Icons.Default.AccountBalance),
    Transaccion("CFE", "Servicios", -400.0, "Hace 2 días", Icons.Default.Lightbulb)
)