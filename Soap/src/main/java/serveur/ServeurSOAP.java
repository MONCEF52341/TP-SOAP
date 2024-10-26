package serveur;

import jakarta.xml.ws.Endpoint;
import service.ServiceStudent;

public class ServeurSOAP {
    public static void main(String[] args) {
        String endpoint="http://localhost:8082/";
        Endpoint.publish(endpoint,new ServiceStudent());
        System.out.println(endpoint);
    }
}
