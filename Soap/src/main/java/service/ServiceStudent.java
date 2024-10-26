package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import model.Student;

import java.util.List;

@WebService(serviceName = "ServiceEtudiant")
public class ServiceStudent {
    @WebMethod(operationName = "ListEtudiants")
    public List<Student>getStudents()
    {
        return List.of(
                new Student(1,"nom1","prenom1","Homme"),
                new Student(2,"nom2","prenom2","Femme"),
                new Student(3,"nom3","prenom3","Homme"),
                new Student(4,"nom4","prenom4","Femme")
        );
    }
}
