package com.apps.razorpay.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.apps.razorpay.model.Trips;
import com.apps.razorpay.model.Person;

@Entity(name = "PersonFriends")
@Table(schema = "\"razorpay\"", name = "\"PersonFriends\"")
@Data
public class PersonFriends{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"UserName\"")
	private String userName;

    
    @Column(name = "\"Friends\"")
    private String friends;
 
}