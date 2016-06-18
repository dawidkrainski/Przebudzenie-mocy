package PrzebudzenieMocy1;

public class Mag extends ProfesjaDekorator{
	Rasa rasa;

		public Mag(Rasa rasa){
			this.rasa = rasa;
		}
		
		public String pobierzOpis(){
			return rasa.pobierzOpis() + "Profesja to Mag posiada takie umiejętności jak czarowanie i tworzenie eliksirów \n";
		}
		
}