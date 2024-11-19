package com.example.last.repository

import com.example.last.entity.Feedback // Import the Feedback entity
import org.springframework.data.jpa.repository.JpaRepository

interface FeedbackRepository : JpaRepository<Feedback, Long>