package org.dreamers.researcher.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by KumuD on 7/23/2017.
 */
@Entity
@Table(name = "resarcher")
public class Researcher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "servey_id", nullable = false)
    private int serveyId;

    @Column(name = "name")
    private String name;

    @Column(name = "purpose")
    private String purpose;

    @Column(name = "conducted_by")
    private String conductedBy;

    @Column(name = "create_date")
    private Date createTime;

    @Column(name = "created_by")
    private int createdBy;

    @Column(name = "modified_date")
    private Date modifiedDate;

    @Column(name = "modified_by")
    private int modifiedBy;

    public int getServeyId() {
        return serveyId;
    }

    public void setServeyId(int serveyId) {
        this.serveyId = serveyId;
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
