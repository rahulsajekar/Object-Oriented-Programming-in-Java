import processing.core.PApplet;
import processing.core.PImage;

public class sun extends PApplet{

	private String url ="C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg";
	private PImage backgroundImg;
	
	public void setup()
	{
		backgroundImg=loadImage(url,"jpg");
		size(200,200);
	}
	
	public void draw()
	{
		backgroundImg.resize(0, height);
		image(backgroundImg, 0, 0);
		int[] color = addkey(second());
		fill(color[0],color[1],color[2]);
		ellipse(width/4,height/5,height/5,height/5);
		
	}

	private int[] addkey(int second) {
		int[] rgb = new int[3];
		float diffFrom30 = Math.abs(30-second);
		float ratio = diffFrom30/30;
		rgb[0] = (int)(255*ratio);
		rgb[1] =(int)(255 * ratio);
		rgb[2] = 0;
		//System.out.println(rgb[0]+rgb[1]);
		return rgb;
	}
}
