package introduccion;

import java.util.Scanner;

import introduccion.Empleado;

public class PEmpleado {

    public static void main(String[] args) {
        String tipoDocumento;
        int doc;
        String nombre;
        String apellido;
        double horastrabajadas;
        double valorHora;
        String cargo;
        String departamento;

        Scanner lector = new Scanner(System.in);
        System.out.println("Digita tu tipo de documento");
        tipoDocumento = lector.next();
        System.out.println("Digita tu documento");
        doc = lector.nextInt();
        System.out.println("Digita tu nombre");
        nombre = lector.next();
        System.out.println("Digita tu apellido");
        apellido = lector.next();
        System.out.println("Digita tus horas trabajadas");
        horastrabajadas = lector.nextDouble();
        System.out.println("Digita tu valor Hora");
        valorHora = lector.nextDouble();
        System.out.println("Digita tu cargo");
        cargo = lector.next();
        System.out.println("Digita tu departamento");
        departamento = lector.next();
        Empleado empleado = new Empleado(tipoDocumento, doc, nombre, apellido, horastrabajadas, valorHora, cargo,
                departamento);
        empleado.calcularHonorarios();
        lector.close();
    }
}
