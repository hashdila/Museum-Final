package com.example.last.controller

import com.example.last.entity.Feedback
import com.example.last.service.FeedbackService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/feedback")
class FeedbackController(@Autowired private val feedbackService: FeedbackService) {

    @PostMapping("/submit")
    fun submitFeedback(@RequestBody feedback: Feedback): Feedback {
        return feedbackService.saveFeedback(feedback)
    }

    @GetMapping("/all")
    fun getAllFeedbacks(): List<Feedback> {
        return feedbackService.getAllFeedbacks()
    }

    @GetMapping("/admin/feedbacks")
    fun getAllFeedbacksForAdmin(): List<Feedback> {
        // Add proper admin validation logic if needed
        return feedbackService.getAllFeedbacks()
    }

}
