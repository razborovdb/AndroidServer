package ru.netology.nmedia.service

import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.springframework.data.repository.findByIdOrNull
import ru.netology.nmedia.dto.Flight
import ru.netology.nmedia.dto.Post
import ru.netology.nmedia.entity.PostEntity
import ru.netology.nmedia.exception.NotFoundException
import ru.netology.nmedia.repository.PostRepository
import java.time.OffsetDateTime

@Service
@Transactional
class FlightService(private val repository: PostRepository) {
    private var flights = listOf(
        Flight(
            fromTown = "Moscow",
            toTown = "Omsk",
            departureDate = "10/03/2023",
            arrivalDate =  "11/03/2023",
            price = 123.45,
        ),
        Flight(
            fromTown = "Omsk",
            toTown = "Voronez",
            departureDate = "12/03/2023",
            arrivalDate =  "13/03/2023",
            price = 1230.45,
        ),
        Flight(
            fromTown = "Omsk",
            toTown = "Sochi",
            departureDate = "14/03/2023",
            arrivalDate =  "15/03/2023",
            price = 12300.45,
        )

    )
    fun getAll(): List<Flight> = flights


}