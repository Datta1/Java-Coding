package net.morgz;
 
import static spark.Spark.get;

import java.net.ResponseCache;

import org.omg.PortableInterceptor.RequestInfo;

import spark.Request;
import spark.Response;
import spark.Route;
 
public class Class1 {
    public static void main(String[] args) {
        get(new Route("/users/:id") {
            @Override
        public Object handle(RequestInfo request, ResponseCache response) {
            return  "User: username=test, email=test@test.net";
        }        
    });
    }
}

