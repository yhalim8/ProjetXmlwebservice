package ReleveWS;

import ReleveWS.Relevews;
import jakarta.xml.ws.Endpoint;

public class ServiceReleve {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/",new Relevews());
        System.out.println("web service deployé sur l'adresse http://0.0.0.0:9191/");
    }
}
