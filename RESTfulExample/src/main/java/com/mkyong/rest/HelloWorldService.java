package com.mkyong.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/hello")
public class HelloWorldService {

    @GET

    @Path("/query")

    public Response getMsg(
                           @QueryParam("rep1") String desc,
                           @QueryParam("rep2") String tags){


        String output = "{'Age'" + desc + ": '20'}";


        return Response.status(200).entity(output + desc + tags).build();

    }


    public static List displayRecords() {
        List studentsList = new ArrayList();
        try {
            // Getting Session Object From SessionFactory
            sessionObj = buildSessionFactory().openSession();
// Getting Transaction Object From Session Object
            sessionObj.beginTransaction();
            studentsList = sessionObj.createQuery("FROM Student").list();
        } catch (Exception sqlException) {
            if (null != sessionObj.getTransaction()) {
                logger.info("\n.......Transaction Is Being Rolled Back.......\n");
                sessionObj.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if (sessionObj != null) {
                sessionObj.close();
            }
        }
        return studentsList;

    }

}