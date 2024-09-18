
package entidades;

public class Colegio {
    
    public static void main(String[] args) {
        Materia materiaIngles = new Materia(1, "Ingles I", 1);
        Materia materiaMatematicas = new Materia(2, "Matematicas", 1);
        Materia materiaLaboratorio = new Materia(3, "Laboratorio I", 1);
        
        Alumno alumnoLopez = new Alumno(1001, "Lopez", "Martin");
        Alumno alumnoMartinez = new Alumno(1002, "Martinez", "Brenda");
        
        alumnoLopez.agregarMateria(materiaIngles);
        alumnoLopez.agregarMateria(materiaLaboratorio);
        alumnoLopez.agregarMateria(materiaMatematicas);
        System.out.println();
        alumnoMartinez.agregarMateria(materiaIngles);
        alumnoMartinez.agregarMateria(materiaMatematicas);
        alumnoMartinez.agregarMateria(materiaLaboratorio);
        alumnoMartinez.agregarMateria(materiaLaboratorio);
        System.out.println();
        System.out.println(alumnoLopez.getNombre() + " esta inscripto en " + alumnoLopez.cantidadDeMaterias() + " materias.");
        System.out.println(alumnoMartinez.getNombre() + " esta inscripto en " + alumnoMartinez.cantidadDeMaterias() + " materias.");
    }
}
