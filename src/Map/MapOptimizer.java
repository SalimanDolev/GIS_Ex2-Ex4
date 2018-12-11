package Map;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Geom.Point3D;

public class MapOptimizer {
	public Point3D LeftUpCorner;
	public Point3D RighttUpCorner;
	public Point3D LeftDownCorner;
	public Point3D RighttDownCorner;
	public BufferedImage myImage;
	
	public MapOptimizer() throws Exception {
		this.myImage = ImageIO.read(new File("C:\\Users\\salim\\Desktop\\�������\\Projects\\GIS_Ex02\\Ariel1.png"));
		this.LeftUpCorner = new Point3D(32.105733,35.202369 );
		this.RighttUpCorner = new Point3D(32.105739, 35.212436);
		this.LeftDownCorner = new Point3D(32.101858,35.202381);
		this.RighttDownCorner = new Point3D(32.101864, 35.212428);
		
	}
	
	public void SetCorners(Point3D ul, Point3D ur,Point3D dr,Point3D dl) {
		this.LeftDownCorner = dl;
		this.RighttDownCorner = dr;
		this.LeftUpCorner = ul;
		this.RighttUpCorner = ur;
	}
	
	public double getWidth() {
		return this.myImage.getWidth();
	}
	
	public double getHight() {
		return this.myImage.getHeight();
	}
	
	public double Range() {
		double pro =this.myImage.getWidth() /(this.LeftUpCorner.x()-this.RighttUpCorner.x());
		return pro;
	}
	

}