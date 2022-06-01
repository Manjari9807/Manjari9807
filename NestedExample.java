package practice;

import java.rmi.Remote;

class Tv {
	   // double price;
	     void Tv()
	    {
	    	// super();
	    	System.out.println("Tv price:Rs.25,000/-");
	    }
	   public static class Remote extends Tv
	    {
		  // super.Tv();
		   
		  
	   	   void getprice()
	   	  {
	   		   super.Tv();
	            System.out.println("Remote price:Rs.250/-");
	        }
	    }

	   
	    protected static class CableConnection{

	        void getSpeed(){
	           System.out.println("speed:450mb/s");
	        }
	    }
	}

	public class NestedExample {
	    public static void main(String[] args) {

	       
	       // Tv tv = new Tv();
           //  tv.Tv();
	       
	      //  Tv.Remote remote = tv.new Remote();
           //remote.getprice();
	        
	        //Tv.CableConnection cb = tv.new CableConnection();
	        //cb.getSpeed();
	      //  System.out.print(tv.getprice());
	    	Tv.Remote remote=new Tv.Remote();
	    	remote.getprice();
	    }
	}
	