package org.dreamers.researcher.pojo;

import javax.persistence.*;

/**
 * Created by KumuD on 7/23/2017.
 */
@Entity
@Table(name = "participant")
public class Participant implements IPojo{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "first_name")
    private String firstNmae;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "mobile")
    private int mobileNo;

    @Column(name = "email")
    private String email;

    @Column(name = "age")
    private int age;

    @Column(name = "sex")
    private char gender;

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "participantcol")
    private String participantcol;

    @Embedded
    private ModificationMetadata modificationMetadata;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstNmae() {
        return firstNmae;
    }

    public void setFirstNmae(String firstNmae) {
        this.firstNmae = firstNmae;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getParticipantcol() {
        return participantcol;
    }

    public void setParticipantcol(String participantcol) {
        this.participantcol = participantcol;
    }

    public ModificationMetadata getModificationMetadata() {
        return modificationMetadata;
    }

    public void setModificationMetadata(ModificationMetadata modificationMetadata) {
        this.modificationMetadata = modificationMetadata;
    }
}
