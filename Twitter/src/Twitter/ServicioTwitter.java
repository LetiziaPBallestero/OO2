package Twitter;

import java.util.ArrayList;
import java.util.List;

public class ServicioTwitter {
	private List<Usuario> usuarios;

	public ServicioTwitter() {
		this.usuarios = new ArrayList<>();
	}

	public void newUser(String name) {
		if (thereIsNotThisUserName(name)) {
			Usuario u = new Usuario(name);
			this.usuarios.add(u);
		}
	}

	public int getCantUsers() {
		return usuarios.size();
	}

	public void eliminarUsuario(String name) {
		Usuario usuarioAux = lookForThisName(name);
		if (usuarioAux != null) {
			this.usuarios.remove(usuarioAux);
			usuarioAux.eliminarTweets();
			usuarioAux = null;
			System.gc();
		}

	}

	public Usuario lookForThisName(String n) {
		return usuarios.stream().filter(u -> u != null).filter(u -> u.getScreenName().equals(n)).findFirst()
				.orElse(null);
	}

	public boolean thereIsNotThisUserName(String n) {
		return !(this.usuarios.stream().anyMatch(usuario -> usuario.getScreenName().equals(n)));
		// retornar true si NO HAY un usuario con este nombre
	}
}
