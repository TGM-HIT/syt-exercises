package sectionpark.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.Serializable;

public class TimingstationData implements Serializable {
	private static final long serialVersionUID = 300002228479017363L;
	
	private String timingstationID;
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

	/**
	 * Methods
	 */
	@Override
	public String toString() {
		String info = String.format("Timingstation Info: ID = %s, timestamp = %s", 
			timingstationID, timestamp );
		return info;
	}
}
