package org.assignment.one;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class student implements StudentInt{

    private int id;
    private String name;
    private List<phone> ph;
    private address add;

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Autowired
    public void setPh(List <phone> phn)
    {
     this.ph = phn;
    }

    public List<phone> getPh()
    {
        return ph;
    }

    public void setAdd(address Address)
    {
        this.add = Address;
    }

    public address getAdd()
    {
        return add;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + ph.get(0).getMob() +
                ", add=" + add.getState() + " " + add.getCity() + " " + add.getCountry() + " " + add.getZipcode() +
                '}';
    }
}
