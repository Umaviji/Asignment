
	package PracticeVechicle;

	public class Vehicle implements Loan,Insurance{

	private String modelname;
	private String Vehiclenumber;
	private String Vehicletype;
	private int price;

	public Vehicle(String modelname,String Vehiclenumber,String Vehicletype,int price) {
	   this.modelname=modelname;
	this.Vehiclenumber=Vehiclenumber;
	this.Vehicletype=Vehicletype;
	this.price=price;
	}
	public String getModelname() {
	return modelname;
	}

	public void setModelname(String modelname) {
	this.modelname = modelname;
	}

	public String getVehiclenumber() {
	return Vehiclenumber;
	}

	public void setVehiclenumber(String vehiclenumber) {
	Vehiclenumber = vehiclenumber;
	}

	public String getVehicletype() {
	return Vehicletype;
	}

	public void setVehicletype(String vehicletype) {
	Vehicletype = vehicletype;
	}

	public int getPrice() {
	return price;
	}

	public void setPrice(int price) {
	this.price = price;
	}
	@Override
	public double takeinsurance() {
	if (price <= 150000) {
	return 3500;
	             } else if (price > 150000 && price <= 300000) {
	              return 4000;
	             } else if (price > 300000) {

	               return 5000;
	               }
	              return 0;
	   }
	@Override
	  public double issueloan() {
	     if (Vehicletype.startsWith("4")) {
	 return price*80.0/100.0;
	}else if (Vehicletype.startsWith("3")) {
	return price*75.0/100.0;

	}else if (Vehicletype.startsWith("2")) {
	return price*50.0/100.0;

	}


	return 0;
	}



	

	}
	
