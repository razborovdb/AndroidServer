package ru.netology.nmedia.controller

import org.springframework.web.bind.annotation.*
import ru.netology.nmedia.dto.Post
import ru.netology.nmedia.service.FlightService
import ru.netology.nmedia.service.PostService

@RestController
@RequestMapping("/api/flights")
class FlightController(private val service: FlightService) {
    @GetMapping
    fun getAll() = service.getAll()

}