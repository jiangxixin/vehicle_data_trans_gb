package gb.ev.server.model;

public enum ResType {
	
	SUCCESS(0x01),
	FAILURE(0x02),
	REP_ERR(0x03),
	COMMAND(0xFE);
	
	
	private ResType(int value){
		
	}
}
