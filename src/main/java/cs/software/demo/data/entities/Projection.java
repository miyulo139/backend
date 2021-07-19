package cs.software.demo.data.entities;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "projections")
public class Projection implements Serializable {
    @Id
    @Column(name = "projectionID", nullable = false, unique = true)
    private String projectionID;

}
