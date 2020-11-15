package p4_group_8_repo;

import javafx.scene.image.Image;

public class Digit extends StaticActor{


	public Digit(String ImageLink, double size, double xPos, double yPos) {
		super(ImageLink, size, xPos, yPos);
	}


	public void setDigit(int n){
		Image digitImage = new Image("file:src/p4_group_8_repo/"+n+".png", size, size, true, true);
	}

	@Override
	public String getActorClassName() {
		return "Digit";
	}

	
}
