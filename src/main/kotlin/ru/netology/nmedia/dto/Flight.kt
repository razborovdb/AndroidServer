package ru.netology.nmedia.dto

data class Flight (
    val fromTown: String,
    val toTown: String,
    val departureDate: String,
    val arrivalDate: String,
    val price: Double,
)

