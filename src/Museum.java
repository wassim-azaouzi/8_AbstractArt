import java.util.ArrayList;

public class Museum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Painting p1= new Painting("Starry Nights", "Van Gogh", "imagination of a circular world", "Oily"); 
		Painting p2= new Painting("Mona Lisa", "Picasso", "Human Movement", "Oily"); 
		Painting p3= new Painting("Mosaic", "Romans", "Made from small marbels", "Rocks"); 
		Sculpture s1= new Sculpture("David", "Michelangelo", "most famous scuplture in the world", "Marbel");
		Sculpture s2= new Sculpture("Thinker", "Auguste Rodin", "naked man resting his chin on his hand", "Bronze");
		
		ArrayList<Art> museum = new ArrayList<Art> ();
		museum.add(p1);
		museum.add(p2);
		museum.add(p3);
		museum.add(s1);
		museum.add(s2);
		
		for (Art a :museum) {
			a.viewArt();
		}

		
	}

}
