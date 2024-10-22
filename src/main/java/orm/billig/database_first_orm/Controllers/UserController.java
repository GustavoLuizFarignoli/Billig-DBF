package orm.billig.database_first_orm.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import orm.billig.database_first_orm.Entities.Usuario;
import orm.billig.database_first_orm.Repositories.UsuarioRepository;

@RestController
public class UserController {
    @Autowired
    UsuarioRepository usuarioRepository;

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
    public Object saveUser(@RequestBody Usuario usuario)
    {
        try {
            return usuarioRepository.save(usuario);
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }
}
