package mx.tec.web.lab.entity;

public class CesantiaYVejez {
	
	public double getUMA (int year) {
		
		double uma = 0;
		
		if (year == 2016){
			uma = 73.04;
			return uma;
		}else if (year == 2017) {
			uma = 75.49;
			return uma;
		}else if (year == 2018) {
			uma = 80.6;
			return uma;
		}else if (year == 2019) {
			uma = 84.49;
			return uma;
		}else if (year == 2020) {
			uma = 86.88;
			return uma;
		}else {
			uma = 89.62;
			return uma;
		}
	}
	public double getFactorintegracion(double wYear) {
		
		double fi = 0;
		
		if (wYear <= 1) {
			fi = 1.0452;
			return fi;
		} else if (wYear <= 2) {
			fi = 1.0466;
			return fi;
		} else if (wYear <= 3) {
			fi = 1.0479;
			return fi;
		} else if (wYear <= 4) {
			fi = 1.0493;
			return fi;
		} else if (wYear <= 5) {
			fi = 1.0507;
			return fi;
		} else if (wYear <= 6) {
			fi = 1.0507;
			return fi;
		} else {
			fi = 1.0507;
			return fi;
		}
	}
	
	public double getSBC(double uma, double fi, double salarioMinimo) {
		
		double sbc;
		double umaF;
		sbc = salarioMinimo * fi;
		umaF = uma * 25;
		
		if (sbc <= umaF) {
			return sbc;
		} else {
			sbc = umaF;
			return umaF;
		}
		
	}
}
