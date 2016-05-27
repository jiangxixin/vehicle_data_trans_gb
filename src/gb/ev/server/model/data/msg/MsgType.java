package gb.ev.server.model.data.msg;

public enum MsgType {

	DATA_BAT_ELEC(0x01),
	DATA_BAT_TEMP(0x02),
	DATA_VEHICLE(0x03),
	DATA_MOTOR(0x04),
	DATA_BAT_FUL(0x05),
	DATA_ENGINE(0x06),
	DATA_GPS(0x07),
	DATA_MAX_MIN(0x08),
	DATA_ALARM(0x09);
	
	private MsgType(int val){
		
	}
}
