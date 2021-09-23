package com.example.jdbc.movie;

import com.example.jdbc.actor.Actor;

import java.time.LocalDate;
import java.util.List;

public record MovieRequest(String name,
                           List<Actor> actors,
                           LocalDate releaseDate) {
}
