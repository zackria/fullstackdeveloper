class ForAdvanced{
	public static void main(String[] args) {
		

		String[] northAmericaCountries = {"United States", "Mexico", 
		"Canada", "Guatemala", "Cuba", "Haiti", "Dominican Republic",
		"Honduras", "Nicaragua", "El Salvador", "Costa Rica",
		"Panama", "Jamaica", "Trinidad and Tobago", "Belize",
		"Bahamas", "Barbados", "Saint Lucia", "Grenada",
		"Saint Vincent and the Grenadines", "Antigua and Barbuda",
		"Dominica", "Saint Kitts and Nevis"};

		System.out.println("Number of North American Countries are: "+northAmericaCountries.length);
		System.out.println("#######################");
		
		for (String countryName : northAmericaCountries) {
		  System.out.println(countryName + " is a North American Country");
		}
	}
}