package com.everis.person.services;

import java.util.List;

import com.everis.person.entities.Person;
import com.everis.person.repositories.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements IPersonService {

	@Autowired
	private IPersonRepository iPersonRepository;

	@Override
	public Boolean getValueFingerprint(Integer dni) {
		List<Person> person = iPersonRepository.findAll();
		for (Person p : person) {
			if (p.getDocument().equals(dni)) {

				return p.getFingerprint();
			}
		}
		return null;
	}

}
