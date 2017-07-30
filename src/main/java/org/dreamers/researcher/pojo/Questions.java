package org.dreamers.researcher.pojo;

import javax.persistence.*;

/**
 * Created by KumuD on 7/23/2017.
 */
@Entity
@Table (name="questions")
public class Questions implements IPojo{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    private int id;

    @Column(name="survey_id")
    private int surveyId;

    @Column(name = "question_text")
    private String questionText;

    @Embedded
    private ModificationMetadata modificationMetadata;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getsurveyId() {
        return surveyId;
    }

    public void setsurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setModificationMetadata(ModificationMetadata modificationMetadata) {
        this.modificationMetadata = modificationMetadata;
    }
}
