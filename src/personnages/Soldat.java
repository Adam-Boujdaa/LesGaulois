package personnages;

public class Soldat extends Romain{
	
	public enum Grade { //obligé de mettre en public pour que ça marche avec le test fonctionnel, ça affiche aucune info sur le soldat sans utiliser de getter de tte façon
        SOLDAT,
        TESSERARIUS,
        OPTIO,
        CENTURION
    }
	
	private Grade grade;
	
	public Soldat(String nom, int force, Grade grade) {
		super(nom,force);
		this.grade=grade;
	}
	
	public Grade getGrade () {
		return grade;
	}
	
}
