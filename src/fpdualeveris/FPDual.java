package fpdualeveris;

import variables.Developer;
import variables.Speciality;

/**
 * Clase principal donde se ejecuta el programa.
 * @author David Cesar Fernandez Aliseda
 */

public class FPDual {
	public static void main(String[] args) {
        variablesChallenge();
    }
	/**
	 * Metodo para ejecutar el programa.
	 */
    private static void variablesChallenge(){
        //Obtener el nombre de la empresa
        System.out.println(Developer.getCOMPANY());

        //Primer programador
        Developer dev1 = new Developer("David", Speciality.SAP);
        System.out.println(dev1.toString());

        //Obtener numero de empleados totales
        System.out.println("\nEl numero de empleados es "+Developer.getEmployeesNum());

        //Segundo programador
        Developer dev2 = new Developer("Rafa", Speciality.JAVA);
        //Quitar dos dias de vacaciones al segundo programador
        dev2.decreaseHolidays(2);
        System.out.println(dev2.toString());

        //Tercer programador
        Developer dev3 = new Developer("Maria");
        System.out.println(dev3.toString());

        //Cuarto programador
        Developer dev4 = new Developer("Sara", Speciality.HTML);
        System.out.println(dev4.toString());

        //Obtener numero de empleados totales
        System.out.println("\nEl numero de empleados es "+Developer.getEmployeesNum());

        //Cambiar especialidad
        dev4.changeSpeciality(Speciality.JAVA);
        System.out.println(dev4.getSpeciality());

        //Dar especialidad a dev3
        dev3.giveSpeciality(Speciality.JAVA);
        System.out.println(dev3.toString());
    }
}

