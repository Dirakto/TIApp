package com.dirakto.types

import com.dirakto.types.enums.Technology
import com.dirakto.types.enums.Trait

data class Planet(
    val id: Int,
    val name: String,
    val type: Trait,
    val resource: Int,
    val influence: Int,
    val specialty: Technology?
) {
    constructor() : this(0, "", Trait.CULTURAL, 0, 0, null)

    val score: Double = (resource + influence) / 3.0  + (specialty?.let { 1.25 } ?: 0.0)
}