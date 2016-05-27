package gb.ev.server.model.data;

import gb.ev.server.util.PacketUtils;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.util.List;

public class VehicleLoginData extends DataUnit {

	private short loginSequence;
	private String iccid;
	private List<String> batCodeList;
	
	
	public short getLoginSequence() {
		return loginSequence;
	}

	public void setLoginSequence(short loginSequence) {
		this.loginSequence = loginSequence;
	}
	
	public String getIccid() {
		return iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public List<String> getBatCodeList() {
		return batCodeList;
	}

	public void setBatCodeList(List<String> batCodeList) {
		this.batCodeList = batCodeList;
	}

	@Override
	public byte[] getBytes() {
		ByteBuf bb = Unpooled.buffer(50);
		bb.writeShort(loginSequence);
		if(iccid !=null){
			byte[] iccidBytes = iccid.getBytes();
			PacketUtils.copyBytesToBuf(iccidBytes,bb,20);
		}else{
			bb.writeZero(20);
		}
		if(batCodeList !=null ){
			bb.writeByte(batCodeList.size());
			for(String batCode:batCodeList){
				if(batCode !=null){
					byte[] batCodeBytes = iccid.getBytes();
					PacketUtils.copyBytesToBuf(batCodeBytes,bb,17);
				}else{
					bb.writeZero(17);
				}
			}
		}else{
			bb.writeByte(0);
		}
		byte[] bytes = new byte[bb.readableBytes()];
		bb.readBytes(bytes);
		return bytes;
	}

}
