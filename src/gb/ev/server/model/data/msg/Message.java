package gb.ev.server.model.data.msg;


public abstract class Message {

	private MsgType type;
	
	public MsgType getType() {
		return type;
	}
	public void setType(MsgType type) {
		this.type = type;
	}



	public abstract byte[] getBytes();
}
