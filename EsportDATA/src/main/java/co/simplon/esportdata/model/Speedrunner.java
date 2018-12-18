package co.simplon.esportdata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Speedrunner {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // Permet de faire l'auto_increment
	@Column
	private long runnerID;

	public long getRunnerID() {
		return runnerID;
	}

	public void setRunnerID(long runnerID) {
		this.runnerID = runnerID;
	}
	
	
}
