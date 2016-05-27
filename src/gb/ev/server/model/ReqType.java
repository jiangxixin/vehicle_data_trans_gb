package gb.ev.server.model;

public enum ReqType {

	TER_LOGIN(0x01),
	TER_RT_TRANS(0x02),
	TER_HIS_TRANS(0x04),
	TER_LOGOUT(0x05),
	PLAT_LOGIN(0x06),
	PLAT_LOGOUT(0x07);
	
	
	private ReqType(int value){
		
	}
	
}
