package gb.ev.server.model.data.msg;

import java.util.List;

public class BatElecMsg extends Message{

	private List<BatPackInfo> packs;
	
	public List<BatPackInfo> getPacks() {
		return packs;
	}
	public void setPacks(List<BatPackInfo> packs) {
		this.packs = packs;
	}

	@Override
	public byte[] getBytes() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	class BatPackInfo {

		private short voltage;
		private short current;
		
		List<Short> monoVoltages;

		public short getVoltage() {
			return voltage;
		}

		public void setVoltage(short voltage) {
			this.voltage = voltage;
		}

		public short getCurrent() {
			return current;
		}

		public void setCurrent(short current) {
			this.current = current;
		}

		public List<Short> getMonoVoltages() {
			return monoVoltages;
		}

		public void setMonoVoltages(List<Short> monoVoltages) {
			this.monoVoltages = monoVoltages;
		}
	}

}
