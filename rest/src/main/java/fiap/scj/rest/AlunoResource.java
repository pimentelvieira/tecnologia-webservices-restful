package fiap.scj.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/aluno")
public class AlunoResource {

	private static List<Aluno> listaAlunos = new ArrayList<Aluno>(Arrays.asList(new Aluno("William", 1), new Aluno("Fernanda", 2)));
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,
		MediaType.APPLICATION_XML})
	public List<Aluno> getAllAlunos() {
		return listaAlunos;
	}
	
	@GET
	@Path("/{ra}")
	@Produces({MediaType.APPLICATION_JSON,
		MediaType.APPLICATION_XML})
	public Aluno findAluno(@PathParam(value="ra") Integer ra) {
		Aluno result = null;
		for (Aluno aluno : listaAlunos) {
			if(aluno.getRa().equals(ra)) {
				result = aluno;
			}
		}
		return result;
	}
	
	@GET
	@Path("/param")
	@Produces({MediaType.APPLICATION_JSON,
		MediaType.APPLICATION_XML})
	public Aluno findAluno2(@QueryParam("ra") Integer ra) {
		Aluno result = null;
		for (Aluno aluno : listaAlunos) {
			if(aluno.getRa().equals(ra)) {
				result = aluno;
			}
		}
		return result;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createAluno(Aluno aluno) throws Exception {
		listaAlunos.add(aluno);
		return Response.created(new URI("http://localhost/rest/aluno" + aluno.getRa())).build();
	}
	
}
