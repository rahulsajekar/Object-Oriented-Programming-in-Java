package module4;

import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PGraphics;

/** Implements a visual marker for land earthquakes on an earthquake map
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * @author Your name here
 *
 */
public class LandQuakeMarker extends EarthquakeMarker {
	
	
	public LandQuakeMarker(PointFeature quake) {
		
		// calling EarthquakeMarker constructor
		super(quake);
		
		// setting field in earthquake marker
		isOnLand = true;
	}


	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		// Draw a centered circle for land quakes
		// DO NOT set the fill color here.  That will be set in the EarthquakeMarker
		// class to indicate the depth of the earthquake.
		// Simply draw a centered circle.
		
		// HINT: Notice the radius variable in the EarthquakeMarker class
		// and how it is set in the EarthquakeMarker constructor
		
		// TODO: Implement this method
		
		if(super.getMagnitude() < THRESHOLD_LIGHT) 
		{
			pg.ellipse(x,y,3,3);
		}
		else if(super.getMagnitude() < THRESHOLD_MODERATE)
		{
			pg.ellipse(x,y,6,6);
		}
		else
		{
			pg.ellipse(x,y,9,9);
		}
		
		
	}
	

	// Get the country the earthquake is in
	public String getCountry() {
		return (String) getProperty("country");
	}



		
}