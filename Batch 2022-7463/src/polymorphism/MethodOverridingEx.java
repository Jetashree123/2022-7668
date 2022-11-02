package polymorphism;

class Hospital{

	int getNumberOfPatients()

	{

		return 0;

	}

}

class HealthIndia extends Hospital{

	@Override
	int getNumberOfPatients()

	{

		return 1657 ;

	}

}

class IVY extends Hospital{
	@Override
	int getNumberOfPatients()

	{

		return 2965 ;

	}

}

class Apollo extends Hospital{
	@Override
	int getNumberOfPatients()

	{

		return 1631 ;

	}

}



public class MethodOverridingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HealthIndia healthIndia=new HealthIndia();

		IVY ivy=new IVY();

		Apollo apollo=new Apollo();

		int healthIndiaPatients= healthIndia.getNumberOfPatients();

		int iVYPatients= ivy.getNumberOfPatients();

		int apolloPatients= apollo.getNumberOfPatients();

		System.out.println("Health India hospital patients: "+ healthIndiaPatients);

		System.out.println("IVY hospital Patients: "+ iVYPatients);

		System.out.println("Apollo hospital Patients: " +apolloPatients);


	}

}
