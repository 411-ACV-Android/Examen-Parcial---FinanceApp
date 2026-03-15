package com.example.examen.models

import androidx.compose.ui.graphics.Color

data class TarjetaR(val titulo: String, val monto: String, val colorFondo: Color)

val listaTarjetas = listOf(
    TarjetaR("Actividad", "$1,200", Color(0xFFE3F2FD)),
    TarjetaR("Ventas", "$8,500", Color(0xFFE8F5E9)),
    TarjetaR("Ganancias", "$3,200", Color(0xFFFFF3E0))
)