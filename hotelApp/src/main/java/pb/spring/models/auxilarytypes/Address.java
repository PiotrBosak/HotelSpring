package pb.spring.models.auxilarytypes;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import pb.spring.models.BaseEntity;

import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Address extends BaseEntity {
    private String country;
    private String city;
    private String streetName;
    private String streetNumber;
}
