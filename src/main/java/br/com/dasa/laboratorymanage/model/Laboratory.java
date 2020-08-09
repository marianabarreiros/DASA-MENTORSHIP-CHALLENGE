package br.com.dasa.laboratorymanage.model;

import javax.persistence.*;

@Entity
public class Laboratory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Id;
    private String name;
    private Address address;
    @Enumerated(EnumType.STRING)
    private LabStatus labStatus = LabStatus.ATIVO;

    public String getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public LabStatus getLabStatus() {
        return labStatus;
    }
}
