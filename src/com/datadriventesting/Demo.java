package com.datadriventesting;

import org.testng.annotations.Test;

public class Demo {
	
	@Test
	
	public static void openTest() throws Exception {
		
		
		/*ExcelUtils.setExcelFile("./Input/InputData.xlsx");
		
		
		for(int i =0;i<ExcelUtils.getLastRownNo("UserDetails");i++)
		{
			System.out.println(ExcelUtils.getCellData("UserDetails", i, 0));
			System.out.println(ExcelUtils.getCellData("UserDetails", i, 1));
			
			
		}*/
		
		
		String xpath ="(//td[text()='testdata']/following-sibling::td/div/div)[2]";
		
		String newxpath =xpath.replace("testdata", "anjali");
		
		System.out.println(newxpath);
		
		
		
		
	}

}
