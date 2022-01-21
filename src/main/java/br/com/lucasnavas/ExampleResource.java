package br.com.lucasnavas;

import javax.print.attribute.standard.Media;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.*;

@Path("/hello")

public class ExampleResource {
    ArrayList<ArrayList<String>> pessoas = new ArrayList<>();

    @GET
        @Produces(MediaType.TEXT_HTML)
    public String hello(@QueryParam("name") String nome, @QueryParam("age") String idade, @QueryParam("email") String email, @QueryParam("games") String jogo) {
        ArrayList<String> arrum = new ArrayList<>();
        arrum.add(nome);
        arrum.add(idade);
        arrum.add(email);
        arrum.add(jogo);
        pessoas.add(arrum);
        return ("<link rel=\"stylesheet\" href=\"style.css\"><table class='table-full'><thead class='table-thead'><th>Nome</th><th>Idade</th><th>Email</th><th>Jogo</th></thead><tbody id='tbody' class='table-tbody'> </tbody></table>")+ ("<br></h1><a href='/'><img src='img/neymar.jpg' width='245px'><br><label class='click-text'>Clique aqui ou na imagem para voltar</label><br></a><div style='display:none' id='array'>"+pessoas+"</div><script src=\"script.js\"></script> ");
    }
}

