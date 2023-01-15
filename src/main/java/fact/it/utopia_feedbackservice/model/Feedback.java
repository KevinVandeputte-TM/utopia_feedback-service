package fact.it.utopia_feedbackservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Feedback {
    @Id
    private String id;
    private String game;
    private String visuals;
    private String content;
    private String other;
    private int score;
    
    public Feedback() {
    }

    public Feedback(String game, String visuals, String content, String other, int score) {
        this.game = game;
        this.visuals = visuals;
        this.content = content;
        this.other = other;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getVisuals() {
        return visuals;
    }

    public void setVisuals(String visuals) {
        this.visuals = visuals;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
