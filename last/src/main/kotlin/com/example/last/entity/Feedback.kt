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

    @Column(name = "question4")
    var question4: String,

    @Column(name = "question5")
    var question5: String,

    @Column(name = "question6")
    var question6: String,

    @Column(name = "question7")
    var question7: String,

    @Column(name = "question8")
    var question8: String,

    @Column(name = "question9")
    var question9: String,

    @Column(name = "question10")
    var question10: String,

    // Continue for other questions...

    @Column(name = "comments")
    var comments: String? = null
)
