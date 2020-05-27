package pb.spring.models.people;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import pb.spring.models.buildings.Room;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Guest extends Person {

    @ManyToOne
    private Room room;


}
