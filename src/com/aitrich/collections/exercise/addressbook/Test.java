package com.aitrich.collections.exercise.addressbook;

public class Test {
	public static void main(String args[]) {
		AddressBook ab = new AddressBook();
		
		ab.addPerson(new Person("Abijith","PS","31/12/2003",
		        new Address("W1-69","69","Kainoor",new City("City001","Thrissur",new Country("Country001","India")),"+918089004951","abijithps2003@gmail.com"),
		        new Address("W17","101","MG Road",new City("City001","Thrissur",new Country("Country001","India")),"+91987654321","aitrichtech@gmail.com")));
		
		// 2
		ab.addPerson(new Person("Neha","Sharma","15/05/2000",
		        new Address("H001","12A","MG Road",
		            new City("City002","Kochi",new Country("Country001","India")),
		            "+919000000001","neha.sharma@example.com"),
		        new Address("O001","221","Infopark Road",
		            new City("City002","Kochi",new Country("Country001","India")),
		            "+919000000101","neha.work@example.com")));

		// 3
		ab.addPerson(new Person("Rahul","Menon","22/09/1998",
		        new Address("H002","34","Palakkad Road",
		            new City("City003","Palakkad",new Country("Country001","India")),
		            "+919000000002","rahul.menon@example.com"),
		        new Address("O002","56","Technopark",
		            new City("City004","Thiruvananthapuram",new Country("Country001","India")),
		            "+919000000102","rahul.menon.it@example.com")));

		// 4
		ab.addPerson(new Person("Emily","Johnson","03/03/1995",
		        new Address("H003","789","5th Avenue",
		            new City("City005","New York",new Country("Country002","USA")),
		            "+12125550001","emily.johnson@example.com"),
		        new Address("O003","15","Wall Street",
		            new City("City005","New York",new Country("Country002","USA")),
		            "+12125550101","emily.j@workcorp.com")));

		// 5
		ab.addPerson(new Person("Michael","Brown","11/11/1988",
		        new Address("H004","22","Market Street",
		            new City("City006","San Francisco",new Country("Country002","USA")),
		            "+14155550002","michael.brown@example.com"),
		        new Address("O004","300","Mission Street",
		            new City("City006","San Francisco",new Country("Country002","USA")),
		            "+14155550102","michael.b@startup.com")));

		// 6
		ab.addPerson(new Person("Sophia","Williams","27/07/2004",
		        new Address("H005","10","Baker Street",
		            new City("City007","London",new Country("Country003","United Kingdom")),
		            "+447700900001","sophia.williams@example.com"),
		        new Address("O005","220","Oxford Street",
		            new City("City007","London",new Country("Country003","United Kingdom")),
		            "+447700900101","sophia.w@designhub.co.uk")));

		// 7
		ab.addPerson(new Person("Oliver","Taylor","19/02/1990",
		        new Address("H006","45","King’s Road",
		            new City("City007","London",new Country("Country003","United Kingdom")),
		            "+447700900002","oliver.taylor@example.com"),
		        new Address("O006","5","Canary Wharf",
		            new City("City007","London",new Country("Country003","United Kingdom")),
		            "+447700900102","oliver.t@fintech.co.uk")));

		// 8
		ab.addPerson(new Person("Ava","Martin","09/09/1999",
		        new Address("H007","101","Queen Street",
		            new City("City008","Toronto",new Country("Country004","Canada")),
		            "+14160000001","ava.martin@example.com"),
		        new Address("O007","800","Bay Street",
		            new City("City008","Toronto",new Country("Country004","Canada")),
		            "+14160000101","ava.m@corp.ca")));

		// 9
		ab.addPerson(new Person("Liam","Clark","30/01/1985",
		        new Address("H008","77","Granville Street",
		            new City("City009","Vancouver",new Country("Country004","Canada")),
		            "+16040000002","liam.clark@example.com"),
		        new Address("O008","400","Robson Street",
		            new City("City009","Vancouver",new Country("Country004","Canada")),
		            "+16040000102","liam.c@agency.ca")));

		// 10
		ab.addPerson(new Person("Noah","Anderson","05/06/1992",
		        new Address("H009","12","George Street",
		            new City("City010","Sydney",new Country("Country005","Australia")),
		            "+61280000001","noah.anderson@example.com"),
		        new Address("O009","50","Pitt Street",
		            new City("City010","Sydney",new Country("Country005","Australia")),
		            "+61280000101","noah.a@tech.au")));

		// 11
		ab.addPerson(new Person("Isabella","Wilson","18/12/1980",
		        new Address("H010","33","Collins Street",
		            new City("City011","Melbourne",new Country("Country005","Australia")),
		            "+61380000002","isabella.wilson@example.com"),
		        new Address("O010","120","Flinders Lane",
		            new City("City011","Melbourne",new Country("Country005","Australia")),
		            "+61380000102","isabella.w@studio.au")));

		// 12
		ab.addPerson(new Person("Jonas","Müller","21/04/1993",
		        new Address("H011","9","Alexanderplatz",
		            new City("City012","Berlin",new Country("Country006","Germany")),
		            "+493000000001","jonas.mueller@example.com"),
		        new Address("O011","200","Unter den Linden",
		            new City("City012","Berlin",new Country("Country006","Germany")),
		            "+493000000101","jonas.m@consult.de")));

		// 13
		ab.addPerson(new Person("Emma","Schmidt","14/08/1987",
		        new Address("H012","55","Maximilianstraße",
		            new City("City013","Munich",new Country("Country006","Germany")),
		            "+498900000002","emma.schmidt@example.com"),
		        new Address("O012","10","Leopoldstraße",
		            new City("City013","Munich",new Country("Country006","Germany")),
		            "+498900000102","emma.s@finance.de")));

		// 14
		ab.addPerson(new Person("Lucas","Dubois","02/02/1996",
		        new Address("H013","7","Rue de Rivoli",
		            new City("City014","Paris",new Country("Country007","France")),
		            "+33140000001","lucas.dubois@example.com"),
		        new Address("O013","99","Boulevard Haussmann",
		            new City("City014","Paris",new Country("Country007","France")),
		            "+33140000101","lucas.d@retail.fr")));

		// 15
		ab.addPerson(new Person("Chloe","Lefevre","26/10/1991",
		        new Address("H014","18","Cours Mirabeau",
		            new City("City015","Aix-en-Provence",new Country("Country007","France")),
		            "+33442000002","chloe.lefevre@example.com"),
		        new Address("O014","3","Rue Espariat",
		            new City("City015","Aix-en-Provence",new Country("Country007","France")),
		            "+33442000102","chloe.l@art.fr")));

		// 16
		ab.addPerson(new Person("Haruto","Tanaka","07/07/1997",
		        new Address("H015","2-5","Shibuya",
		            new City("City016","Tokyo",new Country("Country008","Japan")),
		            "+81300000001","haruto.tanaka@example.com"),
		        new Address("O015","8-10","Roppongi",
		            new City("City016","Tokyo",new Country("Country008","Japan")),
		            "+81300000101","haruto.t@game.jp")));

		// 17
		ab.addPerson(new Person("Yui","Sato","29/03/1984",
		        new Address("H016","3-12","Umeda",
		            new City("City017","Osaka",new Country("Country008","Japan")),
		            "+81600000002","yui.sato@example.com"),
		        new Address("O016","5-20","Namba",
		            new City("City017","Osaka",new Country("Country008","Japan")),
		            "+81600000102","yui.s@commerce.jp")));

		// 18
		ab.addPerson(new Person("Carlos","Silva","12/01/2002",
		        new Address("H017","450","Avenida Paulista",
		            new City("City018","São Paulo",new Country("Country009","Brazil")),
		            "+551100000001","carlos.silva@example.com"),
		        new Address("O017","900","Rua Augusta",
		            new City("City018","São Paulo",new Country("Country009","Brazil")),
		            "+551100000101","carlos.s@startup.br")));

		// 19
		ab.addPerson(new Person("Ana","Oliveira","08/11/1994",
		        new Address("H018","120","Rua das Flores",
		            new City("City019","Rio de Janeiro",new Country("Country009","Brazil")),
		            "+552100000002","ana.oliveira@example.com"),
		        new Address("O018","300","Avenida Atlântica",
		            new City("City019","Rio de Janeiro",new Country("Country009","Brazil")),
		            "+552100000102","ana.o@agency.br")));

		// 20
		ab.addPerson(new Person("Thabo","Nkosi","16/04/1982",
		        new Address("H019","88","Mandela Street",
		            new City("City020","Johannesburg",new Country("Country010","South Africa")),
		            "+27110000001","thabo.nkosi@example.com"),
		        new Address("O019","25","Sandton Drive",
		            new City("City020","Johannesburg",new Country("Country010","South Africa")),
		            "+27110000101","thabo.n@mining.za")));

		// 21
		ab.addPerson(new Person("Lerato","Mokoena","23/09/1999",
		        new Address("H020","14","Long Street",
		            new City("City021","Cape Town",new Country("Country010","South Africa")),
		            "+27210000002","lerato.mokoena@example.com"),
		        new Address("O020","70","Waterfront Road",
		            new City("City021","Cape Town",new Country("Country010","South Africa")),
		            "+27210000102","lerato.m@tourism.za")));

		// 22
		ab.addPerson(new Person("Omar","Al-Farsi","01/08/1990",
		        new Address("H021","32","Sheikh Zayed Road",
		            new City("City022","Dubai",new Country("Country011","UAE")),
		            "+97140000001","omar.alfarsi@example.com"),
		        new Address("O021","101","Business Bay",
		            new City("City022","Dubai",new Country("Country011","UAE")),
		            "+97140000101","omar.a@trading.ae")));

		// 23
		ab.addPerson(new Person("Fatima","Khalid","10/10/1986",
		        new Address("H022","5","Corniche Street",
		            new City("City023","Abu Dhabi",new Country("Country011","UAE")),
		            "+97120000002","fatima.khalid@example.com"),
		        new Address("O022","60","Al Maryah Island",
		            new City("City023","Abu Dhabi",new Country("Country011","UAE")),
		            "+97120000102","fatima.k@finance.ae")));

		// 24
		ab.addPerson(new Person("Wei","Zhang","04/05/1998",
		        new Address("H023","18","Orchard Road",
		            new City("City024","Singapore",new Country("Country012","Singapore")),
		            "+6560000001","wei.zhang@example.com"),
		        new Address("O023","88","Shenton Way",
		            new City("City024","Singapore",new Country("Country012","Singapore")),
		            "+6560000101","wei.z@fintech.sg")));

		// 25
		ab.addPerson(new Person("Mei","Lin","13/01/2001",
		        new Address("H024","7","Bugis Street",
		            new City("City024","Singapore",new Country("Country012","Singapore")),
		            "+6560000002","mei.lin@example.com"),
		        new Address("O024","120","Raffles Place",
		            new City("City024","Singapore",new Country("Country012","Singapore")),
		            "+6560000102","mei.l@bank.sg")));

		// 26
		ab.addPerson(new Person("Arjun","Reddy","20/07/1997",
		        new Address("H025","9-12","Banjara Hills",
		            new City("City025","Hyderabad",new Country("Country001","India")),
		            "+919000000003","arjun.reddy@example.com"),
		        new Address("O025","55","Hitech City",
		            new City("City025","Hyderabad",new Country("Country001","India")),
		            "+919000000103","arjun.r@itfirm.in")));

		// 27
		ab.addPerson(new Person("Kavya","Nair","06/02/2005",
		        new Address("H026","23","Palarivattom",
		            new City("City002","Kochi",new Country("Country001","India")),
		            "+919000000004","kavya.nair@example.com"),
		        new Address("O026","12","MG Road",
		            new City("City002","Kochi",new Country("Country001","India")),
		            "+919000000104","kavya.n@boutique.in")));

		// 28
		ab.addPerson(new Person("Rohan","Kapoor","24/12/2006",
		        new Address("H027","44","Connaught Place",
		            new City("City026","New Delhi",new Country("Country001","India")),
		            "+919000000005","rohan.kapoor@example.com"),
		        new Address("O027","140","Cyber City",
		            new City("City027","Gurugram",new Country("Country001","India")),
		            "+919000000105","rohan.k@startup.in")));

		// 29
		ab.addPerson(new Person("Sara","Iqbal","02/03/2007",
		        new Address("H028","5","Residency Road",
		            new City("City028","Bengaluru",new Country("Country001","India")),
		            "+919000000006","sara.iqbal@example.com"),
		        new Address("O028","25","Outer Ring Road",
		            new City("City028","Bengaluru",new Country("Country001","India")),
		            "+919000000106","sara.i@itservices.in")));

		// 30
		ab.addPerson(new Person("Vikram","Singh","29/09/1989",
		        new Address("H029","88","Park Street",
		            new City("City029","Kolkata",new Country("Country001","India")),
		            "+919000000007","vikram.singh@example.com"),
		        new Address("O029","300","Salt Lake Sector V",
		            new City("City029","Kolkata",new Country("Country001","India")),
		            "+919000000107","vikram.s@media.in")));
		
//		ab.getAllPerson();

//		System.out.println(ab.getPersonsOlderThan25());
		
//		System.out.println(ab.getPersonWorkingInCity("Kochi"));
		
//		System.out.println(ab.getPersonsWorkingInCityNotOlderThan20("kochi"));
		
		System.out.println(ab.listByCity());
		
		System.out.println(ab.listByCountry());
		
		System.out.println(ab.listByCountryThenCity());
		
		System.out.println(ab.listByCountryCityThenFirstName());
		
		System.out.println(ab.listByCountryCityThenAgeDesc());
		
		CountryAddressBook cab = new CountryAddressBook();
		
		cab.addPerson(new Person("Abijith","PS","31/12/2003",
		        new Address("W1-69","69","Kainoor",new City("City001","Thrissur",new Country("Country001","India")),"+918089004951","abijithps2003@gmail.com"),
		        new Address("W17","101","MG Road",new City("City001","Thrissur",new Country("Country001","India")),"+91987654321","aitrichtech@gmail.com")));
		
		// 2
		cab.addPerson(new Person("Neha","Sharma","15/05/2000",
		        new Address("H001","12A","MG Road",
		            new City("City002","Kochi",new Country("Country001","India")),
		            "+919000000001","neha.sharma@example.com"),
		        new Address("O001","221","Infopark Road",
		            new City("City002","Kochi",new Country("Country001","India")),
		            "+919000000101","neha.work@example.com")));

		// 3
		cab.addPerson(new Person("Rahul","Menon","22/09/1998",
		        new Address("H002","34","Palakkad Road",
		            new City("City003","Palakkad",new Country("Country001","India")),
		            "+919000000002","rahul.menon@example.com"),
		        new Address("O002","56","Technopark",
		            new City("City004","Thiruvananthapuram",new Country("Country001","India")),
		            "+919000000102","rahul.menon.it@example.com")));

		// 4
		cab.addPerson(new Person("Emily","Johnson","03/03/1995",
		        new Address("H003","789","5th Avenue",
		            new City("City005","New York",new Country("Country002","USA")),
		            "+12125550001","emily.johnson@example.com"),
		        new Address("O003","15","Wall Street",
		            new City("City005","New York",new Country("Country002","USA")),
		            "+12125550101","emily.j@workcorp.com")));

		// 5
		cab.addPerson(new Person("Michael","Brown","11/11/1988",
		        new Address("H004","22","Market Street",
		            new City("City006","San Francisco",new Country("Country002","USA")),
		            "+14155550002","michael.brown@example.com"),
		        new Address("O004","300","Mission Street",
		            new City("City006","San Francisco",new Country("Country002","USA")),
		            "+14155550102","michael.b@startup.com")));

		// 6
		cab.addPerson(new Person("Sophia","Williams","27/07/2004",
		        new Address("H005","10","Baker Street",
		            new City("City007","London",new Country("Country003","United Kingdom")),
		            "+447700900001","sophia.williams@example.com"),
		        new Address("O005","220","Oxford Street",
		            new City("City007","London",new Country("Country003","United Kingdom")),
		            "+447700900101","sophia.w@designhub.co.uk")));

		// 7
		cab.addPerson(new Person("Oliver","Taylor","19/02/1990",
		        new Address("H006","45","King’s Road",
		            new City("City007","London",new Country("Country003","United Kingdom")),
		            "+447700900002","oliver.taylor@example.com"),
		        new Address("O006","5","Canary Wharf",
		            new City("City007","London",new Country("Country003","United Kingdom")),
		            "+447700900102","oliver.t@fintech.co.uk")));

		// 8
		cab.addPerson(new Person("Ava","Martin","09/09/1999",
		        new Address("H007","101","Queen Street",
		            new City("City008","Toronto",new Country("Country004","Canada")),
		            "+14160000001","ava.martin@example.com"),
		        new Address("O007","800","Bay Street",
		            new City("City008","Toronto",new Country("Country004","Canada")),
		            "+14160000101","ava.m@corp.ca")));

		// 9
		cab.addPerson(new Person("Liam","Clark","30/01/1985",
		        new Address("H008","77","Granville Street",
		            new City("City009","Vancouver",new Country("Country004","Canada")),
		            "+16040000002","liam.clark@example.com"),
		        new Address("O008","400","Robson Street",
		            new City("City009","Vancouver",new Country("Country004","Canada")),
		            "+16040000102","liam.c@agency.ca")));

		// 10
		cab.addPerson(new Person("Noah","Anderson","05/06/1992",
		        new Address("H009","12","George Street",
		            new City("City010","Sydney",new Country("Country005","Australia")),
		            "+61280000001","noah.anderson@example.com"),
		        new Address("O009","50","Pitt Street",
		            new City("City010","Sydney",new Country("Country005","Australia")),
		            "+61280000101","noah.a@tech.au")));

		// 11
		cab.addPerson(new Person("Isabella","Wilson","18/12/1980",
		        new Address("H010","33","Collins Street",
		            new City("City011","Melbourne",new Country("Country005","Australia")),
		            "+61380000002","isabella.wilson@example.com"),
		        new Address("O010","120","Flinders Lane",
		            new City("City011","Melbourne",new Country("Country005","Australia")),
		            "+61380000102","isabella.w@studio.au")));

		// 12
		cab.addPerson(new Person("Jonas","Müller","21/04/1993",
		        new Address("H011","9","Alexanderplatz",
		            new City("City012","Berlin",new Country("Country006","Germany")),
		            "+493000000001","jonas.mueller@example.com"),
		        new Address("O011","200","Unter den Linden",
		            new City("City012","Berlin",new Country("Country006","Germany")),
		            "+493000000101","jonas.m@consult.de")));

		// 13
		cab.addPerson(new Person("Emma","Schmidt","14/08/1987",
		        new Address("H012","55","Maximilianstraße",
		            new City("City013","Munich",new Country("Country006","Germany")),
		            "+498900000002","emma.schmidt@example.com"),
		        new Address("O012","10","Leopoldstraße",
		            new City("City013","Munich",new Country("Country006","Germany")),
		            "+498900000102","emma.s@finance.de")));

		// 14
		cab.addPerson(new Person("Lucas","Dubois","02/02/1996",
		        new Address("H013","7","Rue de Rivoli",
		            new City("City014","Paris",new Country("Country007","France")),
		            "+33140000001","lucas.dubois@example.com"),
		        new Address("O013","99","Boulevard Haussmann",
		            new City("City014","Paris",new Country("Country007","France")),
		            "+33140000101","lucas.d@retail.fr")));

		// 15
		cab.addPerson(new Person("Chloe","Lefevre","26/10/1991",
		        new Address("H014","18","Cours Mirabeau",
		            new City("City015","Aix-en-Provence",new Country("Country007","France")),
		            "+33442000002","chloe.lefevre@example.com"),
		        new Address("O014","3","Rue Espariat",
		            new City("City015","Aix-en-Provence",new Country("Country007","France")),
		            "+33442000102","chloe.l@art.fr")));

		// 16
		cab.addPerson(new Person("Haruto","Tanaka","07/07/1997",
		        new Address("H015","2-5","Shibuya",
		            new City("City016","Tokyo",new Country("Country008","Japan")),
		            "+81300000001","haruto.tanaka@example.com"),
		        new Address("O015","8-10","Roppongi",
		            new City("City016","Tokyo",new Country("Country008","Japan")),
		            "+81300000101","haruto.t@game.jp")));

		// 17
		cab.addPerson(new Person("Yui","Sato","29/03/1984",
		        new Address("H016","3-12","Umeda",
		            new City("City017","Osaka",new Country("Country008","Japan")),
		            "+81600000002","yui.sato@example.com"),
		        new Address("O016","5-20","Namba",
		            new City("City017","Osaka",new Country("Country008","Japan")),
		            "+81600000102","yui.s@commerce.jp")));

		// 18
		cab.addPerson(new Person("Carlos","Silva","12/01/2002",
		        new Address("H017","450","Avenida Paulista",
		            new City("City018","São Paulo",new Country("Country009","Brazil")),
		            "+551100000001","carlos.silva@example.com"),
		        new Address("O017","900","Rua Augusta",
		            new City("City018","São Paulo",new Country("Country009","Brazil")),
		            "+551100000101","carlos.s@startup.br")));

		// 19
		cab.addPerson(new Person("Ana","Oliveira","08/11/1994",
		        new Address("H018","120","Rua das Flores",
		            new City("City019","Rio de Janeiro",new Country("Country009","Brazil")),
		            "+552100000002","ana.oliveira@example.com"),
		        new Address("O018","300","Avenida Atlântica",
		            new City("City019","Rio de Janeiro",new Country("Country009","Brazil")),
		            "+552100000102","ana.o@agency.br")));

		// 20
		cab.addPerson(new Person("Thabo","Nkosi","16/04/1982",
		        new Address("H019","88","Mandela Street",
		            new City("City020","Johannesburg",new Country("Country010","South Africa")),
		            "+27110000001","thabo.nkosi@example.com"),
		        new Address("O019","25","Sandton Drive",
		            new City("City020","Johannesburg",new Country("Country010","South Africa")),
		            "+27110000101","thabo.n@mining.za")));

		// 21
		cab.addPerson(new Person("Lerato","Mokoena","23/09/1999",
		        new Address("H020","14","Long Street",
		            new City("City021","Cape Town",new Country("Country010","South Africa")),
		            "+27210000002","lerato.mokoena@example.com"),
		        new Address("O020","70","Waterfront Road",
		            new City("City021","Cape Town",new Country("Country010","South Africa")),
		            "+27210000102","lerato.m@tourism.za")));

		// 22
		cab.addPerson(new Person("Omar","Al-Farsi","01/08/1990",
		        new Address("H021","32","Sheikh Zayed Road",
		            new City("City022","Dubai",new Country("Country011","UAE")),
		            "+97140000001","omar.alfarsi@example.com"),
		        new Address("O021","101","Business Bay",
		            new City("City022","Dubai",new Country("Country011","UAE")),
		            "+97140000101","omar.a@trading.ae")));

		// 23
		cab.addPerson(new Person("Fatima","Khalid","10/10/1986",
		        new Address("H022","5","Corniche Street",
		            new City("City023","Abu Dhabi",new Country("Country011","UAE")),
		            "+97120000002","fatima.khalid@example.com"),
		        new Address("O022","60","Al Maryah Island",
		            new City("City023","Abu Dhabi",new Country("Country011","UAE")),
		            "+97120000102","fatima.k@finance.ae")));

		// 24
		cab.addPerson(new Person("Wei","Zhang","04/05/1998",
		        new Address("H023","18","Orchard Road",
		            new City("City024","Singapore",new Country("Country012","Singapore")),
		            "+6560000001","wei.zhang@example.com"),
		        new Address("O023","88","Shenton Way",
		            new City("City024","Singapore",new Country("Country012","Singapore")),
		            "+6560000101","wei.z@fintech.sg")));

		// 25
		cab.addPerson(new Person("Mei","Lin","13/01/2001",
		        new Address("H024","7","Bugis Street",
		            new City("City024","Singapore",new Country("Country012","Singapore")),
		            "+6560000002","mei.lin@example.com"),
		        new Address("O024","120","Raffles Place",
		            new City("City024","Singapore",new Country("Country012","Singapore")),
		            "+6560000102","mei.l@bank.sg")));

		// 26
		cab.addPerson(new Person("Arjun","Reddy","20/07/1997",
		        new Address("H025","9-12","Banjara Hills",
		            new City("City025","Hyderabad",new Country("Country001","India")),
		            "+919000000003","arjun.reddy@example.com"),
		        new Address("O025","55","Hitech City",
		            new City("City025","Hyderabad",new Country("Country001","India")),
		            "+919000000103","arjun.r@itfirm.in")));

		// 27
		cab.addPerson(new Person("Kavya","Nair","06/02/2005",
		        new Address("H026","23","Palarivattom",
		            new City("City002","Kochi",new Country("Country001","India")),
		            "+919000000004","kavya.nair@example.com"),
		        new Address("O026","12","MG Road",
		            new City("City002","Kochi",new Country("Country001","India")),
		            "+919000000104","kavya.n@boutique.in")));

		// 28
		cab.addPerson(new Person("Rohan","Kapoor","24/12/2006",
		        new Address("H027","44","Connaught Place",
		            new City("City026","New Delhi",new Country("Country001","India")),
		            "+919000000005","rohan.kapoor@example.com"),
		        new Address("O027","140","Cyber City",
		            new City("City027","Gurugram",new Country("Country001","India")),
		            "+919000000105","rohan.k@startup.in")));

		// 29
		cab.addPerson(new Person("Sara","Iqbal","02/03/2007",
		        new Address("H028","5","Residency Road",
		            new City("City028","Bengaluru",new Country("Country001","India")),
		            "+919000000006","sara.iqbal@example.com"),
		        new Address("O028","25","Outer Ring Road",
		            new City("City028","Bengaluru",new Country("Country001","India")),
		            "+919000000106","sara.i@itservices.in")));

		// 30
		cab.addPerson(new Person("Vikram","Singh","29/09/1989",
		        new Address("H029","88","Park Street",
		            new City("City029","Kolkata",new Country("Country001","India")),
		            "+919000000007","vikram.singh@example.com"),
		        new Address("O029","300","Salt Lake Sector V",
		            new City("City029","Kolkata",new Country("Country001","India")),
		            "+919000000107","vikram.s@media.in")));
		
//		cab.getAllPerson();
		
		UniqueAddressBook uab = new UniqueAddressBook();
		
		uab.addPerson(new Person("Abijith","PS","31/12/2003",
		        new Address("W1-69","69","Kainoor",new City("City001","Thrissur",new Country("Country001","India")),"+918089004951","abijithps2003@gmail.com"),
		        new Address("W17","101","MG Road",new City("City001","Thrissur",new Country("Country001","India")),"+91987654321","aitrichtech@gmail.com")));
		// 2 – unique
		uab.addPerson(new Person("Neha","Sharma","15/05/2000",
		    new Address("H001","12A","MG Road",
		        new City("City002","Kochi",new Country("Country001","India")),
		        "+919000000001","neha.sharma@example.com"),
		    new Address("O001","221","Infopark Road",
		        new City("City002","Kochi",new Country("Country001","India")),
		        "+919000000101","neha.work@example.com")));

		// 3 – unique
		uab.addPerson(new Person("Rahul","Menon","22/09/1998",
		    new Address("H002","34","Palakkad Road",
		        new City("City003","Palakkad",new Country("Country001","India")),
		        "+919000000002","rahul.menon@example.com"),
		    new Address("O002","56","Technopark",
		        new City("City004","Thiruvananthapuram",new Country("Country001","India")),
		        "+919000000102","rahul.menon.it@example.com")));

		// 4 – unique
		uab.addPerson(new Person("Emily","Johnson","03/03/1995",
		    new Address("H003","789","5th Avenue",
		        new City("City005","New York",new Country("Country002","USA")),
		        "+12125550001","emily.johnson@example.com"),
		    new Address("O003","15","Wall Street",
		        new City("City005","New York",new Country("Country002","USA")),
		        "+12125550101","emily.j@workcorp.com")));

		// 5 – unique
		uab.addPerson(new Person("Michael","Brown","11/11/1988",
		    new Address("H004","22","Market Street",
		        new City("City006","San Francisco",new Country("Country002","USA")),
		        "+14155550002","michael.brown@example.com"),
		    new Address("O004","300","Mission Street",
		        new City("City006","San Francisco",new Country("Country002","USA")),
		        "+14155550102","michael.b@startup.com")));

		// 6 – unique
		uab.addPerson(new Person("Sophia","Williams","27/07/2004",
		    new Address("H005","10","Baker Street",
		        new City("City007","London",new Country("Country003","United Kingdom")),
		        "+447700900001","sophia.williams@example.com"),
		    new Address("O005","220","Oxford Street",
		        new City("City007","London",new Country("Country003","United Kingdom")),
		        "+447700900101","sophia.w@designhub.co.uk")));

		// 7 – unique
		uab.addPerson(new Person("Oliver","Taylor","19/02/1990",
		    new Address("H006","45","King’s Road",
		        new City("City007","London",new Country("Country003","United Kingdom")),
		        "+447700900002","oliver.taylor@example.com"),
		    new Address("O006","5","Canary Wharf",
		        new City("City007","London",new Country("Country003","United Kingdom")),
		        "+447700900102","oliver.t@fintech.co.uk")));

		// 8 – unique
		uab.addPerson(new Person("Ava","Martin","09/09/1999",
		    new Address("H007","101","Queen Street",
		        new City("City008","Toronto",new Country("Country004","Canada")),
		        "+14160000001","ava.martin@example.com"),
		    new Address("O007","800","Bay Street",
		        new City("City008","Toronto",new Country("Country004","Canada")),
		        "+14160000101","ava.m@corp.ca")));

		// 9 – unique
		uab.addPerson(new Person("Liam","Clark","30/01/1985",
		    new Address("H008","77","Granville Street",
		        new City("City009","Vancouver",new Country("Country004","Canada")),
		        "+16040000002","liam.clark@example.com"),
		    new Address("O008","400","Robson Street",
		        new City("City009","Vancouver",new Country("Country004","Canada")),
		        "+16040000102","liam.c@agency.ca")));

		// 10 – unique
		uab.addPerson(new Person("Noah","Anderson","05/06/1992",
		    new Address("H009","12","George Street",
		        new City("City010","Sydney",new Country("Country005","Australia")),
		        "+61280000001","noah.anderson@example.com"),
		    new Address("O009","50","Pitt Street",
		        new City("City010","Sydney",new Country("Country005","Australia")),
		        "+61280000101","noah.a@tech.au")));

		// 11 – unique
		uab.addPerson(new Person("Isabella","Wilson","18/12/1980",
		    new Address("H010","33","Collins Street",
		        new City("City011","Melbourne",new Country("Country005","Australia")),
		        "+61380000002","isabella.wilson@example.com"),
		    new Address("O010","120","Flinders Lane",
		        new City("City011","Melbourne",new Country("Country005","Australia")),
		        "+61380000102","isabella.w@studio.au")));

		// 12 – unique
		uab.addPerson(new Person("Jonas","Müller","21/04/1993",
		    new Address("H011","9","Alexanderplatz",
		        new City("City012","Berlin",new Country("Country006","Germany")),
		        "+493000000001","jonas.mueller@example.com"),
		    new Address("O011","200","Unter den Linden",
		        new City("City012","Berlin",new Country("Country006","Germany")),
		        "+493000000101","jonas.m@consult.de")));

		// 13 – unique
		uab.addPerson(new Person("Emma","Schmidt","14/08/1987",
		    new Address("H012","55","Maximilianstraße",
		        new City("City013","Munich",new Country("Country006","Germany")),
		        "+498900000002","emma.schmidt@example.com"),
		    new Address("O012","10","Leopoldstraße",
		        new City("City013","Munich",new Country("Country006","Germany")),
		        "+498900000102","emma.s@finance.de")));

		// 14 – unique
		uab.addPerson(new Person("Lucas","Dubois","02/02/1996",
		    new Address("H013","7","Rue de Rivoli",
		        new City("City014","Paris",new Country("Country007","France")),
		        "+33140000001","lucas.dubois@example.com"),
		    new Address("O013","99","Boulevard Haussmann",
		        new City("City014","Paris",new Country("Country007","France")),
		        "+33140000101","lucas.d@retail.fr")));

		// 15 – unique
		uab.addPerson(new Person("Chloe","Lefevre","26/10/1991",
		    new Address("H014","18","Cours Mirabeau",
		        new City("City015","Aix-en-Provence",new Country("Country007","France")),
		        "+33442000002","chloe.lefevre@example.com"),
		    new Address("O014","3","Rue Espariat",
		        new City("City015","Aix-en-Provence",new Country("Country007","France")),
		        "+33442000102","chloe.l@art.fr")));

		// 16 – unique
		uab.addPerson(new Person("Haruto","Tanaka","07/07/1997",
		    new Address("H015","2-5","Shibuya",
		        new City("City016","Tokyo",new Country("Country008","Japan")),
		        "+81300000001","haruto.tanaka@example.com"),
		    new Address("O015","8-10","Roppongi",
		        new City("City016","Tokyo",new Country("Country008","Japan")),
		        "+81300000101","haruto.t@game.jp")));

		// 17 – unique
		uab.addPerson(new Person("Yui","Sato","29/03/1984",
		    new Address("H016","3-12","Umeda",
		        new City("City017","Osaka",new Country("Country008","Japan")),
		        "+81600000002","yui.sato@example.com"),
		    new Address("O016","5-20","Namba",
		        new City("City017","Osaka",new Country("Country008","Japan")),
		        "+81600000102","yui.s@commerce.jp")));

		// 18 – unique
		uab.addPerson(new Person("Carlos","Silva","12/01/2002",
		    new Address("H017","450","Avenida Paulista",
		        new City("City018","São Paulo",new Country("Country009","Brazil")),
		        "+551100000001","carlos.silva@example.com"),
		    new Address("O017","900","Rua Augusta",
		        new City("City018","São Paulo",new Country("Country009","Brazil")),
		        "+551100000101","carlos.s@startup.br")));

		// 19 – unique
		uab.addPerson(new Person("Ana","Oliveira","08/11/1994",
		    new Address("H018","120","Rua das Flores",
		        new City("City019","Rio de Janeiro",new Country("Country009","Brazil")),
		        "+552100000002","ana.oliveira@example.com"),
		    new Address("O018","300","Avenida Atlântica",
		        new City("City019","Rio de Janeiro",new Country("Country009","Brazil")),
		        "+552100000102","ana.o@agency.br")));

		// 20 – unique
		uab.addPerson(new Person("Thabo","Nkosi","16/04/1982",
		    new Address("H019","88","Mandela Street",
		        new City("City020","Johannesburg",new Country("Country010","South Africa")),
		        "+27110000001","thabo.nkosi@example.com"),
		    new Address("O019","25","Sandton Drive",
		        new City("City020","Johannesburg",new Country("Country010","South Africa")),
		        "+27110000101","thabo.n@mining.za")));

		// 21 – unique
		uab.addPerson(new Person("Lerato","Mokoena","23/09/1999",
		    new Address("H020","14","Long Street",
		        new City("City021","Cape Town",new Country("Country010","South Africa")),
		        "+27210000002","lerato.mokoena@example.com"),
		    new Address("O020","70","Waterfront Road",
		        new City("City021","Cape Town",new Country("Country010","South Africa")),
		        "+27210000102","lerato.m@tourism.za")));

		// 22 – unique
		uab.addPerson(new Person("Omar","Al-Farsi","01/08/1990",
		    new Address("H021","32","Sheikh Zayed Road",
		        new City("City022","Dubai",new Country("Country011","UAE")),
		        "+97140000001","omar.alfarsi@example.com"),
		    new Address("O021","101","Business Bay",
		        new City("City022","Dubai",new Country("Country011","UAE")),
		        "+97140000101","omar.a@trading.ae")));

		// 23 – unique
		uab.addPerson(new Person("Fatima","Khalid","10/10/1986",
		    new Address("H022","5","Corniche Street",
		        new City("City023","Abu Dhabi",new Country("Country011","UAE")),
		        "+97120000002","fatima.khalid@example.com"),
		    new Address("O022","60","Al Maryah Island",
		        new City("City023","Abu Dhabi",new Country("Country011","UAE")),
		        "+97120000102","fatima.k@finance.ae")));

		// 24 – unique
		uab.addPerson(new Person("Wei","Zhang","04/05/1998",
		    new Address("H023","18","Orchard Road",
		        new City("City024","Singapore",new Country("Country012","Singapore")),
		        "+6560000001","wei.zhang@example.com"),
		    new Address("O023","88","Shenton Way",
		        new City("City024","Singapore",new Country("Country012","Singapore")),
		        "+6560000101","wei.z@fintech.sg")));

		// 25 – unique
		uab.addPerson(new Person("Mei","Lin","13/01/2001",
		    new Address("H024","7","Bugis Street",
		        new City("City024","Singapore",new Country("Country012","Singapore")),
		        "+6560000002","mei.lin@example.com"),
		    new Address("O024","120","Raffles Place",
		        new City("City024","Singapore",new Country("Country012","Singapore")),
		        "+6560000102","mei.l@bank.sg")));

		// 26 – unique
		uab.addPerson(new Person("Arjun","Reddy","20/07/1997",
		    new Address("H025","9-12","Banjara Hills",
		        new City("City025","Hyderabad",new Country("Country001","India")),
		        "+919000000003","arjun.reddy@example.com"),
		    new Address("O025","55","Hitech City",
		        new City("City025","Hyderabad",new Country("Country001","India")),
		        "+919000000103","arjun.r@itfirm.in")));

		// ===== 5 DUPLICATE ENTRIES (same firstName + lastName + CITY) =====

		// 27 – duplicate of Neha Sharma in Kochi
		uab.addPerson(new Person("Neha","Sharma","01/01/2001",
		    new Address("H101","99","Broadway",
		        new City("City002","Kochi",new Country("Country001","India")),
		        "+919000009999","neha.dup@example.com"),
		    new Address("O101","10","Marine Drive",
		        new City("City002","Kochi",new Country("Country001","India")),
		        "+919000009901","neha.dup.work@example.com")));

		// 28 – duplicate of Lucas Dubois in Paris
		uab.addPerson(new Person("Lucas","Dubois","31/12/1990",
		    new Address("H102","5","Rue de la Paix",
		        new City("City014","Paris",new Country("Country007","France")),
		        "+33140000999","lucas.dup@example.com"),
		    new Address("O102","77","Champs-Élysées",
		        new City("City014","Paris",new Country("Country007","France")),
		        "+33140001999","lucas.dup@work.fr")));

		// 29 – duplicate of Wei Zhang in Singapore
		uab.addPerson(new Person("Wei","Zhang","09/09/1999",
		    new Address("H103","20","Serangoon Road",
		        new City("City024","Singapore",new Country("Country012","Singapore")),
		        "+6560000999","wei.z.dup@example.com"),
		    new Address("O103","90","Cecil Street",
		        new City("City024","Singapore",new Country("Country012","Singapore")),
		        "+6560001999","wei.z.dup@startup.sg")));

		// 30 – duplicate of Arjun Reddy in Hyderabad
		uab.addPerson(new Person("Arjun","Reddy","05/05/1995",
		    new Address("H104","11","Jubilee Hills",
		        new City("City025","Hyderabad",new Country("Country001","India")),
		        "+919000008888","arjun.dup@example.com"),
		    new Address("O104","60","Financial District",
		        new City("City025","Hyderabad",new Country("Country001","India")),
		        "+919000018888","arjun.dup@fin.in")));

		// 31 – duplicate of Emily Johnson in New York
		uab.addPerson(new Person("Emily","Johnson","10/10/1990",
		    new Address("H105","456","Madison Avenue",
		        new City("City005","New York",new Country("Country002","USA")),
		        "+12125559999","emily.j.dup@example.com"),
		    new Address("O105","20","Broad Street",
		        new City("City005","New York",new Country("Country002","USA")),
		        "+12125558999","emily.j.dup@bank.com")));
		
//		uab.getPersonOrderedByAge();
	}
}
