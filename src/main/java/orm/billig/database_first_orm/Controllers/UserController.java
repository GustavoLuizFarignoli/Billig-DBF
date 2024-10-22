package orm.billig.database_first_orm.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import orm.billig.database_first_orm.Dtos.UsuarioDTO;
import orm.billig.database_first_orm.Entities.TipoUsuario;
import orm.billig.database_first_orm.Entities.Usuario;
import orm.billig.database_first_orm.Repositories.TipoUsuarioRepository;
import orm.billig.database_first_orm.Repositories.UsuarioRepository;

@RestController
public class UserController {
    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    TipoUsuarioRepository tipoUsuarioRepository;

    @GetMapping(path = "/getuser/{id}")
    public Object getUserById(@PathVariable("id") Integer id)
    {
        try {
            return usuarioRepository.findById(id);
        }
        catch (Exception ex){
            return ex.getMessage();
        }
    }

    @PostMapping(path = "/postuser")
    public Object saveUser(@RequestBody UsuarioDTO data_usuario)
    {
        System.out.println(data_usuario);

        try {
            Integer tipoUsuarioId = data_usuario.getTipoUsuarioId();

            // Se o tipo não existe, será retornada uma mensagem avisando o usuario
            if (!tipoUsuarioRepository.existsById(tipoUsuarioId)) return "Tipo não cadastrado! Tente novamente...";

            TipoUsuario tipoUsuario = tipoUsuarioRepository.findById(tipoUsuarioId).orElseThrow(() -> new RuntimeException("Tipo de usuário não encontrado"));
            Usuario usuario = new Usuario();

            usuario.setEmail(data_usuario.getEmail());
            usuario.setImagem(data_usuario.getImagem());
            usuario.setSenha(data_usuario.getSenha());
            usuario.setNome(data_usuario.getNome());
            usuario.setTipoUsuario(tipoUsuario);

            return usuarioRepository.save(usuario);
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }

    //  @PutMapping(path = "/updateuser/{id}")
    //  public Object updateUser(@PathVariable("id") Integer id, @RequestBody Usuario updatedUsuario) {
    //      try {
    //          Usuario user = usuarioRepository.findById(id).map(usuario -> {
    //              usuario.setNome(updatedUsuario.getNome());
    //              usuario.setEmail(updatedUsuario.getEmail());
    //              usuario.setSenha(updatedUsuario.getSenha());
    //              return usuarioRepository.save(usuario);
    //          }).orElse("Usuário não encontrado");
    //          return usuarioRepository.findById(id).map(usuario -> {
    //              usuario.setNome(updatedUsuario.getNome());
    //              usuario.setEmail(updatedUsuario.getEmail());
    //              usuario.setSenha(updatedUsuario.getSenha());
    //              return usuarioRepository.save(usuario);
    //          }).orElse("Usuário não encontrado");
    //      } catch (Exception ex) {
    //          return ex.getMessage();
    //      }
    //  }

    @DeleteMapping(path = "/deleteuser/{id}")
    public Object deleteUser(@PathVariable("id") Integer id) {
        try {
            if (usuarioRepository.existsById(id)) {
                usuarioRepository.deleteById(id);
                return "Usuário deletado com sucesso.";
            } else {
                return "Usuário não encontrado.";
            }
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }
}
