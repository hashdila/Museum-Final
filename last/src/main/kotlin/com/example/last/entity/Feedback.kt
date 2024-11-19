package com.example.last.entity

import jakarta.persistence.*


@Entity
@Table(name = "feedbacks")
data class Feedback(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "question1")
    var question1: String,

    @Column(name = "question2")
    var question2: String,

    @Column(name = "question3")
    var question3: String,

    // Continue for other questions...

    @Column(name = "comments")
    var comments: String? = null
)
