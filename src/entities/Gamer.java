package entities;

import java.util.Date;

public class Gamer {
    private int id;
    private String firstName,lastName,nationalIdentityNummer;
    private Date dateofBirth;

    public Gamer(int id, String firstName, String lastName, String nationalIdentityNummer, Date dateofBirth) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setNationalIdentityNummer(nationalIdentityNummer);
        setDateofBirth(dateofBirth);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalIdentityNummer() {
        return nationalIdentityNummer;
    }

    public void setNationalIdentityNummer(String nationalIdentityNummer) {
        this.nationalIdentityNummer = nationalIdentityNummer;
    }

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }
}
