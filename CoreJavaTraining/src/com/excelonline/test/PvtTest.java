package com.excelonline.test;

public class PvtTest {
	private String format;

	public String getFormat() {
		return this.format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PvtTest pt = new PvtTest();
		pt.setFormat("Srinivas K");
		System.out.println("PvtTest.main()" + pt.getFormat());
	}

}
