package com.example.examen.models

import androidx.compose.ui.graphics.Color
import com.example.examen.ui.theme.AzulFondo
import com.example.examen.ui.theme.VerdeFondo
import com.example.examen.ui.theme.NaranjaFondo

data class TarjetaR(val titulo: String, val monto: String, val colorFondo: Color)

val listaTarjetas = listOf(
    TarjetaR("Actividad", "$1,200", AzulFondo),
    TarjetaR("Ventas", "$8,500", VerdeFondo),
    TarjetaR("Ganancias", "$3,200", NaranjaFondo)
)