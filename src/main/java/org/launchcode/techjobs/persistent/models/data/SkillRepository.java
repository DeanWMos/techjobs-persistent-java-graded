package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Entity;
import org.launchcode.techjobs.persistent.models.Skill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Entity

public interface SkillRepository extends CrudRepository<Skill, Integer> {
}
