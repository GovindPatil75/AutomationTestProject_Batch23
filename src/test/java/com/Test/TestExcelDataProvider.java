package com.Test;

public class TestExcelDataProvider {

	public static void main(String[] args) throws Exception {
		
		String Data1=Library.getTestDataExcel("Sheet1", 0, 0);
		System.out.println(Data1);
		
		String data1=Library.getTestDataExcel("Sheet1", 0, 1);
		System.out.println(data1);
	}

}
