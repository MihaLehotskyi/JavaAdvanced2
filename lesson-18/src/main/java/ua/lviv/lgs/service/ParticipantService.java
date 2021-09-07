package ua.lviv.lgs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.dao.ParticipantRepo;
import ua.lviv.lgs.domain.*;
import ua.lviv.lgs.dao.*;

@Service
public class ParticipantService {
	@Autowired
	private ParticipantRepo participantRepo;
	
	public List<Participant> findAll() {
		return participantRepo.findAll();
	}

	public Participant findOne(int id) {
		return participantRepo.findOne(id);
	}

	public void save(Participant participant) {
		participantRepo.save(participant);
	}

	public void delete(int id) {
		participantRepo.delete(id);
	}
}
