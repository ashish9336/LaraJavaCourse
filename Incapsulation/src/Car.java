class Car 
{
	private String make;
	private String model;
	private int year;
	//getters and setters for make, model , and year
	//
	public String getMake()
	{
	return make;
	}
	
	public String getModel()
	{
	return model;
	}
	
	public int getYear()
	{
	return year;
	}


	public void setMake(String make)
	{
	 this.make= make;
	}
	
	public void setModel(String model)
	{
	 this.model= model;
	}
	
	public void setYear(int year)
	{
     this.year= year;
	}

}
class CarDriver
{

	public static void main(String[] args) 
	{
		Car car = new Car(); // set the value
		car.setMake("Toyota");
		car.setModel("Camary");
		car.setYear(2020);
		String make = car.getMake();// store vraible
		String model = car.getModel();
		int year = car.getYear();
		System.out.println("Make :" + make);
		System.out.println("Model :" + model);
		System.out.println("Year :" + year);
	}
}
 

