package es.baltajmn.pokeapi.lib.pokekotlin.client

class ErrorResponse(val code: Int, message: String) : Throwable("($code) $message")
