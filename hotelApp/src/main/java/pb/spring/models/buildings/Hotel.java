package pb.spring.models.buildings;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import pb.spring.models.BaseEntity;
import pb.spring.models.auxilarytypes.Address;
import pb.spring.models.people.Butler;
import pb.spring.models.people.Receptionist;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Hotel extends BaseEntity {

    @OneToOne
    private Address address;

    @OneToMany
    Set<Room> rooms = new HashSet<>();

    @OneToMany
    Set<Butler> butlers = new HashSet<>();

    @OneToMany
    Set<Receptionist> receptionists = new HashSet<>();


}
