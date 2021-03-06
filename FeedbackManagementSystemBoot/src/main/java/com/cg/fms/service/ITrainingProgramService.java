package com.cg.fms.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.fms.entity.Program;
import com.cg.fms.exception.ElementNotFoundException;
import com.cg.fms.exception.InvalidValueException;

public interface ITrainingProgramService {
	
	public Program createProgram(Program pr) throws InvalidValueException;
	public Program updateProgram(Program pr) throws InvalidValueException ;
	public Program removeProgram(int programid) throws ElementNotFoundException;
	public Program viewProgram(int programid) throws ElementNotFoundException;
	public List<Program> viewAllPrograms() throws ElementNotFoundException;
	public List<Program> viewAllProgramsByDate(LocalDate date) throws ElementNotFoundException;
	public List<Program> viewAllProgramsByFaculty(int facultyid) throws ElementNotFoundException;
}
