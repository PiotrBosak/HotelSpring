package pb.spring.models.buildings;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pb.spring.models.BaseEntity;
import pb.spring.models.people.Guest;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Room extends BaseEntity {
    private  int roomNumber;
    private int floorNumber;
    private int maxCapacity;
    private boolean isAvailable;

    @OneToMany
    Set<Guest> currentGuests = new HashSet<>();


}
