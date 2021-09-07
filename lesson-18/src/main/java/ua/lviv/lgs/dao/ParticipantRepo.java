package ua.lviv.lgs.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;

import ua.lviv.lgs.domain.*;

import org.springframework.stereotype.Repository;

@Repository
public class ParticipantRepo {
	private List<Participant> participants = new ArrayList<>();
	
	@PostConstruct
	public void init(){
		Participant p = new Participant();
		p.setId(1);
		p.setEmail("1");
		p.setLevel(Level.L1);
		p.setName("1");
		p.setPrimarySkill("1");
		
		Participant p1 = new Participant();
		p1.setId(2);
		p1.setEmail("2");
		p1.setLevel(Level.L2);
		p1.setName("2");
		p1.setPrimarySkill("2");
		
		Participant p2 = new Participant();
		p2.setId(3);
		p2.setEmail("3");
		p2.setLevel(Level.L3);
		p2.setName("3");
		p2.setPrimarySkill("3");
		
		participants.add(p);
		participants.add(p1);
		participants.add(p2);
	}
	public List<Participant> findAll(){
		return participants;
	}
	public Participant findOne(int id) {
		return participants.stream().filter(p->p.getId() == id).findFirst().orElse(null);
	}
	public void delete(int id) {
		Iterator<Participant> iterator = participants.iterator();
		while (iterator.hasNext()) {
			if(iterator.next().getId() == id) {
				iterator.remove();
			}
			
		}
	}
	public void save(Participant participant) {
		Participant participantToUpdate = null;
		if(participant.getId() != null) {
			participantToUpdate = findOne(participant.getId());
			int Index = participants.indexOf(participantToUpdate);
			participantToUpdate.setName(participant.getName());
			participantToUpdate.setEmail(participant.getEmail());
			participantToUpdate.setLevel(participant.getLevel());
			participantToUpdate.setPrimarySkill(participant.getPrimarySkill());
			participants.set(Index, participantToUpdate);
		}else {
			participant.setId(participants.size()+1);
			participants.add(participant);
		}
	}
}
