package com.example.last.service

import com.example.last.entity.Feedback
import com.example.last.repository.FeedbackRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class FeedbackService(@Autowired private val feedbackRepository: FeedbackRepository) {

    fun saveFeedback(feedback: Feedback): Feedback {
        return feedbackRepository.save(feedback)
    }

    fun getAllFeedbacks(): List<Feedback> {
        return feedbackRepository.findAll()
    }
}
