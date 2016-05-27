package gb.ev.server.model;

import gb.ev.server.model.data.DataUnit;

public class Packet {

	private ReqType req;
	private ResType res;
	private String vin;
	private byte encType;
	private short dataLen;
	private DataUnit data;
	private byte bcc;
	
	
	public ReqType getReq() {
		return req;
	}
	public void setReq(ReqType req) {
		this.req = req;
	}
	public ResType getRes() {
		return res;
	}
	public void setRes(ResType res) {
		this.res = res;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public byte getEncType() {
		return encType;
	}
	public void setEncType(byte encType) {
		this.encType = encType;
	}
	public short getDataLen() {
		return dataLen;
	}
	public void setDataLen(short dataLen) {
		this.dataLen = dataLen;
	}
	public DataUnit getData() {
		return data;
	}
	public void setData(DataUnit data) {
		this.data = data;
	}
	public byte getBcc() {
		return bcc;
	}
	public void setBcc(byte bcc) {
		this.bcc = bcc;
	}
	
}
