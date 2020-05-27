package pb.spring.models.people;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import pb.spring.models.BaseEntity;
import pb.spring.models.auxilarytypes.Address;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.PreUpdate;
import java.util.Date;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
public class Person extends BaseEntity {


    @Column(name = "first_name")
    private  String firstName;
    @Column(name = "last_name")
    private  String lastName;
    @Column(name = "birth_date")
    private  Date birthDate;
    @OneToOne
    private Address address;


}
