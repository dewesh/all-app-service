package com.appster.services.common.dto;

import java.util.Date;
import java.util.LongSummaryStatistics;

/**
 * Created by dagraw2 on 6/26/18.
 */
public class Person {
    public String Name;
    public Long phoneNumber;
//    public Date dob;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Person withName(String nm) {
        setName(nm);
        return this;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Person withPhoneNumber(Long phone) {
        setPhoneNumber(phone);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getName() != null ? !getName().equals(person.getName()) : person.getName() != null) return false;
        return getPhoneNumber() != null ? getPhoneNumber().equals(person.getPhoneNumber()) : person.getPhoneNumber() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getPhoneNumber() != null ? getPhoneNumber().hashCode() : 0);
        return result;
    }
}
