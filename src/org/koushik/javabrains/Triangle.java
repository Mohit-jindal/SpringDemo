package org.koushik.javabrains;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape //InitializingBean,DisposableBean //ApplicationContextAware, BeanNameAware
{

	/*
	 * private List<Point> points;
	 * 
	 * public List<Point> getPoints() { return points; }
	 * 
	 * public void setPoints(List<Point> points) { this.points = points; }
	 */
	
	  private Point pointA; private Point pointB; private Point pointC;
	  //private ApplicationContext context = null;	  
	  
	  public Point getPointA() { return pointA; }
	  
	  
	  public void setPointA(Point pointA) { this.pointA = pointA; }
	  
	  
	  public Point getPointB() { return pointB; }
	  
	  
	  public void setPointB(Point pointB) { this.pointB = pointB; }
	  
	  
	  public Point getPointC() { return pointC; }
	  
	  
	  public void setPointC(Point pointC) { this.pointC = pointC; }
	 
	public void draw() {
		System.out.println("Drawing Triangle");
		/*
		 * for(Point point : points) {
		 * System.out.println("Point = ("+point.getX()+", "+point.getY()+")"); }
		 */ // System.out.println(getType() + " Triangle Drawn of Height " + getHeight());
		
		  System.out.println("Point A = ("+getPointA().getX()+", "+getPointA().getY()+		  ")");
		  System.out.println("Point B = ("+getPointB().getX()+", "+getPointB().getY()+		  ")");
		  System.out.println("Point C = ("+getPointC().getX()+", "+getPointC().getY()+		  ")");
		  
		  }


	
	/*
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("InitializingBean init method called for Triangle"); }
	 * 
	 * 
	 * @Override public void destroy() throws Exception {
	 * System.out.println("DisposableBean destroy method called for Triangle"); }
	 */	 

/*	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.context = context;
	}


	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean name is: " + beanName);		
	}
*/
	
	
	  public void myInit() {
	  System.out.println("My init method called for Triangle"); }
	  
	  public void cleanUp() {
	  System.out.println("My cleanUp method called for Triangle"); }
	 	
	
	/*
	 * private String type; private int height;
	 * 
	 * public Triangle(int height) { super(); this.height = height; }
	 * 
	 * public Triangle(String type) { super(); this.type = type; }
	 * 
	 * public Triangle(String type, int height) { super(); this.type = type;
	 * this.height = height; }
	 * 
	 * public int getHeight() { return height; }
	 * 
	 * public void setHeight(int height) { this.height = height; }
	 * 
	 * public String getType() { return type; }
	 * 
	 * public void setType(String type) { this.type = type; }
	 */

}
