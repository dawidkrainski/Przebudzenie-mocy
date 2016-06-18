package PrzebudzenieMocy1;



public class Zbrojmistrz extends ProfesjaDekorator{
	Rasa rasa;

		public Zbrojmistrz(Rasa rasa){
			this.rasa = rasa;
		}
		
		public String pobierzOpis(){
			return rasa.pobierzOpis() + "Profesja to Zbrojmistrz posiada takie umiejętności jak naprawa ekwipunku \n";
		}
		
}
