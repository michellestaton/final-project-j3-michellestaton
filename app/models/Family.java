package models;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;


@Entity
@Table(name="Family")
public class Family
{
    @Id @Column(name="FamilyId") private int familyId;
    @Column(name="FamilyName") private String familyName;
    @Column(name="Address")   private String address;
    @Column(name="FamilyPicture")   private byte[] picture;
    @OneToMany @JoinColumn(name = "FamilyId")    private List<Membership> memberships;

    public List<Membership> getMemberships()
    {
        return memberships;
    }

    public void setMemberships(List<Membership> memberships)
    {
        this.memberships = memberships;
    }

    public int getFamilyId()
    {
        return familyId;
    }

    public void setFamilyId(int familyId)
    {
        this.familyId = familyId;
    }

    public String getFamilyName()
    {
        return familyName;
    }

    public void setFamilyName(String familyName)
    {
        this.familyName = familyName;
    }



    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }


    public byte[] getPicture()
    {
        return picture;
    }

    public void setPicture(byte[] picture)
    {
        this.picture = picture;
    }
}
