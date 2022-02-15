package org.mapstruct.example.kotlin.model

import java.time.LocalDate

data class Person(
    var id: PersonId?,
    var firstName: String?,
    var lastName: String?,
    var phoneNumber: String?,
    var birthdate: LocalDate?
)

@JvmInline
value class PersonId(val id: String)
