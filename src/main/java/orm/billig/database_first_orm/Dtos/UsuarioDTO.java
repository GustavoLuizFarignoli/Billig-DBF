package orm.billig.database_first_orm.Dtos;

public class UsuarioDTO {
    private String nome;
    private String senha;
    private String email;
    private String imagem;
    private Integer tipoUsuarioId;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getImagem() { return imagem; }
    public void setImagem(String imagem) { this.imagem = imagem; }

    public Integer getTipoUsuarioId() { return tipoUsuarioId; }
    public void setTipoUsuarioId(Integer tipoUsuarioId) { this.tipoUsuarioId = tipoUsuarioId; }
}
