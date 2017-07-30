package org.dreamers.researcher.pojo;

import javax.persistence.*;

/**
 * Created by KumuD on 7/23/2017.
 */
@Entity
@Table(name = "resarcher")
public class Researcher implements IPojo{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "survey_id", nullable = false)
    private int surveyId;

    @Column(name = "name")
    private String name;

    @Column(name = "purpose")
    private String purpose;

    @Column(name = "conducted_by")
    private String conductedBy;

    @Embedded
    private ModificationMetadata modificationMetadata;

    public int getServeyId() {
        return surveyId;
    }

    public void setServeyId(int serveyId) {
        this.surveyId = serveyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getConductedBy() {
        return conductedBy;
    }

    public void setConductedBy(String conductedBy) {
        this.conductedBy = conductedBy;
    }

    public void setModificationMetadata(ModificationMetadata modificationMetadata) {
        this.modificationMetadata = modificationMetadata;
    }
}
