package PrzebudzenieMocy1;



public class Zabójca extends ProfesjaDekorator{
	Rasa rasa;

		public Zabójca(Rasa rasa){
			this.rasa = rasa;
		}
		
		public String pobierzOpis(){
			return rasa.pobierzOpis() + "Profesja to Zabójca posiada takie umiejętności jak skradanie, trucizny i walka w ręcz \n";
		}
		
}
