package org.dreamers.researcher.pojo;

import javax.persistence.*;

/**
 * Created by Yaseen on 7/19/2017.
 */
@Entity
@Table(name = "answers")
public class Answers implements IPojo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable=false)
  private int id;

  @Column(name = "participant_id")
  private int participantId;

  @Column(name = "question_id")
  private int questionId;

  @Column(name = "answer_text")
  private String answerText;

  @Embedded
  private ModificationMetadata modificationMetadata;

  public Answers(){}
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getParticipantId() {
    return participantId;
  }

  public void setParticipantId(int participantId) {
    this.participantId = participantId;
  }

  public int getQuestionId() {
    return questionId;
  }

  public void setQuestionId(int questionId) {
    this.questionId = questionId;
  }

  public String getAnswerText() {
    return answerText;
  }

  public void setAnswerText(String answerText) {
    this.answerText = answerText;
  }

  public void setModificationMetadata(ModificationMetadata modificationMetadata) {
    this.modificationMetadata = modificationMetadata;
  }
}
