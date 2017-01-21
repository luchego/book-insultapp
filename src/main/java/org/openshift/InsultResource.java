/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openshift;

import java.util.HashMap;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@RequestScoped
@Path("/insult")
public class InsultResource {
    @GET()
    @Produces("application/json")
    public HashMap<String,String>getInsult(){
        HashMap<String,String>theInsult=new HashMap<String,String>();
        theInsult.put("insult",new InsultGenerator().generateInsult());
        return theInsult;
    }
}
