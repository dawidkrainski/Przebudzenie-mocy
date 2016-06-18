package PrzebudzenieMocy1;



public class Wojownik extends ProfesjaDekorator{
	Rasa rasa;

		public Wojownik(Rasa rasa){
			this.rasa = rasa;
		}
		
		public String pobierzOpis(){
			return rasa.pobierzOpis() + "Profesja to wojownik posiada takie umiejętności jak Walka wręcz, walka mieczekm , walka toporem i walka włócznią \n";
		}
		
}
