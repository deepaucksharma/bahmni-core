package org.bahmni.datamigration.request.patient;

import java.util.ArrayList;
import java.util.List;
//
//attributeType: "cd7b242c-9790-11e2-99c1-005056b562c5"
//        name: "caste"
//        value: "bar"
//        1: {attributeType:ce85ffc2-9790-11e2-99c1-005056b562c5, name:class, value:OBC}
//        attributeType: "ce85ffc2-9790-11e2-99c1-005056b562c5"
//        name: "class"
//        value: "OBC"
//        2: {attributeType:cd7be7fe-9790-11e2-99c1-005056b562c5, name:education, value:Uneducated}
//        attributeType: "cd7be7fe-9790-11e2-99c1-005056b562c5"
//        name: "education"
//        value: "Uneducated"
//        3: {attributeType:cd7c99ba-9790-11e2-99c1-005056b562c5, name:occupation, value:Student}
//        attributeType: "cd7c99ba-9790-11e2-99c1-005056b562c5"
//        name: "occupation"
//        value: "Student"
//        4: {attributeType:cd7d5878-9790-11e2-99c1-005056b562c5, name:primaryContact, value:23432}
//        attributeType: "cd7d5878-9790-11e2-99c1-005056b562c5"
//        name: "primaryContact"
//        value: "23432"
//        5: {attributeType:cd7e34e6-9790-11e2-99c1-005056b562c5, name:secondaryContact, value:34324}
//        attributeType: "cd7e34e6-9790-11e2-99c1-005056b562c5"
//        name: "secondaryContact"
//        value: "34324"
//        6: {attributeType:cd7faff6-9790-11e2-99c1-005056b562c5, name:primaryRelative, value:sfgfdg}
//        attributeType: "cd7faff6-9790-11e2-99c1-005056b562c5"
//        name: "primaryRelative"
//        value: "sfgfdg"

public class PatientRequest {
    private List<Name> names = new ArrayList<Name>();
    private Integer age;
    private String birthdate;
    private String gender;
    private String patientIdentifier;
    private CenterId centerID;
    private List<PatientAddress> addresses = new ArrayList<PatientAddress>();
    private List<PatientAttribute> attributes = new ArrayList<PatientAttribute>();

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPatientIdentifier(String patientIdentifier) {
        this.patientIdentifier = patientIdentifier;
    }

    public void setCenterID(CenterId centerID) {
        this.centerID = centerID;
    }

    public void setName(String givenName, String familyName) {
        Name name = new Name();
        name.setGivenName(givenName);
        name.setFamilyName(familyName);
        names.add(name);
    }

    public void addPatientAttribute(PatientAttribute patientAttribute) {
        attributes.add(patientAttribute);
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public Integer getAge() {
        return age;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getGender() {
        return gender;
    }

    public String getPatientIdentifier() {
        return patientIdentifier;
    }

    public CenterId getCenterID() {
        return centerID;
    }

    public List<PatientAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<PatientAddress> addresses) {
        this.addresses = addresses;
    }

    public List<PatientAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<PatientAttribute> attributes) {
        this.attributes = attributes;
    }
}