package com.DS.Arrays;

public class StoreDVD {
	
	public static void main(String[] args) {
		DVD[] dvdCollection = new DVD[10];
		
		DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
		DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
		DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");

		dvdCollection[2] = incrediblesDVD;
		dvdCollection[1] = findingDoryDVD;
		dvdCollection[3] = lionKingDVD;
		
		System.out.println(dvdCollection[2]+"\n"+dvdCollection[1]+"\n"+dvdCollection[3]);
		
	}

}
