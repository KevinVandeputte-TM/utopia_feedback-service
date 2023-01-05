package fact.it.utopia_feedbackservice.controller;

import fact.it.utopia_feedbackservice.model.Feedback;
import fact.it.utopia_feedbackservice.model.FeedbackDTO;
import fact.it.utopia_feedbackservice.repository.FeedbackRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FeedbackController {
    @Autowired
    private FeedbackRepository feedbackRepository;
    public FeedbackController(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    @GetMapping("/feedback")
    public List<Feedback> getAllFeedback() {
        return feedbackRepository.findAll();
    }

    @GetMapping("/feedback/{id}")
    public Optional<Feedback> getFeedbackById(@PathVariable String id) {
        return feedbackRepository.findById(id);
    }

    @PostMapping("/feedback")
    public Feedback create(@RequestBody FeedbackDTO feedback) {
        Feedback persistentFeedback = new Feedback(feedback.getGame(), feedback.getVisuals(), feedback.getContent(), feedback.getOther(), feedback.getScore());
        feedbackRepository.save(persistentFeedback);
        return persistentFeedback;
    }
}
