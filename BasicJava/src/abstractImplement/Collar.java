package abstractImplement;

public class Collar {
	private String collarType;

	public String getCollarType() {
		return collarType;
	}

	public void setCollarType(String collarType) {
		this.collarType = collarType;
	}

	@Override
	public String toString() {
		return "Collar [collarType=" + collarType + "]";
	}
}
