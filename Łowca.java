package PrzebudzenieMocy1;



public class Łowca extends ProfesjaDekorator{
	Rasa rasa;

		public Łowca(Rasa rasa){
			this.rasa = rasa;
		}
		
		public String pobierzOpis(){
			return rasa.pobierzOpis() + "Profesja to Łowca posiada takie umiejętności jak skradanie i strzelectwo \n";
		}
		
}
