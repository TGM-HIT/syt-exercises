package main.java.sectionpark;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.data.annotation.Id;

public class TimingstationData implements Serializable {
	
	private static final long serialVersionUID = 300002228479017363L;
	
    @Id
	private String ID;
	
	private String timingstationID;
	private String sectionparkID;
	private String timestamp;

	private double temperature;
	private String unitTemperature;

	/**
	 * Constructor
	 */
	public TimingstationData() {
		
		this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
		this.unitTemperature = "C";
		
	}

	public TimingstationData(String timingstationID, String sectionparkID, String timestamp, double temperature, String unitTemperature ) {
		super();
		this.timingstationID = timingstationID;
		this.sectionparkID = sectionparkID;
		this.timestamp = timestamp;
		this.temperature = temperature;
		this.unitTemperature = unitTemperature;

	}


	
	/**
	 * Setter and Getter Methods
	 */
	public String getTimingstationID() {
		return timingstationID;
	}
	
	public void setTimingstationID(String timingstationID) {
		this.timingstationID = timingstationID;
	}
	
	public String getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public String getUnitTemperature() {
		return unitTemperature;
	}

	public void setUnitTemperature(String unitTemperature) {
		this.unitTemperature = unitTemperature;
	}

	/**
	 * Methods
	 */
	@Override
	public String toString() {
		String info = String.format("Timingstation Info: ID = %s, timestamp = %s, temperature = %4.1f %s", 
			timingstationID, timestamp, temperature, unitTemperature );
		return info;
	}
}
