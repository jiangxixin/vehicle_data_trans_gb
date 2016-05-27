package gb.ev.server.model.data;

import java.util.Date;

public abstract class DataUnit {

	private Date timeStamp;
	
	public abstract byte[] getBytes();

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
}
