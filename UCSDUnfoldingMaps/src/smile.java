import processing.core.PApplet;

public class smile extends PApplet{

	//private String url ="C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg";
	//private PImage backgroundImg;
	public void setup() 
	{
		size(400,400);
		//backgroundImg=loadImage(url,"jpg");
	}
	public void draw()
	{
		/*backgroundImg.resize(0, height);
		image(backgroundImg, 0, 0);
		fill(255,255,0);
		ellipse(width/4,width/5,height/5,height/5);*/
		
		fill(255,255,0);
		ellipse(200,200,400,400);
		fill(0,0,0);
		ellipse(120,120,60,60);
		ellipse(280,120,60,60);
		noFill();
		arc(200,250,200,130,0,PI);
	}
}
