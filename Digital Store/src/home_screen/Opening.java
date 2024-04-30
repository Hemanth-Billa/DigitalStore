package home_screen;
public class Opening {

	private static final String RESET = "\033[0m";  // Text Reset
	private static final String BLACK_BOLD = "\033[1;30m";
	
	public static void Open() throws InterruptedException
	{
		System.out.println(BLACK_BOLD+"************************************************************************************************************************************************************");
		System.out.println("************************************************************************************************************************************************************"+RESET);
  String a = """
 	                        oooooo     ooo      oooo oooooooooooo ooooo          .oooooo.     .oooooo.   ooo        ooooo oooooooooooo                           
                           `888.    `888.     .8'  `888'     `8 `888'         d8P'  `Y8b   d8P'  `Y8b  `88.       .888' `888'     `8                           
                            `888.   .8888.   .8'    888          888         888          888      888  888b     d'888   888                                   
                             `888  .8'`888. .8'     888oooo8     888         888          888      888  8 Y88. .P  888   888oooo8                              
                              `888.8'  `888.8'      888    "     888         888          888      888  8  `888'   888   888    "                              
                               `888'    `888'       888       o  888       o `88b    ooo  `88b    d88'  8    Y     888   888       o                           
                                `8'      `8'       o888ooooood8 o888ooooood8  `Y8bood8P'   `Y8bood8P'  o8o        o888o o888ooooood8                           
                                                                                                                                                         
                                                                                                                                                         
                                                                                                                                                         
		                                                                ooooooooooooo   .oooooo.                                                                               
		                                                                8'   888   `8  d8P'  `Y8b                                                                              
		                                                                     888      888      888                                                                             
		                                                                     888      888      888                                                                             
		                                                                     888      888      888                                                                             
		                                                                     888      `88b    d88'                                                                             
		                                                                    o888o      `Y8bood8P'                                                                              
	                                                                                                                                                         
                                                                                                                                                         
                                                                                                                                                         
    oooooooooo.   ooooo   .oooooo.    ooooo ooooooooooooo       .o.       ooooo              .oooooo..o ooooooooooooo   .oooooo.   ooooooooo.   oooooooooooo 
    `888'   `Y8b  `888'  d8P'  `Y8b   `888' 8'   888   `8      .888.      `888'             d8P'    `Y8 8'   888   `8  d8P'  `Y8b  `888   `Y88. `888'     `8 
     888      888  888  888            888       888          .8"888.      888              Y88bo.           888      888      888  888   .d88'  888         
     888      888  888  888            888       888         .8' `888.     888               `"Y8888o.       888      888      888  888ooo88P'   888oooo8    
     888      888  888  888     ooooo  888       888        .88ooo8888.    888                   `"Y88b      888      888      888  888`88b.     888    "    
     888     d88'  888  `88.    .88'   888       888       .8'     `888.   888       o      oo     .d8P      888      `88b    d88'  888  `88b.   888       o 
    o888bood8P'   o888o  `Y8bood8P'   o888o     o888o     o88o     o8888o o888ooooood8      8""88888P'      o888o      `Y8bood8P'  o888o  o888o o888ooooood8 
 		  
 		""";

   
		
		for(int i = 0 ; i < a.length(); i++)
		{
			System.out.print(a.charAt(i));
			Thread.sleep(1);
		}
		System.out.println(BLACK_BOLD+"************************************************************************************************************************************************************"+RESET);
		Registration.registration();
	}
	public static void proto() throws InterruptedException
	{
		System.out.println(BLACK_BOLD+"************************************************************************************************************************************************************");
		String intro = """
				\nDear Valued Customer,\n\nWe are delighted to have you here and would like to take this opportunity to thank you for choosing our platform to satisfy your digital needs.\n\nOur store offers a wide range of digital products and much more.\n\nWe are committed to providing you with the best customer experience possible, and our team is always available to assist you with any questions or concerns\n\nyou may have.We strive to make your shopping experience convenient, fast, and secure. Our payment gateway is highly secured, and you can rest assured \n\nthat your personal information is safe with us. Our platform is easy to navigate, making it effortless for you to find the products you need.\n\nOnce again, thank you for choosing our store. We look forward to serving you and hope that you have a fantastic shopping experience with us.\n\nFOR BEST EXPERIENCE WE WILL DISPLAY THE PRODUCTS AVAILABLE IN OUR STORE.\n\nBest regards,\n\nThe Digital Store Team (HEMANTH , SAHITHI , YEDUKONDALU , LAXMI). 
				""";
		for(int i = 0 ; i < intro.length(); i++)
		{
			System.out.print(intro.charAt(i));
			Thread.sleep(15);
		}
				System.out.println("************************************************************************************************************************************************************"+RESET);
		System.out.println();
		System.out.println(BLACK_BOLD+"\t"+"                                                             @@@                @@@                                  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");Thread.sleep(200);
		System.out.println("     "+"  @@@@@@@@@@@@@@@@@@@@@                                   @@@              @@@                                 @@@                             @@@");Thread.sleep(200);
		System.out.println("     "+"@@@     @@@@@@@@@     @@@                                  @@@           @@@                                   @@             @@@@@             @@");Thread.sleep(200);
		System.out.println("     "+"@@@@@@@@@@@@@@@@@@@@@@@@@	                                 @@@@       @@@@                                    @@           @@  O  @@           @@");Thread.sleep(200);
		System.out.println("     "+"@@                     @@	                                   @@@@   @@@@                                      @@           @@  O  @@           @@");Thread.sleep(200);
		System.out.println("     "+"@@                     @@	                ......................@@@@@@@.....................                  @@             @@@@@             @@");Thread.sleep(200);
		System.out.println("     "+"@@                     @@	           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@             @@                               @@");Thread.sleep(200);
		System.out.println("     "+"@@                     @@           @@@       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                    @@            @@                               @@");Thread.sleep(200);
		System.out.println("     "+"@@                     @@	        @@@    @@@@                               @@@@                @@@           @@        &  @ @ @ @ @ @ &       @@");Thread.sleep(200);
		System.out.println("     "+"@@                     @@	        @@@  @@@                                     @@@              @@@           @@      @                  @     @@");Thread.sleep(200);
		System.out.println("     "+"@@  _________________  @@	        @@@  @@           _________________           @@              @@@           @@    @  _________________  @    @@");Thread.sleep(200);
		System.out.println("     "+"@@ |                 | @@	        @@@ @@@          |                 |          @@@     @@@@    @@@           @@   @  |                 |  @   @@");Thread.sleep(200);
		System.out.println("     "+"@@ | * SMARTPHONES * | @@	        @@@ @@@          |                 |          @@@     @@@@    @@@           @@   @  |    * AUDIO *    |  @   @@");Thread.sleep(200);
		System.out.println("     "+"@@ |        &        | @@	        @@@ @@@          | * TELEVISION *  |          @@@             @@@           @@   @  |  *  DEVICES  *  |  @   @@");Thread.sleep(200);
		System.out.println("     "+"@@ |   * TABLETS *   | @@	        @@@ @@@          |                 |          @@@             @@@           @@   @  |                 |  @   @@");Thread.sleep(200);
		System.out.println("     "+"@@ |_________________| @@	        @@@ @@@          |_________________|          @@@             @@@           @@   @  |_________________|  @   @@");Thread.sleep(200);
		System.out.println("     "+"@@                     @@	        @@@ @@@                                       @@@     @@@@    @@@           @@    @                     @    @@");Thread.sleep(200);
		System.out.println("     "+"@@                     @@	        @@@ @@@                                       @@@     @@@@    @@@           @@     @                   @     @@");Thread.sleep(200);
		System.out.println("     "+"@@                     @@	        @@@ @@@                                       @@@             @@@           @@       & @ @ @ @ @ @ @ &       @@");Thread.sleep(200);
		System.out.println("     "+"@@                     @@	        @@@ @@@                                       @@@             @@@           @@                               @@");Thread.sleep(200);
		System.out.println("     "+"@@@@@@@@@@@@@@@@@@@@@@@@@	        @@@   @@@@                                 @@@@               @@@           @@   O       O       O       O   @@");Thread.sleep(200);
		System.out.println("     "+"@@         o o         @@           @@@      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                   @@@           @@                               @@");Thread.sleep(200);
		System.out.println("     "+"@@        o o o        @@	          @@@                                                         @@             @@@                           @@@");Thread.sleep(200);
		System.out.println("     "+" @@@@@@@@@@@@@@@@@@@@@@@	            @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@");Thread.sleep(200);
		System.out.println();Thread.sleep(100);
		System.out.println();Thread.sleep(100);
		System.out.println();Thread.sleep(80);
		System.out.println("\t\t"+" @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");Thread.sleep(200);
		System.out.println("\t\t"+"@@@                                    @@@                     &@@                                                      @@&");Thread.sleep(200);
		System.out.println("\t\t"+"@@@  @@@                               @@@                     &@@                                                      @@&");Thread.sleep(200);
		System.out.println("\t\t"+"@@@  @ @                               @@@                     &@@                                                      @@&");Thread.sleep(200);
		System.out.println("\t\t"+"@@@  @ @                               @@@                     &@@                                                      @@&");Thread.sleep(200);
		System.out.println("\t\t"+"@@@  @ @                               @@@                     &@@                 _________________                    @@&");Thread.sleep(200);
		System.out.println("\t\t"+"@@@  @@@                               @@@                     &@@                |                 |                   @@&");Thread.sleep(200);
		System.out.println("\t\t"+"@@@                                    @@@                     &@@                |   * LAPTOPS *   |                   @@&");Thread.sleep(200);
		System.out.println("\t\t"+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                     &@@                |        &        |                   @@&");Thread.sleep(200);
		System.out.println("\t\t"+"@@@                                    @@@                     &@@                |  *  MONITORS *  |                   @@&");Thread.sleep(200);
		System.out.println("\t\t"+"@@@  @@@                               @@@                     &@@                |_________________|                   @@&");Thread.sleep(200);
		System.out.println("\t\t"+"@@@  @ @                               @@@                     &@@                                                      @@&");Thread.sleep(200);
		System.out.println("\t\t"+"@@@  @ @                               @@@                     &@@                                                      @@&");Thread.sleep(200);
		System.out.println("\t\t"+"@@@  @ @                               @@@                     &@@                                                      @@&");Thread.sleep(200);
		System.out.println("\t\t"+"@@@  @ @                               @@@                     &@@                                                      @@&");Thread.sleep(200);
		System.out.println("\t\t"+"@@@  @ @     _________________         @@@                     &@@                                                      @@&");Thread.sleep(200);
		System.out.println("\t\t"+"@@@  @@@    |                 |        @@@                      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");Thread.sleep(200);
		System.out.println("\t\t"+"@@@         | *    HOME    *  |        @@@                      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");Thread.sleep(200);
		System.out.println("\t\t"+"@@@         | * APPLIANCES *  |        @@@                      @@  [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] @@");Thread.sleep(200);
		System.out.println("\t\t"+"@@@         |                 |        @@@                     @@@  [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] @@@");Thread.sleep(200);
		System.out.println("\t\t"+"@@@         |_________________|        @@@                    @@@@  [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] @@@@");Thread.sleep(200);
		System.out.println("\t\t"+"@@@                                    @@@                   @@@@@  [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] @@@@@");Thread.sleep(200);
		System.out.println("\t\t"+"@@@                                    @@@                  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");Thread.sleep(200);
		System.out.println("\t\t"+"@@@                                    @@@                 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");Thread.sleep(200);
		System.out.println("\t\t"+"@@@                                    @@@                @@@@@@@@@@@@@@@@@@@@@@@@@@                 @@@@@@@@@@@@@@@@@@@@@@@@@@@");Thread.sleep(200);
		System.out.println("\t\t"+"@@@                                    @@@               @@@@@@@@@@@@@@@@@@@@@@@@@@@                 @@@@@@@@@@@@@@@@@@@@@@@@@@@@");Thread.sleep(200);
		System.out.println("\t\t"+"@@@                                    @@@              @@@@@@@@@@@@@@@@@@@@@@@@@@@@_________________@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");Thread.sleep(200);
		System.out.println("\t\t"+"@@@                                    @@@             @@@@@@@@@@@@@@@@@@@@@@@@@@@@|________|________|@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");Thread.sleep(200);
		System.out.println("\t\t"+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@             @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");Thread.sleep(200);
		System.out.println("\t\t"+"  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");Thread.sleep(200);
		System.out.println("\t\t"+"   @@@@@@@@                   @@@@@@@@"+RESET);System.out.println();
		System.out.println(BLACK_BOLD+"************************************************************************************************************************************************************");
		System.out.println("************************************************************************************************************************************************************"+RESET);
		System.out.println(RESET);
		System.out.println();
		try {
			Main_Home.realOne();
		} catch (Exception e) {
		}
	}
//	public static void main(String[] args) throws InterruptedException   {
//		Open();
//		//Project.select();
//}
}