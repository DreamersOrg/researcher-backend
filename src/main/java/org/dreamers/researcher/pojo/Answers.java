package org.dreamers.researcher.pojo;

import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Yaseen on 7/19/2017.
 */
@Entity
@Table(name = "answers")
public class Answers {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @Column(name = "participant_id")
  private int participantId;

  @Column(name = "question_id")
  private int questionId;

  @Column(name = "answer_text")
  private String answerText;

  @Column(name = "create_date")
  private Date createTime;

  @Column(name = "created_by")
  private int createdBy;

  @Column(name = "modified_date")
  private Date modifiedDate;

  @Column(name = "modified_by")
  private int modifiedBy;

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

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public int getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(int createdBy) {
    this.createdBy = createdBy;
  }

  public Date getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public int getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(int modifiedBy) {
    this.modifiedBy = modifiedBy;
  }
}
