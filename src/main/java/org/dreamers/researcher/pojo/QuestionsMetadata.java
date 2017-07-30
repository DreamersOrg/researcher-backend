package org.dreamers.researcher.pojo;

import javax.persistence.*;

/**
 * Created by KumuD on 7/23/2017.
 */
@Entity
@Table(name= "questions_metadata")
public class QuestionsMetadata implements IPojo{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="question_id", nullable = false)
    private int questionId;

    @Column(name = "type")
    private String questionType;

    @Column(name = "values")
    private String values;

    @Column(name = "multiplechoice")
    private boolean multipleChoice;

    @Embedded
    private ModificationMetadata modificationMetadata;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public boolean isMultipleChoice() {
        return multipleChoice;
    }

    public void setMultipleChoice(boolean multipleChoice) {
        this.multipleChoice = multipleChoice;
    }

    public void setModificationMetadata(ModificationMetadata modificationMetadata) {
        this.modificationMetadata = modificationMetadata;
    }
}
